package simple;

import java.io.IOException;
import java.net.URI;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.AtmosphereResource.TRANSPORT;
import org.atmosphere.cpr.AtmosphereServlet;
import org.atmosphere.handler.AtmosphereHandlerAdapter;

@SuppressWarnings("serial")
@WebServlet(value = "/test", loadOnStartup = 0)
public class Bootstrap extends AtmosphereServlet {
    @Override
    public void init(ServletConfig sc) throws ServletException {
        super.init(sc);
        framework.addAtmosphereHandler("/", new AtmosphereHandlerAdapter() {
            @Override
            public void onRequest(AtmosphereResource resource) throws IOException {
                if (!(resource.transport() == TRANSPORT.WEBSOCKET)) {
                    new RuntimeException("should not happen").printStackTrace();
                } else {
                    System.out.println("method: " + resource.getRequest().getMethod());
                    System.out.println(resource);
                }
            }
        });
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                final WebSocketContainer container = ContainerProvider.getWebSocketContainer();
                try {
                    Session session = container.connectToServer(TestEndpoint.class, URI.create("ws://localhost:8080/simple/test"));
                    session.getBasicRemote().sendText("Hi");
                } catch (DeploymentException | IOException e) {
                    e.printStackTrace();
                }
            }
        })
        .start();
    }
    
    @ClientEndpoint
    public static class TestEndpoint {}
}
