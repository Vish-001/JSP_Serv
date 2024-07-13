//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//@WebServlet("/Loged")
//public class login extends HttpServlet
//{
//    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        String User=req.getParameter("uname");
//        String Pass=req.getParameter("pass");
//        logindoi obj=new logindoi();
//        try {
//            if(obj.doCheck(User,Pass))
//            {
//                HttpSession session = req.getSession();
//                session.setAttribute("User",User);
//                res.sendRedirect("welcome.jsp");
//            }
//            else
//            {
//                res.sendRedirect("login.jsp");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
