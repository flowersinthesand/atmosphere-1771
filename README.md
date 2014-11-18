Type `mvn clean package` and deploy to servers.

Tomcat 8.0.15

```
18-Nov-2014 12:00:38.696 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in 1855 ms
method: GET
AtmosphereResource{
         uuid=ac4deab0-2831-496f-88cc-5f2913e957ea,
         transport=WEBSOCKET,
         isInScope=true,
         isResumed=false,
         isCancelled=false,
         isSuspended=false,
         broadcaster=/ size: 0,
         isClosedByClient=false,
         isClosedByApplication=false,
         action=Action{timeout=-1, type=CREATED}}
java.lang.RuntimeException: should not happen
        at simple.Bootstrap$1.onRequest(Bootstrap.java:30)
        at org.atmosphere.cpr.AsynchronousProcessor.action(AsynchronousProcessor.java:197)
        at org.atmosphere.cpr.AsynchronousProcessor.suspended(AsynchronousProcessor.java:104)
        at org.atmosphere.container.Servlet30CometSupport.service(Servlet30CometSupport.java:66)
        at org.atmosphere.cpr.AtmosphereFramework.doCometSupport(AtmosphereFramework.java:2069)
        at org.atmosphere.websocket.DefaultWebSocketProcessor.dispatch(DefaultWebSocketProcessor.java:568)
        at org.atmosphere.websocket.DefaultWebSocketProcessor$3.run(DefaultWebSocketProcessor.java:330)
        at org.atmosphere.util.VoidExecutorService.execute(VoidExecutorService.java:101)
        at org.atmosphere.websocket.DefaultWebSocketProcessor.dispatch(DefaultWebSocketProcessor.java:325)
        at org.atmosphere.websocket.DefaultWebSocketProcessor.invokeWebSocketProtocol(DefaultWebSocketProcessor.java:422)
        at org.atmosphere.container.JSR356Endpoint$1.onMessage(JSR356Endpoint.java:199)
        at org.atmosphere.container.JSR356Endpoint$1.onMessage(JSR356Endpoint.java:196)
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:393)
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:494)
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:289)
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:130)
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:60)
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler$WsReadListener.onDataAvailable(WsHttpUpgradeHandler.java:203)
        at org.apache.coyote.http11.upgrade.AbstractServletInputStream.onDataAvailable(AbstractServletInputStream.java:194)
        at org.apache.coyote.http11.upgrade.AbstractProcessor.upgradeDispatch(AbstractProcessor.java:95)
        at org.apache.coyote.AbstractProtocol$AbstractConnectionHandler.process(AbstractProtocol.java:653)
        at org.apache.coyote.http11.Http11NioProtocol$Http11ConnectionHandler.process(Http11NioProtocol.java:222)
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1556)
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.run(NioEndpoint.java:1513)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
        at java.lang.Thread.run(Thread.java:745)
```

Tomcat 7.0.57

```
Nov 18, 2014 12:01:44 PM org.apache.catalina.startup.Catalina start
INFO: Server startup in 2461 ms
method: GET
AtmosphereResource{
         uuid=2c94e30f-c7c9-4e94-b169-ad8828ddf203,
         transport=WEBSOCKET,
         isInScope=true,
         isResumed=false,
         isCancelled=false,
         isSuspended=false,
         broadcaster=/ size: 0,
         isClosedByClient=false,
         isClosedByApplication=false,
         action=Action{timeout=-1, type=CREATED}}
method: POST
AtmosphereResource{
         uuid=2c94e30f-c7c9-4e94-b169-ad8828ddf203,
         transport=WEBSOCKET,
         isInScope=true,
         isResumed=false,
         isCancelled=false,
         isSuspended=false,
         broadcaster=/ size: 0,
         isClosedByClient=false,
         isClosedByApplication=false,
         action=Action{timeout=-1, type=SUSPEND_MESSAGE}}
 ```
 
Jetty 9.2.5.v20141112

```
2014-11-18 12:05:08.270:INFO:oejs.Server:main: Started @3682ms
method: GET
AtmosphereResource{
         uuid=1ae47089-ee95-4cab-9ad3-3d7eef0d5239,
         transport=WEBSOCKET,
         isInScope=true,
         isResumed=false,
         isCancelled=false,
         isSuspended=false,
         broadcaster=/ size: 0,
         isClosedByClient=false,
         isClosedByApplication=false,
         action=Action{timeout=-1, type=CREATED}}
method: POST
AtmosphereResource{
         uuid=1ae47089-ee95-4cab-9ad3-3d7eef0d5239,
         transport=WEBSOCKET,
         isInScope=true,
         isResumed=false,
         isCancelled=false,
         isSuspended=false,
         broadcaster=/ size: 0,
         isClosedByClient=false,
         isClosedByApplication=false,
         action=Action{timeout=-1, type=SUSPEND_MESSAGE}}
 ```