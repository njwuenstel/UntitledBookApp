
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for series_worksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="series_worksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="series_work" type="{}series_workType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "series_worksType", propOrder = {
    "seriesWork"
})
public class SeriesWorksType {

    @XmlElement(name = "series_work", required = true)
    protected SeriesWorkType seriesWork;

    /**
     * Gets the value of the seriesWork property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesWorkType }
     *     
     */
    public SeriesWorkType getSeriesWork() {
        return seriesWork;
    }

    /**
     * Sets the value of the seriesWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesWorkType }
     *     
     */
    public void setSeriesWork(SeriesWorkType value) {
        this.seriesWork = value;
    }

}