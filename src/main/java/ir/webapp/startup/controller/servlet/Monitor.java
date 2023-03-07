package ir.webapp.startup.controller.servlet;

import ir.webapp.startup.controller.session.SessionManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/monitor")
public class Monitor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------------------------------------------------");
        SessionManager.sessionMap.forEach((k, v) -> System.out.println("[Http] " + k.getId()));
        System.out.println("----------------------------------------------------");
    }
}
