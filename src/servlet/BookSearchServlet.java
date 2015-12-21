package servlet;

import entity.WorkBean;
import goodreads.service.GoodreadsServiceGateway;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

// Extend HttpServlet class
@WebServlet(
        name = "bookSearch",
        urlPatterns = { "/booksearch" }
)
public class BookSearchServlet extends HttpServlet {

    private String search;
    private GoodreadsServiceGateway gateway;

    public void init() throws ServletException {
        // Do required initialization
        gateway = new GoodreadsServiceGateway();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        search = request.getParameter("search");

        if (search == null || search.trim().isEmpty()) {

            // add error and re-route
            request.setAttribute("errorMessage", "Search should not be blank");
            request.getRequestDispatcher("bookington").forward(request, response);

        } else {

            // try to call service and post up search result
            ArrayList<WorkBean> searchResults = gateway.searchBook(search);
            // add results to request
            request.setAttribute("searchResults", searchResults);
            //response.sendRedirect("home");
            request.getRequestDispatcher("search/searchResults.jsp").forward(request, response);
        }
    }

}