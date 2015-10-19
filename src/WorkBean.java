
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.PrintWriter;
import java.io.StringWriter;

/*
 * indicates the root node in the xml structure,
 * the name is the name that will appear in the xml,
 * if no name is specified, the class name will be used.
 */
@XmlRootElement(name = "work")
public class WorkBean {

    private String title;
    private String author;
    private int isbn;
    private int goodReadsId;

    public int getIsbn() {
        return isbn;
    }

    @XmlElement(name = "id")
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

//    @XmlElementWrapper(name = "best_book")
//    @XmlElementWrapper(name = "author")
//    @XmlElement(name = "name")
//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public String getTitle() {
        return title;
    }

    @XmlElementWrapper(name = "best_book")
    @XmlElement(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    public int getGoodReadsId() {
        return goodReadsId;
    }

    @XmlElementWrapper(name = "best_book")
    @XmlElement(name = "id")
    public void setGoodReadsId(int goodReadsId) {
        this.goodReadsId = goodReadsId;
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        writer.println("");
        writer.println("Title: " + this.getTitle());
        writer.println("Author: " + this.getAuthor());
        writer.println("ISBN: " + this.getIsbn());
        writer.println("Good Reads ID: " + this.getGoodReadsId());

        return stringWriter.toString();
    }

}