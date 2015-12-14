//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.13 at 02:11:17 AM CST 
//


package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="bookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title_without_series" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="work" type="{}workType"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isbn13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ratings_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authors" type="{}authorsType"/>
 *         &lt;element name="asin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kindle_asin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketplace_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publication_year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publication_month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publication_day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_ebook" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="num_pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="edition_information" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text_reviews_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reviews_widget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="popular_shelves" type="{}popular_shelvesType"/>
 *         &lt;element name="book_links" type="{}book_linksType"/>
 *         &lt;element name="buy_links" type="{}buy_linksType"/>
 *         &lt;element name="series_works" type="{}series_worksType"/>
 *         &lt;element name="similar_books" type="{}similar_booksType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookType", propOrder = {
        "id",
        "title",
        "titleWithoutSeries",
        "link",
        "smallImageUrl",
        "imageUrl",
        "work",
        "isbn",
        "isbn13",
        "averageRating",
        "ratingsCount",
        "authors",
        "asin",
        "kindleAsin",
        "marketplaceId",
        "countryCode",
        "publicationYear",
        "publicationMonth",
        "publicationDay",
        "publisher",
        "languageCode",
        "isEbook",
        "description",
        "numPages",
        "format",
        "editionInformation",
        "textReviewsCount",
        "url",
        "reviewsWidget",
        "popularShelves",
        "bookLinks",
        "buyLinks",
        "seriesWorks",
        "similarBooks"
})
public class BookType {

    protected String id;
    protected String title;
    @XmlElement(name = "title_without_series")
    protected String titleWithoutSeries;
    protected String link;
    @XmlElement(name = "small_image_url")
    protected String smallImageUrl;
    @XmlElement(name = "image_url")
    protected String imageUrl;
    protected WorkType work;
    protected String isbn;
    protected String isbn13;
    @XmlElement(name = "average_rating")
    protected String averageRating;
    @XmlElement(name = "ratings_count")
    protected String ratingsCount;
    protected AuthorsType authors;
    protected String asin;
    @XmlElement(name = "kindle_asin")
    protected String kindleAsin;
    @XmlElement(name = "marketplace_id")
    protected String marketplaceId;
    @XmlElement(name = "country_code")
    protected String countryCode;
    @XmlElement(name = "publication_year")
    protected String publicationYear;
    @XmlElement(name = "publication_month")
    protected String publicationMonth;
    @XmlElement(name = "publication_day")
    protected String publicationDay;
    protected String publisher;
    @XmlElement(name = "language_code")
    protected String languageCode;
    @XmlElement(name = "is_ebook")
    protected String isEbook;
    protected String description;
    @XmlElement(name = "num_pages")
    protected String numPages;
    protected String format;
    @XmlElement(name = "edition_information")
    protected String editionInformation;
    @XmlElement(name = "text_reviews_count")
    protected String textReviewsCount;
    protected String url;
    @XmlElement(name = "reviews_widget")
    protected String reviewsWidget;
    @XmlElement(name = "popular_shelves")
    protected PopularShelvesType popularShelves;
    @XmlElement(name = "book_links")
    protected BookLinksType bookLinks;
    @XmlElement(name = "buy_links")
    protected BuyLinksType buyLinks;
    @XmlElement(name = "series_works")
    protected SeriesWorksType seriesWorks;
    @XmlElement(name = "similar_books")
    protected SimilarBooksType similarBooks;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleWithoutSeries property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitleWithoutSeries() {
        return titleWithoutSeries;
    }

    /**
     * Sets the value of the titleWithoutSeries property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitleWithoutSeries(String value) {
        this.titleWithoutSeries = value;
    }

    /**
     * Gets the value of the link property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the smallImageUrl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    /**
     * Sets the value of the smallImageUrl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSmallImageUrl(String value) {
        this.smallImageUrl = value;
    }

    /**
     * Gets the value of the imageUrl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the work property.
     *
     * @return
     *     possible object is
     *     {@link WorkType }
     *
     */
    public WorkType getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     *
     * @param value
     *     allowed object is
     *     {@link WorkType }
     *
     */
    public void setWork(WorkType value) {
        this.work = value;
    }

