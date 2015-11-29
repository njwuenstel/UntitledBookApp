package entity;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Sun Prairie PC on 11/28/2015.
 */
public class UserRoleBean {

    private int userId;
    private String userAlias;
    private String roleName;

    /* no argument constructor */
    public UserRoleBean() {}

    /* Constructor with all fields assigned */
    public UserRoleBean(String userAlias, String roleName) {

        this.userAlias = userAlias;
        this.roleName =  roleName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        writer.println("User Alias: " + getUserAlias());
        writer.println("Role Name: " + getRoleName());

        return stringWriter.toString();
    }
}
