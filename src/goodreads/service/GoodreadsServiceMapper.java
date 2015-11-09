package goodreads.service;

import goodreads.service.pojo.WorkBean;
import goodreads.service.xjc.booksearch.BookSearchResponseType;
import goodreads.service.xjc.showbook.ShowBookResponseType;

import goodreads.service.xjc.booksearch.WorkType;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sun Prairie PC on 11/7/2015.
 */
public class GoodreadsServiceMapper {

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
            InputStream responseStream = searchUtil.goodreadsGet(url);
            /* Unmarshall the response */
            unmarshalledResponse = unmarshaller.unmarshalShowBook(responseStream);

        } catch (MalformedURLException e) {
            //TODO log

        } catch (IOException e) {
            //TODO log io exception

        } catch (Exception e) {
            //TODO log
        }
        /* return the unmarshalled response */
        return unmarshalledResponse;
    }
}
