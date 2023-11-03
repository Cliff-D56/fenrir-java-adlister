import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        TODO: SEND request to a JSP file
        request.getRequestDispatcher("/WEB-INF/pickcolor.jsp").forward(request,response);
//        TODO: SEND response to another servlet
//        response.sendRedirect("/pickcolor");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String color = request.getParameter("color");
        HttpSession session = request.getSession();
        request.setAttribute("color",session.getAttribute("color"));
        request.getRequestDispatcher("/WEB-INF/viewcolor.jsp");
    }
}
