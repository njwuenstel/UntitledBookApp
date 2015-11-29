
package goodreads.service.xjc.showbook;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the goodreads.service.xjc.showbook package.
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
    private final static QName _BookTypePopularShelves_QNAME = new QName("", "popular_shelves");
    private final static QName _BookTypeAsin_QNAME = new QName("", "asin");
    private final static QName _BookTypeLink_QNAME = new QName("", "link");
    private final static QName _BookTypeRatingsCount_QNAME = new QName("", "ratings_count");
    private final static QName _BookTypeSmallImageUrl_QNAME = new QName("", "small_image_url");
    private final static QName _BookTypeTitleWithoutSeries_QNAME = new QName("", "title_without_series");
    private final static QName _BookTypePublisher_QNAME = new QName("", "publisher");
    private final static QName _BookTypeId_QNAME = new QName("", "id");
    private final static QName _BookTypeAuthors_QNAME = new QName("", "authors");
    private final static QName _BookTypePublicationDay_QNAME = new QName("", "publication_day");
    private final static QName _BookTypeLanguageCode_QNAME = new QName("", "language_code");
    private final static QName _BookTypeTitle_QNAME = new QName("", "title");
    private final static QName _BookTypePublicationMonth_QNAME = new QName("", "publication_month");
    private final static QName _BookTypeImageUrl_QNAME = new QName("", "image_url");
    private final static QName _BookTypeDescription_QNAME = new QName("", "description");
    private final static QName _BookTypeIsbn_QNAME = new QName("", "isbn");
    private final static QName _BookTypeTextReviewsCount_QNAME = new QName("", "text_reviews_count");
    private final static QName _BookTypeIsbn13_QNAME = new QName("", "isbn13");
    private final static QName _BookTypeEditionInformation_QNAME = new QName("", "edition_information");
    private final static QName _BookTypeWork_QNAME = new QName("", "work");
    private final static QName _BookTypeBookLinks_QNAME = new QName("", "book_links");
    private final static QName _BookTypeNumPages_QNAME = new QName("", "num_pages");
    private final static QName _BookTypeAverageRating_QNAME = new QName("", "average_rating");
    private final static QName _BookTypeFormat_QNAME = new QName("", "format");
    private final static QName _BookTypeUrl_QNAME = new QName("", "url");
    private final static QName _BookTypeReviewsWidget_QNAME = new QName("", "reviews_widget");
    private final static QName _BookTypePublicationYear_QNAME = new QName("", "publication_year");
    private final static QName _BookTypeKindleAsin_QNAME = new QName("", "kindle_asin");
    private final static QName _BookTypeSimilarBooks_QNAME = new QName("", "similar_books");
    private final static QName _BookTypeIsEbook_QNAME = new QName("", "is_ebook");
    private final static QName _BookTypeSeriesWorks_QNAME = new QName("", "series_works");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: goodreads.service.xjc.showbook
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowBookResponseType }
     * 
     */
    public ShowBookResponseType createGoodreadsResponseType() {
        return new ShowBookResponseType();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link SeriesWorkType }
     * 
     */
    public SeriesWorkType createSeriesWorkType() {
        return new SeriesWorkType();
    }

    /**
     * Create an instance of {@link PopularShelvesType }
     * 
     */
    public PopularShelvesType createPopularShelvesType() {
        return new PopularShelvesType();
    }

    /**
     * Create an instance of {@link DescUserIdType }
     * 
     */
    public DescUserIdType createDescUserIdType() {
        return new DescUserIdType();
    }

    /**
     * Create an instance of {@link WorkType }
     * 
     */
    public WorkType createWorkType() {
        return new WorkType();
    }

    /**
     * Create an instance of {@link BookType }
     * 
     */
    public BookType createBookType() {
        return new BookType();
    }

    /**
     * Create an instance of {@link TextReviewsCountType }
     * 
     */
    public TextReviewsCountType createTextReviewsCountType() {
        return new TextReviewsCountType();
    }

    /**
     * Create an instance of {@link BookLinksType }
     * 
     */
    public BookLinksType createBookLinksType() {
        return new BookLinksType();
    }

    /**
     * Create an instance of {@link DefaultDescriptionLanguageCodeType }
     * 
     */
    public DefaultDescriptionLanguageCodeType createDefaultDescriptionLanguageCodeType() {
        return new DefaultDescriptionLanguageCodeType();
    }

    /**
     * Create an instance of {@link OriginalPublicationDayType }
     * 
     */
    public OriginalPublicationDayType createOriginalPublicationDayType() {
        return new OriginalPublicationDayType();
    }

    /**
     * Create an instance of {@link RatingsSumType }
     * 
     */
    public RatingsSumType createRatingsSumType() {
        return new RatingsSumType();
    }

    /**
     * Create an instance of {@link SeriesWorksType }
     * 
     */
    public SeriesWorksType createSeriesWorksType() {
        return new SeriesWorksType();
    }

    /**
     * Create an instance of {@link BestBookIdType }
     * 
     */
    public BestBookIdType createBestBookIdType() {
        return new BestBookIdType();
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
     * Create an instance of {@link SeriesType }
     * 
     */
    public SeriesType createSeriesType() {
        return new SeriesType();
    }

    /**
     * Create an instance of {@link BooksCountType }
     * 
     */
    public BooksCountType createBooksCountType() {
        return new BooksCountType();
    }

    /**
     * Create an instance of {@link BookLinkType }
     * 
     */
    public BookLinkType createBookLinkType() {
        return new BookLinkType();
    }

    /**
     * Create an instance of {@link ReviewsCountType }
     * 
     */
    public ReviewsCountType createReviewsCountType() {
        return new ReviewsCountType();
    }

    /**
     * Create an instance of {@link SmallImageUrlType }
     * 
     */
    public SmallImageUrlType createSmallImageUrlType() {
        return new SmallImageUrlType();
    }

    /**
     * Create an instance of {@link SimilarBooksType }
     * 
     */
    public SimilarBooksType createSimilarBooksType() {
        return new SimilarBooksType();
    }

    /**
     * Create an instance of {@link ImageUrlType }
     * 
     */
    public ImageUrlType createImageUrlType() {
        return new ImageUrlType();
    }

    /**
     * Create an instance of {@link DefaultChapteringBookIdType }
     * 
     */
    public DefaultChapteringBookIdType createDefaultChapteringBookIdType() {
        return new DefaultChapteringBookIdType();
    }

    /**
     * Create an instance of {@link AuthorsType }
     * 
     */
    public AuthorsType createAuthorsType() {
        return new AuthorsType();
    }

    /**
     * Create an instance of {@link ShelfType }
     * 
     */
    public ShelfType createShelfType() {
        return new ShelfType();
    }

    /**
     * Create an instance of {@link OriginalPublicationMonthType }
     * 
     */
    public OriginalPublicationMonthType createOriginalPublicationMonthType() {
        return new OriginalPublicationMonthType();
    }

    /**
     * Create an instance of {@link OriginalLanguageIdType }
     * 
     */
    public OriginalLanguageIdType createOriginalLanguageIdType() {
        return new OriginalLanguageIdType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBookResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GoodreadsResponse")
    public JAXBElement<ShowBookResponseType> createGoodreadsResponse(ShowBookResponseType value) {
        return new JAXBElement<ShowBookResponseType>(_GoodreadsResponse_QNAME, ShowBookResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopularShelvesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "popular_shelves", scope = BookType.class)
    public JAXBElement<PopularShelvesType> createBookTypePopularShelves(PopularShelvesType value) {
        return new JAXBElement<PopularShelvesType>(_BookTypePopularShelves_QNAME, PopularShelvesType.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "asin", scope = BookType.class)
    public JAXBElement<String> createBookTypeAsin(String value) {
        return new JAXBElement<String>(_BookTypeAsin_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "link", scope = BookType.class)
    public JAXBElement<String> createBookTypeLink(String value) {
        return new JAXBElement<String>(_BookTypeLink_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ratings_count", scope = BookType.class)
    public JAXBElement<String> createBookTypeRatingsCount(String value) {
        return new JAXBElement<String>(_BookTypeRatingsCount_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "small_image_url", scope = BookType.class)
    public JAXBElement<String> createBookTypeSmallImageUrl(String value) {
        return new JAXBElement<String>(_BookTypeSmallImageUrl_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title_without_series", scope = BookType.class)
    public JAXBElement<String> createBookTypeTitleWithoutSeries(String value) {
        return new JAXBElement<String>(_BookTypeTitleWithoutSeries_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publisher", scope = BookType.class)
    public JAXBElement<String> createBookTypePublisher(String value) {
        return new JAXBElement<String>(_BookTypePublisher_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = BookType.class)
    public JAXBElement<String> createBookTypeId(String value) {
        return new JAXBElement<String>(_BookTypeId_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authors", scope = BookType.class)
    public JAXBElement<AuthorsType> createBookTypeAuthors(AuthorsType value) {
        return new JAXBElement<AuthorsType>(_BookTypeAuthors_QNAME, AuthorsType.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publication_day", scope = BookType.class)
    public JAXBElement<String> createBookTypePublicationDay(String value) {
        return new JAXBElement<String>(_BookTypePublicationDay_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "language_code", scope = BookType.class)
    public JAXBElement<String> createBookTypeLanguageCode(String value) {
        return new JAXBElement<String>(_BookTypeLanguageCode_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = BookType.class)
    public JAXBElement<String> createBookTypeTitle(String value) {
        return new JAXBElement<String>(_BookTypeTitle_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publication_month", scope = BookType.class)
    public JAXBElement<String> createBookTypePublicationMonth(String value) {
        return new JAXBElement<String>(_BookTypePublicationMonth_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "image_url", scope = BookType.class)
    public JAXBElement<String> createBookTypeImageUrl(String value) {
        return new JAXBElement<String>(_BookTypeImageUrl_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = BookType.class)
    public JAXBElement<String> createBookTypeDescription(String value) {
        return new JAXBElement<String>(_BookTypeDescription_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isbn", scope = BookType.class)
    public JAXBElement<String> createBookTypeIsbn(String value) {
        return new JAXBElement<String>(_BookTypeIsbn_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text_reviews_count", scope = BookType.class)
    public JAXBElement<String> createBookTypeTextReviewsCount(String value) {
        return new JAXBElement<String>(_BookTypeTextReviewsCount_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isbn13", scope = BookType.class)
    public JAXBElement<String> createBookTypeIsbn13(String value) {
        return new JAXBElement<String>(_BookTypeIsbn13_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "edition_information", scope = BookType.class)
    public JAXBElement<String> createBookTypeEditionInformation(String value) {
        return new JAXBElement<String>(_BookTypeEditionInformation_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "work", scope = BookType.class)
    public JAXBElement<WorkType> createBookTypeWork(WorkType value) {
        return new JAXBElement<WorkType>(_BookTypeWork_QNAME, WorkType.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookLinksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "book_links", scope = BookType.class)
    public JAXBElement<BookLinksType> createBookTypeBookLinks(BookLinksType value) {
        return new JAXBElement<BookLinksType>(_BookTypeBookLinks_QNAME, BookLinksType.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num_pages", scope = BookType.class)
    public JAXBElement<String> createBookTypeNumPages(String value) {
        return new JAXBElement<String>(_BookTypeNumPages_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "average_rating", scope = BookType.class)
    public JAXBElement<String> createBookTypeAverageRating(String value) {
        return new JAXBElement<String>(_BookTypeAverageRating_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = BookType.class)
    public JAXBElement<String> createBookTypeFormat(String value) {
        return new JAXBElement<String>(_BookTypeFormat_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url", scope = BookType.class)
    public JAXBElement<String> createBookTypeUrl(String value) {
        return new JAXBElement<String>(_BookTypeUrl_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reviews_widget", scope = BookType.class)
    public JAXBElement<String> createBookTypeReviewsWidget(String value) {
        return new JAXBElement<String>(_BookTypeReviewsWidget_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "publication_year", scope = BookType.class)
    public JAXBElement<String> createBookTypePublicationYear(String value) {
        return new JAXBElement<String>(_BookTypePublicationYear_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kindle_asin", scope = BookType.class)
    public JAXBElement<String> createBookTypeKindleAsin(String value) {
        return new JAXBElement<String>(_BookTypeKindleAsin_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimilarBooksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "similar_books", scope = BookType.class)
    public JAXBElement<SimilarBooksType> createBookTypeSimilarBooks(SimilarBooksType value) {
        return new JAXBElement<SimilarBooksType>(_BookTypeSimilarBooks_QNAME, SimilarBooksType.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is_ebook", scope = BookType.class)
    public JAXBElement<String> createBookTypeIsEbook(String value) {
        return new JAXBElement<String>(_BookTypeIsEbook_QNAME, String.class, BookType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeriesWorksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "series_works", scope = BookType.class)
    public JAXBElement<SeriesWorksType> createBookTypeSeriesWorks(SeriesWorksType value) {
        return new JAXBElement<SeriesWorksType>(_BookTypeSeriesWorks_QNAME, SeriesWorksType.class, BookType.class, value);
    }

}