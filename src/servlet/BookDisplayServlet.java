package servlet;

import entity.WorkBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Extend HttpServlet class
@WebServlet(
        name = "bookDisplay",
        urlPatterns = { "/book" }
)
public class BookDisplayServlet extends HttpServlet {

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

        /* get */
        String workId = request.getParameter("book");

        //WorkBean workBean = request.getSession().setAttribute("search", search);




//        String bla = request.getSession().getAttribute("bla").toString();
//        String search = request.getSession().getAttribute("search").toString();

/*        if (bla != null) {
            message = bla;
        }
        if (search != null) {
            message = search;
        }*/


        // Actual logic goes here.
        //PrintWriter out = response.getWriter();
        //out.println("<h1>" + message + "</h1>");
        request.getRequestDispatcher("/sample.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bla = request.getParameter("bla");
        String search = request.getParameter("search");

        if (bla != null && bla != "") {
            request.getSession().setAttribute("bla", bla);
            response.sendRedirect("helloworld");
        } else if (search != null && search != "") {
            request.getSession().setAttribute("search", search);
            response.sendRedirect("helloworld");
        } else {
            request.setAttribute("error", "Unknown user, please try again");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    public void destroy() {
        // do nothing.
    }
}