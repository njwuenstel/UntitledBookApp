package goodreads.service;

import entity.WorkBean;
import goodreads.service.xjc.booksearch.BookSearchResponseType;
import org.apache.log4j.Logger;
import util.BookieLogger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Sun Prairie PC on 11/7/2015.
 */
public class GoodreadsServiceGateway {

    Logger log = BookieLogger.getServiceLog();

    GoodreadsSearchUtil searchUtil = new GoodreadsSearchUtil();
    GoodreadsServiceMapper mapper = new GoodreadsServiceMapper();
    GoodreadsUnmarshallers unmarshaller = new GoodreadsUnmarshallers();


    /**
     *
     *
     */
    public ArrayList<WorkBean> searchBook(String search) {

        ArrayList<WorkBean> bookBeanList = new ArrayList<>();

        try {

            URL url = searchUtil.getSearchBookUrl(search);
            /* Call the service */
            HttpURLConnection connection = searchUtil.goodreadsGetConnection(url);
            /* Unmarshall the response */
            BookSearchResponseType unmarshalledResponse = unmarshaller.unmarshalBookSearch(connection.getInputStream());
            /* Map the response */
            bookBeanList = mapper.mapSearchBook(unmarshalledResponse);
            /* Close the connection */
            searchUtil.closeConnection(connection);

        } catch (MalformedURLException e) {

            log.error("MalformedURLException occurred searching - " + search + ":/n" + e);

        } catch (IOException e) {

            log.error("IOException occurred searching - " + search + ":/n" + e);

        } catch (Exception e) {

            log.error("Exception occurred searching - " + search + ":/n" + e);
        }

        return bookBeanList;
    }
}
