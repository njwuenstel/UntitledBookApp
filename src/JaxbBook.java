import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class JaxbBook {

    static Logger log = BookieLogger.xml;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

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

            BookshelfBean bookshelf = (BookshelfBean) jaxbUnmarshaller.unmarshal(file);
            System.out.println(bookshelf);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //Document doc = bbbb();

    }

    public static Document loadXMLFromString(String xml) throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));

        return builder.parse(is);
    }

    public static Document bbbb() throws ParserConfigurationException, SAXException, IOException {

        // pass filename in as argument
        File documentFile = new File("hobbitSearchResult.xml");
        System.out.println("File name: " + documentFile);

        // Document builder setup
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(documentFile);
        document.getDocumentElement().normalize();


        // get root node list
        NodeList workList = document.getElementsByTagName("work");
        System.out.println("Work Count: " + workList.getLength());

        // split this out to pass a list and return a node
        for (int i = 0; i < workList.getLength(); ++i) {
            Element workNode = (Element) workList.item(i);

            // call method to get value
            String isbn = parseNodeValue(workNode, "id");

            // get best book node
            Element bestBookNode = (Element) workNode.getElementsByTagName("best_book").item(0);

            String title = parseNodeValue(bestBookNode, "title");
            String author = parseNodeValue(bestBookNode, "name");
            String goodreadsId = parseNodeValue(bestBookNode, "id");

            System.out.println("");
            System.out.println("******************************");
            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("goodreadsId: " + goodreadsId);
        }

        return document;
    }



    public static String parseNodeValue(Element node, String tagName) {

        return node.getElementsByTagName(tagName).item(0).getFirstChild().getNodeValue();
    }
}