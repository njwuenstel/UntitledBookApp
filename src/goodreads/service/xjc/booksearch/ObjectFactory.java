
package goodreads.service.xjc.booksearch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the goodreads.service.xjc.booksearch package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GoodreadsResponse_QNAME = new QName("", "GoodreadsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: goodreads.service.xjc.booksearch
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookSearchResponseType }
     * 
     */
    public BookSearchResponseType createGoodreadsResponseType() {
        return new BookSearchResponseType();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link AuthorType }
     * 
     */
    public AuthorType createAuthorType() {
        return new AuthorType();
    }

    /**
     * Create an instance of {@link OriginalPublicationYearType }
     * 
     */
    public OriginalPublicationYearType createOriginalPublicationYearType() {
        return new OriginalPublicationYearType();
    }

    /**
     * Create an instance of {@link RatingsCountType }
     * 
     */
    public RatingsCountType createRatingsCountType() {
        return new RatingsCountType();
    }

    /**
     * Create an instance of {@link BooksCountType }
     * 
     */
    public BooksCountType createBooksCountType() {
        return new BooksCountType();
    }

    /**
     * Create an instance of {@link WorkType }
     * 
     */
    public WorkType createWorkType() {
        return new WorkType();
    }

    /**
     * Create an instance of {@link SearchType }
     * 
     */
    public SearchType createSearchType() {
        return new SearchType();
    }

    /**
     * Create an instance of {@link TextReviewsCountType }
     * 
     */
    public TextReviewsCountType createTextReviewsCountType() {
        return new TextReviewsCountType();
    }

    /**
     * Create an instance of {@link OriginalPublicationDayType }
     * 
     */
    public OriginalPublicationDayType createOriginalPublicationDayType() {
        return new OriginalPublicationDayType();
    }

    /**
     * Create an instance of {@link BestBookType }
     * 
     */
    public BestBookType createBestBookType() {
        return new BestBookType();
    }

    /**
     * Create an instance of {@link ResultsType }
     * 
     */
    public ResultsType createResultsType() {
        return new ResultsType();
    }

    /**
     * Create an instance of {@link OriginalPublicationMonthType }
     * 
     */
    public OriginalPublicationMonthType createOriginalPublicationMonthType() {
        return new OriginalPublicationMonthType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookSearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GoodreadsResponse")
    public JAXBElement<BookSearchResponseType> createGoodreadsResponse(BookSearchResponseType value) {
        return new JAXBElement<BookSearchResponseType>(_GoodreadsResponse_QNAME, BookSearchResponseType.class, null, value);
    }

}
