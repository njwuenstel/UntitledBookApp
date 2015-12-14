package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Extend HttpServlet class
@WebServlet(
        name = "createAccount",
        urlPatterns = { "/createaccount" }
)
public class NewUserServlet extends HttpServlet {

    private String errorMessage;


    public void init() throws ServletException {
        // Do required initialization
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        String bla = request.getSession().getAttribute("bla").toString();

//        if (bla != null) {
//            message = bla;
//        }

        // Actual logic goes here.
        //PrintWriter out = response.getWriter();
        //out.println("<h1>" + message + "</h1>");
        request.getRequestDispatcher("sample.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                            throws ServletException, IOException {

        errorMessage = null;
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userAlias = request.getParameter("userAlias");
        String userPassword = request.getParameter("userPassword");
        String userEmail = request.getParameter("userEmail");

        /* validate form entry */
        //TODO finish validation
        if(firstName == "") {
            errorMessage = "First Name is a required field";
            //request.getSession().setAttribute("error", errorMessage);
            //response.sendRedirect("home");
            //response.sendRedirect("helloworld");
        } else if(lastName == "") {
            errorMessage = "Last Name is a required field";
            //request.getSession().setAttribute("error", errorMessage);

        }

        if(errorMessage != null) {
            request.getSession().setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("/account/createAccount.jsp").forward(request, response);

        } else {
            //TODO
            /* create UserBean and add to db */

            /* redirect to confirmation screen */
            request.getRequestDispatcher("account/accountConfirmation.jsp").forward(request, response);;
        }






    }

    public void destroy() {
        // do nothing.
    }
}