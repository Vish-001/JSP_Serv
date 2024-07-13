import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name="Loged",urlPatterns = "/Loged")

public class login extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("uname");
        String password = req.getParameter("pass");
        Logindoi obj=new Logindoi();
        if(obj.doCheck(username,password))
        {
            HttpSession session= req.getSession();
            session.setAttribute(username,"uname");
            res.sendRedirect("/welcome.jsp");
        }
        else
        {
            res.sendRedirect("/index.jsp");
        }
    }
}
