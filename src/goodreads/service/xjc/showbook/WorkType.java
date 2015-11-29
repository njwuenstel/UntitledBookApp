
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{}idType"/>
 *         &lt;element name="books_count" type="{}books_countType" minOccurs="0"/>
 *         &lt;element name="best_book_id" type="{}best_book_idType" minOccurs="0"/>
 *         &lt;element name="reviews_count" type="{}reviews_countType" minOccurs="0"/>
 *         &lt;element name="ratings_sum" type="{}ratings_sumType" minOccurs="0"/>
 *         &lt;element name="ratings_count" type="{}ratings_countType" minOccurs="0"/>
 *         &lt;element name="text_reviews_count" type="{}text_reviews_countType" minOccurs="0"/>
 *         &lt;element name="original_publication_year" type="{}original_publication_yearType" minOccurs="0"/>
 *         &lt;element name="original_publication_month" type="{}original_publication_monthType" minOccurs="0"/>
 *         &lt;element name="original_publication_day" type="{}original_publication_dayType" minOccurs="0"/>
 *         &lt;element name="original_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="original_language_id" type="{}original_language_idType" minOccurs="0"/>
 *         &lt;element name="media_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rating_dist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc_user_id" type="{}desc_user_idType" minOccurs="0"/>
 *         &lt;element name="default_chaptering_book_id" type="{}default_chaptering_book_idType" minOccurs="0"/>
 *         &lt;element name="default_description_language_code" type="{}default_description_language_codeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workType", propOrder = {
    "id",
    "booksCount",
    "bestBookId",
    "reviewsCount",
    "ratingsSum",
    "ratingsCount",
    "textReviewsCount",
    "originalPublicationYear",
    "originalPublicationMonth",
    "originalPublicationDay",
    "originalTitle",
    "originalLanguageId",
    "mediaType",
    "ratingDist",
    "descUserId",
    "defaultChapteringBookId",
    "defaultDescriptionLanguageCode"
})
public class WorkType {

