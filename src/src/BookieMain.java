package src;

import org.apache.log4j.Logger;

/**
 * Created by Sun Prairie PC on 10/5/2015.
 */
public class BookieMain {

    public static void main(String[] args) {

        BookieLogger bl = new BookieLogger();
        Logger webLog = bl.web;
        Logger servicesLog = bl.services;

    }
}
