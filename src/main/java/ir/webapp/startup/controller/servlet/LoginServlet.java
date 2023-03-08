package ir.webapp.startup.controller.servlet;

import ir.webapp.startup.controller.app.TokenController;
import ir.webapp.startup.controller.app.UserAccessController;
import ir.webapp.startup.controller.session.SessionManager;
import ir.webapp.startup.model.entity.enumeration.Classification;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login", "/login/*"}, name = "loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (UserAccessController.getUserAccessController().login(req.getParameter("username"), req.getParameter("password"))) {
//            if (UserAccessController.getUserAccessController().checkClassification(req.getParameter("username"), req.getParameter("password"))) {
//                resp.setHeader("token", TokenController.getTokenController().save(req.getParameter("username"), req.getParameter("password")).getToken());
            HttpSession session = req.getSession();
//                session.setAttribute("token", TokenController.getTokenController().save(req.getParameter("username"), req.getParameter("password")).getToken());
            session.setAttribute("memberId", UserAccessController.getMemberId(req.getParameter("username"), req.getParameter("password")));
            SessionManager.addHttpSession(req.getSession());
            doGet(req, resp);
        } else {
            resp.sendRedirect("login.jsp");
        }
//        }else {
//            resp.sendRedirect("login.jsp");
//        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Post
//        ServletContext servletContext = getServletContext();
//        RequestDispatcher requestDispatcher =
//                servletContext
//                        .getRequestDispatcher("/panel");requestDispatcher.forward(req, resp);
        resp.sendRedirect("/panel");
    }
}
