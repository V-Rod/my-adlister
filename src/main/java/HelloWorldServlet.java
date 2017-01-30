import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/hello"}) //urlPatterns is a set of paths
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // This is the header of the HTTP message telling the browser of the client
                                        // the content type its sending...in this case its a web page

        String name = request.getParameter("name");
        PrintWriter writer = response.getWriter();
        if (name != null) {
            writer.println("<h1>Hello " + name + "</h1>");
        } else {
            writer.println("<h1>Hello World!</h1>");
        }
    }
}

