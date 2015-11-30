package util;

import org.apache.log4j.Logger;

/**
 * Created by me on 10/5/2015.
 */
public final class BookieLogger {

    private BookieLogger() {}

        // not totally sure how to do this yet but would to return loggers by input string.
    private final static Logger serviceLog = Logger.getLogger("bookie.services");
    private final static Logger webLog = Logger.getLogger("bookie.web");
    private final static Logger databaseLog = Logger.getLogger("bookie.database");
    private final static Logger xmlLog = Logger.getLogger("bookie.xml");

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