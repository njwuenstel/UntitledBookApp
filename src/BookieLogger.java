import org.apache.log4j.Logger;

/**
 * Created by me on 10/5/2015.
 */
public class BookieLogger {

    // not totally sure how to do this yet but would to return loggers by input string.
    protected final static Logger services = Logger.getLogger("bookie.services");
    protected final static Logger web = Logger.getLogger("bookie.web");
    protected final static Logger database = Logger.getLogger("bookie.database");
    protected final static Logger xml = Logger.getLogger("bookie.xml");

}
