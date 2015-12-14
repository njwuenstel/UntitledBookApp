package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author nwuenstel
 *
 * Adds a new appuser to the database
 *
 * 32323232323232323232323232322
 */
@WebServlet(
        name = "appUserAddJspPageDisplayServlet",
        urlPatterns = { "/addAppUser" }
)
public class AddAppUserServlet extends HttpServlet {

//    private EmployeeDirectory employeeDirectory;
//
//    public void init() {
//
//        ServletContext context = getServletContext();
//        // get EmployeeDirectory the ServletContext
//        employeeDirectory =
//                (EmployeeDirectory)context.getAttribute("employeeDirectory");
//
//    }
//
//    public void doPost(HttpSer-+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++vletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        HttpSession session = request.getSession();
//        // address of add jsp
//        String url = "/java112/employeeAdd.jsp";
//        // message from addEmployeeRecord method
//        String addMessage;
//        // instantiate employeeFields array
//        String[] employeeFields = new String[7];
//
//        // extract user data and add it to appuser fields array
//        setAppUserFields(request, employeeFields);
//
//        // call addEmployeeRecord method and get message
//        addMessage = employeeDirectory.addEmployeeRecord(employeeFields);
//
//        // add the returned message to the session
//        // Add the returned message to the session ++remove this
//        session.setAttribute("project4AddMessage", addMessage);
//
//        // redirect to employeeAdd page
//        response.sendRedirect(url);
//
//
//
//    }
//
//    public void setAppUserFields(HttpServletRequest request,
//                                  String[] fields) {
//
//        // set employee attributes
//        fields[0] = "0";
//        fields[1] = request.getParameter("firstName");
//        fields[2] = request.getParameter("lastName");
//        fields[3] = request.getParameter("ssn");
//        fields[4] = request.getParameter("department");
//        fields[5] = request.getParameter("roomNumber");
//        fields[6] = request.getParameter("phoneNumber");
//
//        log(fields[6]);
//
//    }

}