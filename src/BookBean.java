
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * indicates the root node in the xml structure,
 * the name is the name that will appear in the xml,
 * if no name is specified, the class name will be used.
 */
@XmlRootElement(name = "book")
public class BookBean {

    private String title;
    private String author;
    private int isbn;
    private int goodReadsId;

    public int getIsbn() {
        return isbn;
    }

    @XmlElement(name = "isbn")
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement(name = "author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    public int getGoodReadsId() {
        return goodReadsId;
    }

    @XmlElement(name = "goodreads_id")
    public void setGoodReadsId(int goodReadsId) {
        this.goodReadsId = goodReadsId;
    }

    @Override
    public String toString() {
        return "";
    }

}