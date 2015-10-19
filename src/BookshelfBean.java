import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

@XmlRootElement( name = "bookshelf" )
public class BookshelfBean {

    ArrayList<BookBean> bookshelf;

    public ArrayList<BookBean> getBookshelf() {
        return bookshelf;
    }

    @XmlElement(name = "book")
    public void setBookshelf(ArrayList<BookBean> bookshelf) {

        this.bookshelf = bookshelf;
    }

    public void add(BookBean book) {

        if (this.bookshelf == null) {

            this.bookshelf = new ArrayList<>();
        }

        this.bookshelf.add(book);
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        for(BookBean book : bookshelf) {
            writer.println("");
            writer.println("Title: " + book.getTitle());
            writer.println("Author: " + book.getAuthor());
            writer.println("ISBN: " + book.getIsbn());
            writer.println("Good Reads ID: " + book.getGoodReadsId());
        }

        return stringWriter.toString();
    }

}