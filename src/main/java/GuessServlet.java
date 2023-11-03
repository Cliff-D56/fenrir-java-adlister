import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/guess.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        String guess = request.getParameter("guess");
        HttpSession session = request.getSession();
        request.setAttribute(guess,session.getAttribute("guess"));
        Random random = new Random();
        String hi = String.valueOf(random.nextInt(3)+1);
        if (guess.equals(hi)){
            response.sendRedirect("/correct");
        }else {
            response.sendRedirect("/incorrect");
        }
    }
}
