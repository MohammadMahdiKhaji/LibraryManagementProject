package ir.webapp.startup.controller.servlet;

import ir.webapp.startup.controller.app.UserAccessController;
import ir.webapp.startup.model.entity.enumeration.Classification;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = {"/signup", "/signup/*"}, name = "signupServlet")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(UserAccessController.getUserAccessController().save(
//                req.getParameter("username"),
//                req.getParameter("password"),
//                req.getParameter("firstname"),
//                req.getParameter("lastname"),
//                req.getParameter("email"),
//                Date.valueOf(req.getParameter("birthdate")),
//                req.getParameter("city"),
//                Classification.Client));
        resp.sendRedirect("/login");
    }
}