    @XmlElement(required = true)
    protected IdType id;
    @XmlElement(name = "books_count")
    protected BooksCountType booksCount;
    @XmlElement(name = "best_book_id")
    protected BestBookIdType bestBookId;
    @XmlElement(name = "reviews_count")
    protected ReviewsCountType reviewsCount;
    @XmlElement(name = "ratings_sum")
    protected RatingsSumType ratingsSum;
    @XmlElement(name = "ratings_count")
    protected RatingsCountType ratingsCount;
    @XmlElement(name = "text_reviews_count")
    protected TextReviewsCountType textReviewsCount;
    @XmlElement(name = "original_publication_year")
    protected OriginalPublicationYearType originalPublicationYear;
    @XmlElement(name = "original_publication_month")
    protected OriginalPublicationMonthType originalPublicationMonth;
    @XmlElement(name = "original_publication_day")
    protected OriginalPublicationDayType originalPublicationDay;
    @XmlElement(name = "original_title")
    protected String originalTitle;
    @XmlElement(name = "original_language_id")
    protected OriginalLanguageIdType originalLanguageId;
    @XmlElement(name = "media_type")
    protected String mediaType;
    @XmlElement(name = "rating_dist")
    protected String ratingDist;
    @XmlElement(name = "desc_user_id")
    protected DescUserIdType descUserId;
    @XmlElement(name = "default_chaptering_book_id")
    protected DefaultChapteringBookIdType defaultChapteringBookId;
    @XmlElement(name = "default_description_language_code")
    protected DefaultDescriptionLanguageCodeType defaultDescriptionLanguageCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setId(IdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the booksCount property.
     * 
     * @return
     *     possible object is
     *     {@link BooksCountType }
     *     
     */
    public BooksCountType getBooksCount() {
        return booksCount;
    }

    /**
     * Sets the value of the booksCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooksCountType }
     *     
     */
    public void setBooksCount(BooksCountType value) {
        this.booksCount = value;
    }

    /**
     * Gets the value of the bestBookId property.
     * 
     * @return
     *     possible object is
     *     {@link BestBookIdType }
     *     
     */
    public BestBookIdType getBestBookId() {
        return bestBookId;
    }

    /**
     * Sets the value of the bestBookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestBookIdType }
     *     
     */
    public void setBestBookId(BestBookIdType value) {
        this.bestBookId = value;
    }

    /**
     * Gets the value of the reviewsCount property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewsCountType }
     *     
     */
    public ReviewsCountType getReviewsCount() {
        return reviewsCount;
    }

    /**
     * Sets the value of the reviewsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewsCountType }
     *     
     */
    public void setReviewsCount(ReviewsCountType value) {
        this.reviewsCount = value;
    }

    /**
     * Gets the value of the ratingsSum property.
     * 
     * @return
     *     possible object is
     *     {@link RatingsSumType }
     *     
     */
    public RatingsSumType getRatingsSum() {
        return ratingsSum;
    }

    /**
     * Sets the value of the ratingsSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingsSumType }
     *     
     */
    public void setRatingsSum(RatingsSumType value) {
        this.ratingsSum = value;
    }

    /**
     * Gets the value of the ratingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link RatingsCountType }
     *     
     */
    public RatingsCountType getRatingsCount() {
        return ratingsCount;
    }

    /**
     * Sets the value of the ratingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingsCountType }
     *     
     */
    public void setRatingsCount(RatingsCountType value) {
        this.ratingsCount = value;
    }

    /**
     * Gets the value of the textReviewsCount property.
     * 
     * @return
     *     possible object is
     *     {@link TextReviewsCountType }
     *     
     */
    public TextReviewsCountType getTextReviewsCount() {
        return textReviewsCount;
    }

    /**
     * Sets the value of the textReviewsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextReviewsCountType }
     *     
     */
    public void setTextReviewsCount(TextReviewsCountType value) {
        this.textReviewsCount = value;
    }

    /**
     * Gets the value of the originalPublicationYear property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPublicationYearType }
     *     
     */
    public OriginalPublicationYearType getOriginalPublicationYear() {
        return originalPublicationYear;
    }

    /**
     * Sets the value of the originalPublicationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPublicationYearType }
     *     
     */
    public void setOriginalPublicationYear(OriginalPublicationYearType value) {
        this.originalPublicationYear = value;
    }

    /**
     * Gets the value of the originalPublicationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPublicationMonthType }
     *     
     */
    public OriginalPublicationMonthType getOriginalPublicationMonth() {
        return originalPublicationMonth;
    }

    /**
     * Sets the value of the originalPublicationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPublicationMonthType }
     *     
     */
    public void setOriginalPublicationMonth(OriginalPublicationMonthType value) {
        this.originalPublicationMonth = value;
    }

    /**
     * Gets the value of the originalPublicationDay property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPublicationDayType }
     *     
     */
    public OriginalPublicationDayType getOriginalPublicationDay() {
        return originalPublicationDay;
    }

    /**
     * Sets the value of the originalPublicationDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPublicationDayType }
     *     
     */
    public void setOriginalPublicationDay(OriginalPublicationDayType value) {
        this.originalPublicationDay = value;
    }

    /**
     * Gets the value of the originalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * Sets the value of the originalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTitle(String value) {
        this.originalTitle = value;
    }

    /**
     * Gets the value of the originalLanguageId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalLanguageIdType }
     *     
     */
    public OriginalLanguageIdType getOriginalLanguageId() {
        return originalLanguageId;
    }

    /**
     * Sets the value of the originalLanguageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalLanguageIdType }
     *     
     */
    public void setOriginalLanguageId(OriginalLanguageIdType value) {
        this.originalLanguageId = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the ratingDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingDist() {
        return ratingDist;
    }

    /**
     * Sets the value of the ratingDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingDist(String value) {
        this.ratingDist = value;
    }

    /**
     * Gets the value of the descUserId property.
     * 
     * @return
     *     possible object is
     *     {@link DescUserIdType }
     *     
     */
    public DescUserIdType getDescUserId() {
        return descUserId;
    }

    /**
     * Sets the value of the descUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescUserIdType }
     *     
     */
    public void setDescUserId(DescUserIdType value) {
        this.descUserId = value;
    }

    /**
     * Gets the value of the defaultChapteringBookId property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultChapteringBookIdType }
     *     
     */
    public DefaultChapteringBookIdType getDefaultChapteringBookId() {
        return defaultChapteringBookId;
    }

    /**
     * Sets the value of the defaultChapteringBookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultChapteringBookIdType }
     *     
     */
    public void setDefaultChapteringBookId(DefaultChapteringBookIdType value) {
        this.defaultChapteringBookId = value;
    }

    /**
     * Gets the value of the defaultDescriptionLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDescriptionLanguageCodeType }
     *     
     */
    public DefaultDescriptionLanguageCodeType getDefaultDescriptionLanguageCode() {
        return defaultDescriptionLanguageCode;
    }

    /**
     * Sets the value of the defaultDescriptionLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDescriptionLanguageCodeType }
     *     
     */
    public void setDefaultDescriptionLanguageCode(DefaultDescriptionLanguageCodeType value) {
        this.defaultDescriptionLanguageCode = value;
    }

}