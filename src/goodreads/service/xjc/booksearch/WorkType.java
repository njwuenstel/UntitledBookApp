
package goodreads.service.xjc.booksearch;

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
 *         &lt;element name="books_count" type="{}books_countType"/>
 *         &lt;element name="ratings_count" type="{}ratings_countType"/>
 *         &lt;element name="text_reviews_count" type="{}text_reviews_countType"/>
 *         &lt;element name="original_publication_year" type="{}original_publication_yearType"/>
 *         &lt;element name="original_publication_month" type="{}original_publication_monthType"/>
 *         &lt;element name="original_publication_day" type="{}original_publication_dayType"/>
 *         &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="best_book" type="{}best_bookType"/>
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
    "ratingsCount",
    "textReviewsCount",
    "originalPublicationYear",
    "originalPublicationMonth",
    "originalPublicationDay",
    "averageRating",
    "bestBook"
})
public class WorkType {

    @XmlElement(required = true)
    protected IdType id;
    @XmlElement(name = "books_count", required = true)
    protected BooksCountType booksCount;
    @XmlElement(name = "ratings_count", required = true)
    protected RatingsCountType ratingsCount;
    @XmlElement(name = "text_reviews_count", required = true)
    protected TextReviewsCountType textReviewsCount;
    @XmlElement(name = "original_publication_year", required = true)
    protected OriginalPublicationYearType originalPublicationYear;
    @XmlElement(name = "original_publication_month", required = true)
    protected OriginalPublicationMonthType originalPublicationMonth;
    @XmlElement(name = "original_publication_day", required = true)
    protected OriginalPublicationDayType originalPublicationDay;
    @XmlElement(name = "average_rating", required = true)
    protected String averageRating;
    @XmlElement(name = "best_book", required = true)
    protected BestBookType bestBook;

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
     * Gets the value of the bestBook property.
     * 
     * @return
     *     possible object is
     *     {@link BestBookType }
     *     
     */
    public BestBookType getBestBook() {
        return bestBook;
    }

    /**
     * Sets the value of the bestBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestBookType }
     *     
     */
    public void setBestBook(BestBookType value) {
        this.bestBook = value;
    }

}
