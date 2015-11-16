
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image_url" type="{}image_urlType" minOccurs="0"/>
 *         &lt;element name="small_image_url" type="{}small_image_urlType" minOccurs="0"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratings_count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text_reviews_count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorType", propOrder = {
    "id",
    "name",
    "role",
    "imageUrl",
    "smallImageUrl",
    "link",
    "averageRating",
    "ratingsCount",
    "textReviewsCount"
})
public class AuthorType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    protected String role;
    @XmlElement(name = "image_url")
    protected ImageUrlType imageUrl;
    @XmlElement(name = "small_image_url")
    protected SmallImageUrlType smallImageUrl;
    @XmlElement(required = true)
    protected String link;
    @XmlElement(name = "average_rating")
    protected String averageRating;
    @XmlElement(name = "ratings_count")
    protected String ratingsCount;
    @XmlElement(name = "text_reviews_count")
    protected String textReviewsCount;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link ImageUrlType }
     *     
     */
    public ImageUrlType getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageUrlType }
     *     
     */
    public void setImageUrl(ImageUrlType value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the smallImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link SmallImageUrlType }
     *     
     */
    public SmallImageUrlType getSmallImageUrl() {
        return smallImageUrl;
    }

    /**
     * Sets the value of the smallImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallImageUrlType }
     *     
     */
    public void setSmallImageUrl(SmallImageUrlType value) {
        this.smallImageUrl = value;
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

}