    /**
     * Gets the value of the isbn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the isbn13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsbn13() {
        return isbn13;
    }

    /**
     * Sets the value of the isbn13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsbn13(String value) {
        this.isbn13 = value;
    }

    /**
     * Gets the value of the averageRating property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAverageRating(String value) {
        this.averageRating = value;
    }

    /**
     * Gets the value of the ratingsCount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatingsCount() {
        return ratingsCount;
    }

    /**
     * Sets the value of the ratingsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatingsCount(String value) {
        this.ratingsCount = value;
    }

    /**
     * Gets the value of the authors property.
     *
     * @return
     *     possible object is
     *     {@link AuthorsType }
     *
     */
    public AuthorsType getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     *
     * @param value
     *     allowed object is
     *     {@link AuthorsType }
     *
     */
    public void setAuthors(AuthorsType value) {
        this.authors = value;
    }

    /**
     * Gets the value of the asin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAsin() {
        return asin;
    }

    /**
     * Sets the value of the asin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAsin(String value) {
        this.asin = value;
    }

    /**
     * Gets the value of the kindleAsin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKindleAsin() {
        return kindleAsin;
    }

    /**
     * Sets the value of the kindleAsin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKindleAsin(String value) {
        this.kindleAsin = value;
    }

    /**
     * Gets the value of the marketplaceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Sets the value of the marketplaceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketplaceId(String value) {
        this.marketplaceId = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the publicationYear property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the value of the publicationYear property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublicationYear(String value) {
        this.publicationYear = value;
    }

    /**
     * Gets the value of the publicationMonth property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublicationMonth() {
        return publicationMonth;
    }

    /**
     * Sets the value of the publicationMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublicationMonth(String value) {
        this.publicationMonth = value;
    }

    /**
     * Gets the value of the publicationDay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublicationDay() {
        return publicationDay;
    }

    /**
     * Sets the value of the publicationDay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublicationDay(String value) {
        this.publicationDay = value;
    }

    /**
     * Gets the value of the publisher property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the languageCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the isEbook property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsEbook() {
        return isEbook;
    }

    /**
     * Sets the value of the isEbook property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsEbook(String value) {
        this.isEbook = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the numPages property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumPages() {
        return numPages;
    }

    /**
     * Sets the value of the numPages property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumPages(String value) {
        this.numPages = value;
    }

    /**
     * Gets the value of the format property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the editionInformation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEditionInformation() {
        return editionInformation;
    }

    /**
     * Sets the value of the editionInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEditionInformation(String value) {
        this.editionInformation = value;
    }

    /**
     * Gets the value of the textReviewsCount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextReviewsCount() {
        return textReviewsCount;
    }

    /**
     * Sets the value of the textReviewsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextReviewsCount(String value) {
        this.textReviewsCount = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the reviewsWidget property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReviewsWidget() {
        return reviewsWidget;
    }

    /**
     * Sets the value of the reviewsWidget property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReviewsWidget(String value) {
        this.reviewsWidget = value;
    }

    /**
     * Gets the value of the popularShelves property.
     *
     * @return
     *     possible object is
     *     {@link PopularShelvesType }
     *
     */
    public PopularShelvesType getPopularShelves() {
        return popularShelves;
    }

    /**
     * Sets the value of the popularShelves property.
     *
     * @param value
     *     allowed object is
     *     {@link PopularShelvesType }
     *
     */
    public void setPopularShelves(PopularShelvesType value) {
        this.popularShelves = value;
    }

    /**
     * Gets the value of the bookLinks property.
     *
     * @return
     *     possible object is
     *     {@link BookLinksType }
     *
     */
    public BookLinksType getBookLinks() {
        return bookLinks;
    }

    /**
     * Sets the value of the bookLinks property.
     *
     * @param value
     *     allowed object is
     *     {@link BookLinksType }
     *
     */
    public void setBookLinks(BookLinksType value) {
        this.bookLinks = value;
    }

    /**
     * Gets the value of the buyLinks property.
     *
     * @return
     *     possible object is
     *     {@link BuyLinksType }
     *
     */
    public BuyLinksType getBuyLinks() {
        return buyLinks;
    }

    /**
     * Sets the value of the buyLinks property.
     *
     * @param value
     *     allowed object is
     *     {@link BuyLinksType }
     *
     */
    public void setBuyLinks(BuyLinksType value) {
        this.buyLinks = value;
    }

    /**
     * Gets the value of the seriesWorks property.
     *
     * @return
     *     possible object is
     *     {@link SeriesWorksType }
     *
     */
    public SeriesWorksType getSeriesWorks() {
        return seriesWorks;
    }

