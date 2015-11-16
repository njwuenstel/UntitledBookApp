
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for series_workType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="series_workType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="series" type="{}seriesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "series_workType", propOrder = {
    "id",
    "userPosition",
    "series"
})
public class SeriesWorkType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "user_position", required = true)
    protected String userPosition;
    @XmlElement(required = true)
    protected SeriesType series;

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
     * Gets the value of the userPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPosition() {
        return userPosition;
    }

    /**
     * Sets the value of the userPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPosition(String value) {
        this.userPosition = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesType }
     *     
     */
    public SeriesType getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesType }
     *     
     */
    public void setSeries(SeriesType value) {
        this.series = value;
    }

}
