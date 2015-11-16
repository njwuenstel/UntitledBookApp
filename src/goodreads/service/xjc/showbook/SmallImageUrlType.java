
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for small_image_urlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="small_image_urlType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="nophoto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "small_image_urlType", propOrder = {
    "value"
})
public class SmallImageUrlType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "nophoto")
    protected String nophoto;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the nophoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNophoto() {
        return nophoto;
    }

    /**
     * Sets the value of the nophoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNophoto(String value) {
        this.nophoto = value;
    }

}
