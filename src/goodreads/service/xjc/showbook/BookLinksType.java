
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for book_linksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="book_linksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_link" type="{}book_linkType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book_linksType", propOrder = {
    "bookLink"
})
public class BookLinksType {

    @XmlElement(name = "book_link", required = true)
    protected BookLinkType bookLink;

    /**
     * Gets the value of the bookLink property.
     * 
     * @return
     *     possible object is
     *     {@link BookLinkType }
     *     
     */
    public BookLinkType getBookLink() {
        return bookLink;
    }

    /**
     * Sets the value of the bookLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookLinkType }
     *     
     */
    public void setBookLink(BookLinkType value) {
        this.bookLink = value;
    }

}
