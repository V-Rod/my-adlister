import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by V-Rod on 1/31/17.
 */
@WebServlet(name="AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // make a list of all the Ad objects
        List<Ad> ads = DaoFactory.getAdsDao().all();

        // assign that variable tothe data sent to the view
        req.setAttribute("ads", ads);

        // render the view
        req.getRequestDispatcher("ads/index.jsp").forward(req, resp);

    }
}
