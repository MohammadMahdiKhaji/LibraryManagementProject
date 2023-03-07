package ir.webapp.startup.controller.servlet;
//
//import ir.webapp.startup.controller.email.EmailUtil;
//import jakarta.servlet.ServletContext;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//// TODO: 1/10/2023 set SMTP server settings in web.xml
//
//@WebServlet(urlPatterns = {"/forgotPassword", "/forgotPassword/*"}, name = "forgotPasswordServlet")
//public class ForgotPasswordServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    private String host;
//    private String port;
//    private String email;
//    private String name;
//    private String pass;
//
//    public void init() {
//        // reads SMTP server setting from web.xml file
//        ServletContext context = getServletContext();
//        host = context.getInitParameter("host");
//        port = context.getInitParameter("port");
//        email = context.getInitParameter("email");
//        name = context.getInitParameter("name");
//        pass = context.getInitParameter("pass");
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String page = "forgotpassword.jsp";
//        request.getRequestDispatcher(page).forward(request, response);
//
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String recipient = request.getParameter("email");
//        String subject = "Your Password has been reset";
//
//        String newPassword = PersonController.resetPassword(recipient);
//
//        String content = "Hi, this is your new password: " + newPassword;
//        content += "\nNote: for security reason, "
//                + "you must change your password after logging in.";
//
//        String message = "";
//
//        try {
//            EmailUtil.sendEmail(host, port, email, name, pass,
//                    recipient, subject, content);
//            message = "Your password has been reset. Please check your e-mail.";
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            message = "There were an error: " + ex.getMessage();
//        } finally {
//            request.setAttribute("message", message);
//        }
//    }
//
//}
