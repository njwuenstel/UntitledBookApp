package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Extend HttpServlet class
@WebServlet(
        name = "serverTemplate",
        urlPatterns = { "/helloworld" }
)
public class ServletTemplate extends HttpServlet {

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

        String bla = request.getSession().getAttribute("bla").toString();

        if (bla != null) {
            message = bla;
        }

        // Actual logic goes here.
        //PrintWriter out = response.getWriter();
        //out.println("<h1>" + message + "</h1>");
        request.getRequestDispatcher("sample.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bla = request.getParameter("bla");

        if (bla != null) {
            request.getSession().setAttribute("bla", bla);
            //response.sendRedirect("home");
            response.sendRedirect("helloworld");
        }
        else {
            request.setAttribute("error", "Unknown user, please try again");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    public void destroy() {
        // do nothing.
    }
}