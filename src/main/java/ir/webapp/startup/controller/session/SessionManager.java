package ir.webapp.startup.controller.session;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import org.jboss.weld.context.http.Http;

import java.util.HashMap;
import java.util.Map;


public class SessionManager {
    public static Map<HttpSession, Session> sessionMap = new HashMap<>();

    public static void addHttpSession(HttpSession httpSession) {
        sessionMap.put(httpSession, null);
    }

    public static void addWebSocketSession(HttpSession httpSession,Session Session) {
        sessionMap.put(httpSession, Session);
    }

    public static boolean validateHttpSession(HttpSession httpSession) {
        return sessionMap.containsKey(httpSession);
    }

    public static boolean validateWebSocketSession(Session session) {
        return sessionMap.containsValue(session);
    }

    public static Session getWebSocketSession(HttpSession httpSession) {
        return sessionMap.get(httpSession);
    }
}
