package goodreads.service;

import goodreads.service.xjc.booksearch.BookSearchResponseType;
import goodreads.service.xjc.showbook.ShowBookResponseType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXB;
import javax.xml.bind.UnmarshallerHandler;
import java.io.InputStream;

/**
 * unmarshalBookSearch
 * unmarshalShowBook
 *
 */
public class GoodreadsUnmarshallers {

    /**
     * This method will use jaxb to unmarshal an xml file and map it to
     * the BookSearchResponseType created by xjc.
     *
     * @param bookSearchResponse a file object of the xml to be unmapped
     * @return the rootElement mapped with information from the xml
     */
    public BookSearchResponseType unmarshalBookSearch(InputStream bookSearchResponse) {

        BookSearchResponseType unmarshalledBookSearch;

        // marshal object to file input stream
        unmarshalledBookSearch = JAXB.unmarshal(bookSearchResponse, BookSearchResponseType.class);

        System.out.println(unmarshalledBookSearch.getSearch().getResults().getWork().get(0).getBestBook().getTitle());

        return unmarshalledBookSearch;
    }

    /**
     * This method will use jaxb to unmarshal an xml file and map it to
     * the BookSearchResponseType created by xjc.
     *
     * @param showBookResponse a file object of the xml to be unmapped
     * @return the rootElement mapped with information from the xml
     */
    public ShowBookResponseType unmarshalShowBook(InputStream showBookResponse) {

        ShowBookResponseType unmarshalledShowBook;

        // marshal object to file input stream
        unmarshalledShowBook = JAXB.unmarshal(showBookResponse, ShowBookResponseType.class);

        return unmarshalledShowBook;
    }

}
