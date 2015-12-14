package goodreads.service;

import entity.WorkBean;
import goodreads.service.xjc.booksearch.BookSearchResponseType;
import goodreads.service.xjc.showbook.BookType;
import goodreads.service.xjc.showbook.ShowBookResponseType;

import goodreads.service.xjc.booksearch.WorkType;
import org.apache.log4j.Logger;
import util.BookieLogger;

import javax.xml.bind.JAXBElement;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sun Prairie PC on 11/7/2015.
 */
public class GoodreadsServiceMapper {

    Logger log = BookieLogger.getServiceLog();

    GoodreadsSearchUtil searchUtil = new GoodreadsSearchUtil();
    GoodreadsUnmarshallers unmarshaller = new GoodreadsUnmarshallers();

    public ArrayList<WorkBean> mapSearchBook(BookSearchResponseType bookSearch) {

        ArrayList<WorkBean> workBeanList = new ArrayList<>();
        List<WorkType> works = bookSearch.getSearch().getResults().getWork();

        /* iterate through works list adding mapped beans to workBeanList */
        for(goodreads.service.xjc.booksearch.WorkType work : works) {

            /* new book bean */
            WorkBean workBean = new WorkBean();

            workBean.setTitle(work.getBestBook().getTitle());
            workBean.setAuthor(work.getBestBook().getAuthor().getName());
            workBean.setGoodreadsId(work.getBestBook().getId().getValue());

            /* call method to get additional work info from goodreadsId */
            ShowBookResponseType showBookResponse = showBook(workBean.getGoodreadsId());
            BookType book = showBookResponse.getBook();

            //System.out.println("xxxxx" + workBean.getTitle() + ": " + showBookResponse.getBook().getIdOrTitleOrTitleWithoutSeries().get(0));

            workBean.setIsbn(book.getIsbn());
            workBean.setImageUrl(book.getImageUrl());
            workBean.setYearFirstPublished(book.getPublicationYear());
            workBean.setNumberOfPages(book.getNumPages());
            workBean.setDescription(book.getDescription());

            /* add workbean to list */
            System.out.print(workBean);
            workBeanList.add(workBean);
        }

        return workBeanList;
    }

    /**
     *
     *
     */
    public ShowBookResponseType showBook(String workId) {

        ShowBookResponseType unmarshalledResponse = new ShowBookResponseType();

        try {
            URL url = searchUtil.getShowBookUrl(workId);
            /* Call the service */
            HttpURLConnection connection = searchUtil.goodreadsGetConnection(url);
            /* Unmarshall the response */
            unmarshalledResponse = unmarshaller.unmarshalShowBook(connection.getInputStream());
            /* Close the connection */
            searchUtil.closeConnection(connection);

        } catch (MalformedURLException e) {

            log.error("MalformedURLException occurred mapping - " + workId + ":/n" + e);

        } catch (IOException e) {

            log.error("IOException occurred mapping - " + workId + ":/n" + e);

        } catch (Exception e) {

            log.error("Exception occurred mapping - " + workId + ":/n" + e);
        }
        /* return the unmarshalled response */
        return unmarshalledResponse;
    }
}
