
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="series_works_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary_work_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numbered" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seriesType", propOrder = {
    "id",
    "title",
    "description",
    "note",
    "seriesWorksCount",
    "primaryWorkCount",
    "numbered"
})
public class SeriesType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String note;
    @XmlElement(name = "series_works_count", required = true)
    protected String seriesWorksCount;
    @XmlElement(name = "primary_work_count", required = true)
    protected String primaryWorkCount;
    @XmlElement(required = true)
    protected String numbered;

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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the seriesWorksCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesWorksCount() {
        return seriesWorksCount;
    }

    /**
     * Sets the value of the seriesWorksCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesWorksCount(String value) {
        this.seriesWorksCount = value;
    }

    /**
     * Gets the value of the primaryWorkCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWorkCount() {
        return primaryWorkCount;
    }

    /**
     * Sets the value of the primaryWorkCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWorkCount(String value) {
        this.primaryWorkCount = value;
    }

    /**
     * Gets the value of the numbered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumbered() {
        return numbered;
    }

    /**
     * Sets the value of the numbered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumbered(String value) {
        this.numbered = value;
    }

}