    /**
     * Sets the value of the seriesWorks property.
     *
     * @param value
     *     allowed object is
     *     {@link SeriesWorksType }
     *
     */
    public void setSeriesWorks(SeriesWorksType value) {
        this.seriesWorks = value;
    }

    /**
     * Gets the value of the similarBooks property.
     *
     * @return
     *     possible object is
     *     {@link SimilarBooksType }
     *
     */
    public SimilarBooksType getSimilarBooks() {
        return similarBooks;
    }

    /**
     * Sets the value of the similarBooks property.
     *
     * @param value
     *     allowed object is
     *     {@link SimilarBooksType }
     *
     */
    public void setSimilarBooks(SimilarBooksType value) {
        this.similarBooks = value;
    }

}




//import java.util.ArrayList;
//import java.util.List;
//import javax.xml.bind.JAXBElement;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElementRef;
//import javax.xml.bind.annotation.XmlElementRefs;
//import javax.xml.bind.annotation.XmlType;

//
///**
// * <p>Java class for bookType complex type.
// *
// * <p>The following schema fragment specifies the expected content contained within this class.
// *
// * <pre>
// * &lt;complexType name="bookType">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;choice maxOccurs="unbounded" minOccurs="0">
// *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="title_without_series" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="work" type="{}workType"/>
// *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="isbn13" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="ratings_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="authors" type="{}authorsType"/>
// *         &lt;element name="asin" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="kindle_asin" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="marketplace_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="publication_year" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="publication_month" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="publication_day" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="language_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="is_ebook" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="num_pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="edition_information" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="text_reviews_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="reviews_widget" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="popular_shelves" type="{}popular_shelvesType"/>
// *         &lt;element name="book_links" type="{}book_linksType"/>
// *         &lt;element name="buy_links" type="{}buy_linksType"/>
// *         &lt;element name="series_works" type="{}series_worksType"/>
// *         &lt;element name="similar_books" type="{}similar_booksType"/>
// *       &lt;/choice>
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// *
// *
// */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "bookType", propOrder = {
//    "idOrTitleOrTitleWithoutSeries"
//})
//public class BookType {
//
//    @XmlElementRefs({
//        @XmlElementRef(name = "buy_links", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "asin", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "ratings_count", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "id", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "language_code", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "image_url", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "small_image_url", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "marketplace_id", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "book_links", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "similar_books", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "isbn", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "format", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "kindle_asin", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "authors", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "num_pages", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "popular_shelves", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "description", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "series_works", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "average_rating", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "publication_year", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "link", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "text_reviews_count", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "reviews_widget", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "is_ebook", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "edition_information", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "title_without_series", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "country_code", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "work", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "publication_day", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "publisher", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "isbn13", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "publication_month", type = JAXBElement.class, required = false),
//        @XmlElementRef(name = "url", type = JAXBElement.class, required = false)
//    })
//    protected List<JAXBElement<?>> idOrTitleOrTitleWithoutSeries;
//
//    /**
//     * Gets the value of the idOrTitleOrTitleWithoutSeries property.
//     *
//     * <p>
//     * This accessor method returns a reference to the live list,
//     * not a snapshot. Therefore any modification you make to the
//     * returned list will be present inside the JAXB object.
//     * This is why there is not a <CODE>set</CODE> method for the idOrTitleOrTitleWithoutSeries property.
//     *
//     * <p>
//     * For example, to add a new item, do as follows:
//     * <pre>
//     *    getIdOrTitleOrTitleWithoutSeries().add(newItem);
//     * </pre>
//     *
//     *
//     * <p>
//     * Objects of the following type(s) are allowed in the list
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link BuyLinksType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link BookLinksType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link SimilarBooksType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link AuthorsType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link PopularShelvesType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link SeriesWorksType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link WorkType }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     * {@link JAXBElement }{@code <}{@link String }{@code >}
//     *
//     *
//     */
//    public List<JAXBElement<?>> getIdOrTitleOrTitleWithoutSeries() {
//        if (idOrTitleOrTitleWithoutSeries == null) {
//            idOrTitleOrTitleWithoutSeries = new ArrayList<JAXBElement<?>>();
//        }
//        return this.idOrTitleOrTitleWithoutSeries;
//    }
//
//}
