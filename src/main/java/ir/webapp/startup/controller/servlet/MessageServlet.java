package ir.webapp.startup.controller.servlet;

import com.google.gson.Gson;
import ir.webapp.startup.controller.websocket.MessageSocket;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "message", value = "/message")
public class MessageServlet extends HttpServlet {

    private String message;

//    public void init() {
//        message = null;
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        message++;
        message = request.getParameter("message");
        request.getSession().setAttribute("message",message);
        PrintWriter out = response.getWriter();
        out.write("<h1>Sent: "+message+"</h1>");
//        MessageSocket.send(request.getSession(), String.valueOf(message));
        MessageSocket.broadCast(new Gson().toJson(message));
    }
}
