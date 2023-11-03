import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/correct")
public class CorrectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/correct.jsp").forward(request,response);
    }
}
