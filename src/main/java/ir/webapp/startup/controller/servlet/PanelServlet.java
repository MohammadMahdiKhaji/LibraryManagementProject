package ir.webapp.startup.controller.servlet;

import com.google.gson.Gson;
import ir.webapp.startup.controller.app.LibraryController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.InputStreamReader;

@WebServlet(urlPatterns = "/panel", name = "panel")
public class PanelServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        System.out.println(req.getParameter("bookId"));
        System.out.println(session.getAttribute("memberId"));
        System.out.println(LibraryController.getLibraryController().borrowBook(
                Long.parseLong(req.getParameter("bookId")),
                Long.parseLong(String.valueOf(session.getAttribute("memberId")))));
        System.out.println("POST");
        System.out.println("Get : "+req.getRemoteAddr());
        System.out.println("Get : "+req.getSession().getId());
//        req.getRequestDispatcher("panel.jsp").forward(req, resp);
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        session.setAttribute("bookList", LibraryController.getLibraryController().findAllBook());
        session.setAttribute("bookBorrowedList", LibraryController.getLibraryController().findAllBookBorrowed(Long.parseLong(String.valueOf(session.getAttribute("memberId")))));
        System.out.println(LibraryController.getLibraryController().findAllBookBorrowed(Long.parseLong(String.valueOf(session.getAttribute("memberId")))));
        System.out.println("GET");
        System.out.println("Get : "+req.getRemoteAddr());
        System.out.println("Get : "+req.getSession().getId());
        req.getRequestDispatcher("panel.jsp").forward(req, resp);
    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        System.out.println(req.getParameter("bookId"));
        System.out.println(session.getAttribute("memberId"));
        System.out.println(LibraryController.getLibraryController().borrowBook(
                Long.parseLong(req.getParameter("bookId")),
                Long.parseLong(String.valueOf(session.getAttribute("memberId")))));
        doGet(req, resp);
    }
}
