package servlet;

import entity.UserBean;
import persistence.UserBeanDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Extend HttpServlet class
@WebServlet(
        name = "bookingtonReload",
        urlPatterns = { "/reload" }
)
public class BookingtonReloadServlet extends HttpServlet {

    public void init() throws ServletException {
        // Do required initialization
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        String userName = request.getUserPrincipal().getName();
        UserBeanDao userBeanDao = new UserBeanDao();
        UserBean user = userBeanDao.getUserByAlias(userName);

        if (user != null) {

            request.getSession().setAttribute("user", user);
            response.sendRedirect("/bookington.jsp");

        } else {
            request.setAttribute("errorMessage", "User: " + userName + " was not found. Please try again");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    public void destroy() {
        // do nothing.
    }
}