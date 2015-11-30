

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;

/**
 * @author nwuenstel
 *
 * Adds a new employee to the application
 *
 */
@WebServlet(
        name = "employeeAddJspPageDisplayServlet",
        urlPatterns = { "/addEmployee" }
)
public class SampleServlet extends HttpServlet {

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
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
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
//        // extract employee data and add it to employee fields array
//        setEmployeeFields(request, employeeFields);
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
//    public void setEmployeeFields(HttpServletRequest request,
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