
package goodreads.service.xjc.showbook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for default_description_language_codeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="default_description_language_codeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default_description_language_codeType", propOrder = {
    "value"
})
public class DefaultDescriptionLanguageCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "nil")
    protected String nil;

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
     * Gets the value of the nil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNil() {
        return nil;
    }

    /**
     * Sets the value of the nil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNil(String value) {
        this.nil = value;
    }

}
