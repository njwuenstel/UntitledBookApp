package entity;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Sun Prairie PC on 11/22/2015.
 */
public class UserBean {

    private int userId;
    private String firstName;
    private String lastName;

    /* no argument constructor */
    public UserBean() {}

    public UserBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        writer.println("User ID: " + getUserId());
        writer.println("First Name: " + getFirstName());
        writer.println("Last Name: " + getLastName());
        writer.println("Full Name: " + getFirstName() + " " + getLastName());

        return stringWriter.toString();
    }


}

