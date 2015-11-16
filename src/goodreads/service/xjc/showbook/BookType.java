
package goodreads.service.xjc.showbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
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
    "idOrTitleOrTitleWithoutSeries"
})
public class BookType {

    @XmlElementRefs({
        @XmlElementRef(name = "publisher", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "publication_month", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "image_url", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "url", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "average_rating", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isbn13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "is_ebook", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "asin", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "series_works", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "language_code", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "book_links", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "publication_day", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "small_image_url", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "popular_shelves", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "publication_year", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "num_pages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isbn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reviews_widget", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "similar_books", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "work", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "authors", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "edition_information", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text_reviews_count", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ratings_count", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title_without_series", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "kindle_asin", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "format", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> idOrTitleOrTitleWithoutSeries;

    /**
     * Gets the value of the idOrTitleOrTitleWithoutSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idOrTitleOrTitleWithoutSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdOrTitleOrTitleWithoutSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesWorksType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BookLinksType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PopularShelvesType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link SimilarBooksType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorsType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getIdOrTitleOrTitleWithoutSeries() {
        if (idOrTitleOrTitleWithoutSeries == null) {
            idOrTitleOrTitleWithoutSeries = new ArrayList<JAXBElement<?>>();
        }
        return this.idOrTitleOrTitleWithoutSeries;
    }

}
