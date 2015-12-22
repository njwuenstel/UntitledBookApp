package servlet;

import org.apache.log4j.Logger;
import util.BookingtonLoggers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Extend HttpServlet class
@WebServlet(
        name = "logout",
        urlPatterns = { "/logout" }
)
public class LogoutServlet extends HttpServlet {

    static Logger log = BookingtonLoggers.getWebLog();

    private String message;

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        /* clears all session variables */
        request.getSession().invalidate();
        request.logout();
        log.info("User successfully logged out");
        request.getRequestDispatcher("/logout.jsp").forward(request, response);
    }

}