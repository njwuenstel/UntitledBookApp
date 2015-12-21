package servlet;

import entity.UserBean;
import entity.WorkBean;
import goodreads.service.GoodreadsServiceGateway;
import util.BeanUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Extend HttpServlet class
@WebServlet(
        name = "bookDisplay",
        urlPatterns = { "/bookdisplay" }
)
public class BookDisplayServlet extends HttpServlet {

    GoodreadsServiceGateway gateway;
    BeanUtil beanUtil;

    public void init() throws ServletException {

        gateway = new GoodreadsServiceGateway();
        beanUtil = new BeanUtil();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String isbnEntry = request.getParameter("isbnEntry");
        String submitType = request.getParameter("isbnFormSubmit");
        WorkBean isbnBean = gateway.getBookFromIsbn(isbnEntry);

        if(submitType == null) {
            //no button has been selected

        } else if(submitType.equals("bookInfo")) {

            /* add bean to request */
            request.setAttribute("isbn", isbnEntry );
            request.setAttribute("isbnBean", isbnBean );

            /* forward the request to bookInfo */
            request.getRequestDispatcher("search/bookInfo.jsp").forward(request, response);

        } else if(submitType.equals("addToHaveReads")) {

            /* addToHaveReads button was pressed */
            UserBean user = (UserBean) request.getSession().getAttribute("user");

            /*  */
            beanUtil.addWorksReadToUser(user.getUserAlias(), isbnBean);
            request.getRequestDispatcher("reload").forward(request, response);


        } else {
            //someone has altered the HTML and sent a different value!
        }

/*        if (bla != null && bla != "") {
            request.getSession().setAttribute("bla", bla);
            response.sendRedirect("helloworld");
        } else if (search != null && search != "") {
            request.getSession().setAttribute("search", search);
            response.sendRedirect("helloworld");
        } else {
            request.setAttribute("error", "Unknown user, please try again");
            request.getRequestDispatcher("/bookInfo.jsp").forward(request, response);
        }*/
    }

    public void destroy() {
        // do nothing.
    }
}