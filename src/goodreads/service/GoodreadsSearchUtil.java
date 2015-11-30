package goodreads.service;

import entity.WorkBean;
import org.apache.log4j.Logger;
import util.BookieLogger;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Sun Prairie PC on 11/7/2015.
 */
public class GoodreadsSearchUtil {

    Logger log = BookieLogger.getServiceLog();

    protected static String GOODREADS_PATH = "https://www.goodreads.com";
    protected static String GOODREADS_KEY = "BVYrzrOuMKyw4m5tGrOqQ&q";

    protected static String SEARCH_BOOK_URL = "https://www.goodreads.com/search/index.xml?key=" + GOODREADS_KEY + "=";

    protected static String SHOW_BOOK_URL_FRONT = "https://www.goodreads.com/book/show/";
    protected static String SHOW_BOOK_URL_BACK = "?format=xml&key=" + GOODREADS_KEY;

    protected static String SEARCH_AUTHOR_URL_FRONT = "https://www.goodreads.com/api/author_url/";
    protected static String SEARCH_AUTHOR_URL_BACK = "?key=" + GOODREADS_KEY;


    /**
     * Builds and returns a URL for the search.books method
     */
    public URL getSearchBookUrl(String search) throws MalformedURLException {

        String encodedString = encodeString(search);
        String uri = SEARCH_BOOK_URL + encodedString;

        log.info("SearchBook url: " + uri);

        return new URL(uri);
    }

    /**
     * Builds and returns a URL for the book.show method
     */
    public URL getShowBookUrl(String workId) throws MalformedURLException {

        String uri = SHOW_BOOK_URL_FRONT + workId + SHOW_BOOK_URL_BACK;

        log.info("ShowBook url: " + uri);

        return new URL(uri);
    }

    /**
     * Builds and returns a URL for the search.author method
     */
    public URL getSearchAuthorUrl(String search) throws MalformedURLException {

        String encodedString = encodeString(search);
        String uri = SEARCH_AUTHOR_URL_FRONT + encodedString + SEARCH_AUTHOR_URL_BACK;

        log.info("SearchAuthor url: " + uri);

        return new URL(uri);
    }

    /**
     * Encodes the string to a URI path and manually escapes
     * the single quote character
     *
     * @param path The uri path as a string
     * @return the encoded uri path
     */
    public String encodeString(String path) {

        URI uri = UriBuilder.fromUri(path)
                .build();

       /* return the encoded URI manually escape the single quote character */
        return uri.toString().replace("'", "%27");
    }

    /**
     * Calls the Goodreads API from an input URL and returns the
     * response as an input stream.
     *
     * @param url the URL to call the goodreads api
     * @return an InputStream of the goodreads api response
     * @throws IOException
     */
    protected HttpURLConnection goodreadsGetConnection(URL url) throws IOException {

        log.info("Opening connection - " + url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");

        /* log response if at debug level */
        if(log.isDebugEnabled()) {
            InputStream inputStream = connection.getInputStream();
            String inputStreamString = new Scanner(inputStream,"UTF-8").useDelimiter("\\A").next();
            log.debug(inputStreamString);
        }

        return connection;
    }

    protected void closeConnection(HttpURLConnection connection) {

        connection.disconnect();

        log.info("Connection - " + connection.getURL() + "has been disconnected.");
    }

}

