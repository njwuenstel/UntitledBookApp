
package goodreads.service.xjc.showbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for popular_shelvesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="popular_shelvesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shelf" type="{}shelfType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popular_shelvesType", propOrder = {
    "shelf"
})
public class PopularShelvesType {

    protected List<ShelfType> shelf;

    /**
     * Gets the value of the shelf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShelfType }
     * 
     * 
     */
    public List<ShelfType> getShelf() {
        if (shelf == null) {
            shelf = new ArrayList<ShelfType>();
        }
        return this.shelf;
    }

}