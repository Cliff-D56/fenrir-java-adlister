import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads ads = DaoFactory.getAdsDao();
        List<Ad> list = ads.all();
        request.setAttribute("viewlist",list);
        request.getRequestDispatcher("/ads/index.jsp").forward(request,response);
    }
}
