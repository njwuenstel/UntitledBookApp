import org.apache.log4j.Logger;

/**
 * Created by me on 10/5/2015.
 */
public class BookieLogger {

    // not totally sure how to do this yet but would to return loggers by input string.
    Logger services = Logger.getLogger("bookie.services");
    Logger web = Logger.getLogger("bookie.web");
    Logger database = Logger.getLogger("bookie.database");

}
