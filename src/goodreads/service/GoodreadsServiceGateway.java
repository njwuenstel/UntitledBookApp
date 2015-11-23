package goodreads.service;

import entity.WorkBean;
import goodreads.service.xjc.booksearch.BookSearchResponseType;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Sun Prairie PC on 11/7/2015.
 */
public class GoodreadsServiceGateway {

    GoodreadsSearchUtil searchUtil = new GoodreadsSearchUtil();
    GoodreadsServiceMapper mapper = new GoodreadsServiceMapper();
    GoodreadsUnmarshallers unmarshaller = new GoodreadsUnmarshallers();


    /**
     *
     *
     */
    public void searchBook(String search) {

        try {

            URL url = searchUtil.getSearchBookUrl(search);
            /* Call the service */
            HttpURLConnection connection = searchUtil.goodreadsGetConnection(url);
            /* Unmarshall the response */
            BookSearchResponseType unmarshalledResponse = unmarshaller.unmarshalBookSearch(connection.getInputStream());
            /* Map the response  */
            ArrayList<WorkBean> bookBeanList = mapper.mapSearchBook(unmarshalledResponse);
            /* Close the connection */
            searchUtil.closeConnection(connection);


        } catch (MalformedURLException e) {
            //TODO log

        } catch (IOException e) {
            //TODO log io exception

        } catch (Exception e) {
            //TODO log
            System.out.println(e);

        }
    }
}
