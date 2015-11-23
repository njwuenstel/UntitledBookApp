package entity;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Sun Prairie PC on 11/22/2015.
 */
public class HaveReadBean {

    private int userId;
    private int workId;

    /* no argument constructor */
    public HaveReadBean() {}

    public HaveReadBean(int userId, int workId) {
        this.userId = userId;
        this.workId = workId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        writer.println("User ID: " + getUserId());
        writer.println("Work ID: " + getWorkId());

        return stringWriter.toString();
    }


}

