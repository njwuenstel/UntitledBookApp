package goodreads.service;

import entity.WorkBean;
import goodreads.service.xjc.booksearch.BookSearchResponseType;
import goodreads.service.xjc.showbook.ShowBookResponseType;

import goodreads.service.xjc.booksearch.WorkType;
import org.apache.log4j.Logger;
import util.BookieLogger;

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
        for(WorkType work : works) {

            /* new book bean */
            WorkBean workBean = new WorkBean();

            workBean.setTitle(work.getBestBook().getTitle());
            workBean.setAuthor(work.getBestBook().getAuthor().getName());
            workBean.setGoodreadsId(work.getBestBook().getId().getValue());

            /* call method to get additional work info from goodreadsId */
            //ShowBookResponseType showBook = showBook(workBean.getGoodreadsId());
            //System.out.println("xxxxx" + showBook.getBook().getIdOrTitleOrTitleWithoutSeries().toString());

            workBean.setIsbn("");
            workBean.setImageUrl("");
            workBean.setYearFirstPublished("");
            workBean.setNumberOfPages(0);
            workBean.setDescription("");


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
