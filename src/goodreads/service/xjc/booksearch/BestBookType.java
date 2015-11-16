
package goodreads.service.xjc.booksearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for best_bookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="best_bookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{}idType"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="author" type="{}authorType"/>
 *         &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "best_bookType", propOrder = {
    "id",
    "title",
    "author",
    "imageUrl",
    "smallImageUrl"
})
public class BestBookType {

    @XmlElement(required = true)
    protected IdType id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected AuthorType author;
    @XmlElement(name = "image_url", required = true)
    protected String imageUrl;
    @XmlElement(name = "small_image_url", required = true)
    protected String smallImageUrl;
    @XmlAttribute(name = "type")
    protected String type;

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
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorType }
     *     
     */
    public AuthorType getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorType }
     *     
     */
    public void setAuthor(AuthorType value) {
        this.author = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
