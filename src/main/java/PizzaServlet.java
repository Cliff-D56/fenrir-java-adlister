import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pizza-order.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String Crust = request.getParameter("crust");
        String Sauce = request.getParameter("sauce");
        String Size = request.getParameter("size");
        String[] Toppings = request.getParameterValues("toppings");
        String Address= request.getParameter("address");
        System.out.println(Crust);
        System.out.println(Sauce);
        System.out.println(Size);
        for (String topping:Toppings
             ) {
            System.out.println(topping);
        }
//        System.out.println(Toppings);
        System.out.println(Address);
        response.sendRedirect("/pizza-order");
    }
}
