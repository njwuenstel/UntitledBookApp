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
    private String userAlias;
    private String userPassword;

    /* no argument constructor */
    public UserBean() {}

    public UserBean(String firstName, String lastName,
                          String userAlias, String userPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAlias = userAlias;
        this.userPassword = userPassword;
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

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        writer.println("User ID: " + getUserId());
        writer.println("First Name: " + getFirstName());
        writer.println("Last Name: " + getLastName());
        writer.println("Full Name: " + getFirstName() + " " + getLastName());
        writer.println("User Alias: " + getUserAlias());
        writer.println("User Password: not telling");

        return stringWriter.toString();
    }


}

