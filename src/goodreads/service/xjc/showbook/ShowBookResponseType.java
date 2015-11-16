
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BookSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookSearchResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{}RequestType"/>
 *         &lt;element name="book" type="{}bookType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShowBookResponseType", propOrder = {
    "request",
    "book"
})
@XmlRootElement(name = "GoodreadsResponse")
public class ShowBookResponseType {

    @XmlElement(name = "Request", required = true)
    protected RequestType request;
    @XmlElement(required = true)
    protected BookType book;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link BookType }
     *     
     */
    public BookType getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookType }
     *     
     */
    public void setBook(BookType value) {
        this.book = value;
    }

}
