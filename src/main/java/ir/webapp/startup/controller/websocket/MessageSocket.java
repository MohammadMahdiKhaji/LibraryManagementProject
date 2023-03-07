package ir.webapp.startup.controller.websocket;

import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@ServerEndpoint(value = "/messagendpoint", configurator = MessageSocketConfiguration.class)
public class MessageSocket {

    private static HashMap<HttpSession, Session> sessionList = new HashMap<>();

    @OnOpen
    public void onOpen(Session session, EndpointConfig config){
        System.out.println("Socket Opened");
        HttpSession httpSession = (HttpSession) session.getUserProperties().get(HttpSession.class.getName());
        sessionList.put(httpSession,session);
        System.out.println("Session :"+httpSession.getId() );
        System.out.println("Socket : "+session.getId());
    }

    @OnClose
    public void onClose(Session session){
        System.out.println("Socket Closed");
        ( (HttpSession) session.getUserProperties().get(HttpSession.class.getName())).invalidate();
    }

    @OnMessage
    public void onMessage(String message){
        System.out.println("Message : " + message);
    }

    @OnError
    public void onError(Throwable e){
        System.out.println("Error");
    }

    public static void send(HttpSession httpSession, String message) throws IOException {
        sessionList.get(httpSession).getBasicRemote().sendText(message);
    }

    public static void broadCast(String message) throws IOException {
        for (Map.Entry<HttpSession, Session> httpSessionSessionEntry : sessionList.entrySet()) {
            httpSessionSessionEntry.getValue().getBasicRemote().sendText(message);
        }
    }
}
