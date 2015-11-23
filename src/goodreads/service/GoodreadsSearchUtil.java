package goodreads.service;

import entity.WorkBean;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by Sun Prairie PC on 11/7/2015.
 */
public class GoodreadsSearchUtil {


    private static String GOODREADS_PATH = "https://www.goodreads.com";
    private static String GOODREADS_KEY = "BVYrzrOuMKyw4m5tGrOqQ&q";

    private static String SEARCH_BOOK_URL = "https://www.goodreads.com/search/index.xml?key=" + GOODREADS_KEY + "=";

    private static String SHOW_BOOK_URL_FRONT = "https://www.goodreads.com/book/show/";
    private static String SHOW_BOOK_URL_BACK = "?format=xml&key=" + GOODREADS_KEY;

    private static String SEARCH_AUTHOR_URL_FRONT = "https://www.goodreads.com/api/author_url/";
    private static String SEARCH_AUTHOR_URL_BACK = "?key=" + GOODREADS_KEY;


    /**
     * Builds and returns a URL for the search.books method
     */
    public URL getSearchBookUrl(String search) throws MalformedURLException {

        String encodedString = encodeString(search);
        String uri = SEARCH_BOOK_URL + encodedString;
        //TODO log url    System.out.println(url);

        return new URL(uri);
    }

    /**
     * Builds and returns a URL for the book.show method
     */
    public URL getShowBookUrl(String workId) throws MalformedURLException {

        String uri = SHOW_BOOK_URL_FRONT + workId + SHOW_BOOK_URL_BACK;
        //TODO log url    System.out.println(url);

        return new URL(uri);
    }

    /**
     * Builds and returns a URL for the search.author method
     */
    public URL getSearchAuthorUrl(String search) throws MalformedURLException {

        String encodedString = encodeString(search);
        String uri = SEARCH_AUTHOR_URL_FRONT + encodedString + SEARCH_AUTHOR_URL_BACK;
        URL url = new URL(uri);

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

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");

        //InputStream inputStream = connection.getInputStream();

        //TODO
        // if(debug) {
        //     String inputStreamString = new Scanner(inputStream,"UTF-8").useDelimiter("\\A").next();
        //     System.out.println(inputStreamString);
        // }

        return connection;
    }

    protected void closeConnection(HttpURLConnection connection) {

        connection.disconnect();
    }

}

