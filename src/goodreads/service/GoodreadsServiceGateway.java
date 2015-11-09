package goodreads.service;

import goodreads.service.pojo.WorkBean;
import goodreads.service.xjc.booksearch.BookSearchResponseType;
import goodreads.service.xjc.showbook.ShowBookResponseType;

import java.io.IOException;
import java.io.InputStream;
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
            InputStream responseStream = searchUtil.goodreadsGet(url);
            /* Unmarshall the response */
            BookSearchResponseType unmarshalledResponse = unmarshaller.unmarshalBookSearch(responseStream);
            /* Map the response  */
            ArrayList<WorkBean> bookBeanList = mapper.mapSearchBook(unmarshalledResponse);


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
