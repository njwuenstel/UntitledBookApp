import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbBook {

    public static void main(String[] args) {

        BookBean bookOne = new BookBean();
        bookOne.setTitle("Killing Mister Spock");
        bookOne.setAuthor("Bill O'Reilley");
        bookOne.setIsbn(6548);
        bookOne.setGoodReadsId(808);

        BookBean bookTwo = new BookBean();
        bookTwo.setTitle("MST3K Unchained");
        bookTwo.setAuthor("Dr. Thomas Servo");
        bookTwo.setIsbn(3001);
        bookTwo.setGoodReadsId(37);

//        // Marshalling Example
//        try {
//
//            BookshelfBean bookshelf = new BookshelfBean();
//            bookshelf.add(bookOne);
//            bookshelf.add(bookTwo);
//
//            File file = new File("booksout.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance(BookshelfBean.class);
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//            // output pretty printed
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            jaxbMarshaller.marshal(bookshelf, file);
//            jaxbMarshaller.marshal(bookshelf, System.out);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }

        // Unmarshalling Example
        try {

            File file = new File("booksout.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(BookshelfBean.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // weird syntax
            BookshelfBean bookshelf = (BookshelfBean) jaxbUnmarshaller.unmarshal(file);
            System.out.println(bookshelf);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}