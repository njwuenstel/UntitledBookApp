
package goodreads.service.xjc.booksearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="results-start" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="results-end" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="total-results" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="query-time-seconds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="results" type="{}resultsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchType", propOrder = {
    "query",
    "resultsStart",
    "resultsEnd",
    "totalResults",
    "source",
    "queryTimeSeconds",
    "results"
})
public class SearchType {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(name = "results-start", required = true)
    protected String resultsStart;
    @XmlElement(name = "results-end", required = true)
    protected String resultsEnd;
    @XmlElement(name = "total-results", required = true)
    protected String totalResults;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(name = "query-time-seconds", required = true)
    protected String queryTimeSeconds;
    @XmlElement(required = true)
    protected ResultsType results;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the resultsStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsStart() {
        return resultsStart;
    }

    /**
     * Sets the value of the resultsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsStart(String value) {
        this.resultsStart = value;
    }

    /**
     * Gets the value of the resultsEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsEnd() {
        return resultsEnd;
    }

    /**
     * Sets the value of the resultsEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsEnd(String value) {
        this.resultsEnd = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalResults(String value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the queryTimeSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryTimeSeconds() {
        return queryTimeSeconds;
    }

    /**
     * Sets the value of the queryTimeSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryTimeSeconds(String value) {
        this.queryTimeSeconds = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ResultsType }
     *     
     */
    public ResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsType }
     *     
     */
    public void setResults(ResultsType value) {
        this.results = value;
    }

}
