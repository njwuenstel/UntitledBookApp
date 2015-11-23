
import goodreads.service.GoodreadsSearchUtil;
import goodreads.service.GoodreadsServiceGateway;

import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Sun Prairie PC on 10/29/2015.
 */
public class BookSearch {

    static String GOODREADS_PATH = "https://www.goodreads.com";
    static String GOODREADS_KEY = "BVYrzrOuMKyw4m5tGrOqQ&q";
    GoodreadsSearchUtil searchUtil = new GoodreadsSearchUtil();



    public static void main(String[] args) throws Exception {

        BookSearch bookSearch = new BookSearch();
        GoodreadsServiceGateway gateway = new GoodreadsServiceGateway();

//        bookSearch.searchBook("9780689840920");

//        System.out.println("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
//
//        bookSearch.searchBook("ender's game");
//
//        System.out.println("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
//
//        bookSearch.searchGoodReadsId("34");

        gateway.searchBook("screwtape");
    }


    /**
     *
     */
    private InputStream goodreadsGet(URL url) throws Exception {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");

        InputStream inputStream = connection.getInputStream();

        // if(debug) {
             String inputStreamString = new Scanner(inputStream,"UTF-8").useDelimiter("\\A").next();
             System.out.println(inputStreamString);
        // }

        connection.disconnect();

        return inputStream;
    }

    /**
     * Encodes the search string and builds the url to send to the
     * goodreads restful service. Calls the service and then unmarshalls
     * the response
     *
     * @param search The search criteria
     * @return a collection of unmarshalled book objects returned from the response
     */
    public void searchBook(String search) throws Exception {

        /* Build the URL */
        URL url = searchUtil.getSearchBookUrl(search);
        /* Call the service */
        InputStream responseStream = goodreadsGet(url);

    }


    public void showBook(String workId) throws Exception {

        /* Build the URL */
        URL url = searchUtil.getShowBookUrl(workId);
        System.out.println(url);
        goodreadsGet(url);
    }

    //https://www.goodreads.com/api/author_url/Orson%20Scott%20Card?key=BVYrzrOuMKyw4m5tGrOqQ



}
