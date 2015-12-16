package util;

import org.apache.log4j.Logger;

/**
 * Created by me on 10/5/2015.
 */
public final class BookingtonLoggers {

    private BookingtonLoggers() {}

    private final static Logger serviceLog = Logger.getLogger("bookington.services");
    private final static Logger webLog = Logger.getLogger("bookington.web");
    private final static Logger databaseLog = Logger.getLogger("bookington.database");
    private final static Logger xmlLog = Logger.getLogger("bookington.xml");

    public static Logger getServiceLog() {
        return serviceLog;
    }

    public static Logger getWebLog() {
        return webLog;
    }

    public static Logger getDatabaseLog() {
        return databaseLog;
    }

    public static Logger getXmlLog() {
        return xmlLog;
    }
}