import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        HttpSession session = request.getSession();
        String color = request.getParameter("color");
        session.setAttribute("color",color);
        request.getRequestDispatcher("/WEB-INF/viewcolor.jsp").forward(request,response);
    }

}
