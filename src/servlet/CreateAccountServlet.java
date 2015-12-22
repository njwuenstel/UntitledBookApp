package servlet;

import entity.UserBean;
import org.apache.log4j.Logger;
import persistence.UserBeanDao;
import util.BeanUtil;
import util.BookingtonLoggers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "createAccount",
        urlPatterns = { "/createaccount" }
)
public class CreateAccountServlet extends HttpServlet {

    static Logger log = BookingtonLoggers.getWebLog();

    static String CONFIRMATION_URL = "account/accountConfirmation.jsp";
    static String CREATE_ACCOUNT_URL = "account/createAccount.jsp";

    private String errorMessage;
    private UserBeanDao userBeanDao = new UserBeanDao();

    public void init() throws ServletException {
        // Do required initialization
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

        try {
            /* validate unique user name */
            UserBean duplicateBean = userBeanDao.getUserByAlias(userAlias);

            /* make sure userAlias isn't in the list */
            if(duplicateBean != null) {
                errorMessage = "User Name: '" + userAlias + "' already exists. Please choose a different User Name.";

            } else {
                /* create new user and user role */
                BeanUtil beanUtil = new BeanUtil();

                beanUtil.addNewAppUser(firstName, lastName, userAlias, userPassword, userEmail);
                log.info("Successfully added new user: " + userAlias);

                /* redirect to confirmation screen */
                request.getSession().setAttribute("firstName", firstName);
                request.getRequestDispatcher(CONFIRMATION_URL).forward(request, response);

            }
        // error handling for invalid inputs
        } catch (Exception e) {
            errorMessage = "Oh no. Something is not quite right. Try something else.";
            log.error("Exception thrown attempting to add user " + userAlias, e );
        }

        if(errorMessage != null) {
            request.getSession().setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher(CREATE_ACCOUNT_URL).forward(request, response);
        }
    }

    public void destroy() {
        // do nothing.
    }
}