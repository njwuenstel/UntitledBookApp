import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.io.*;

import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class JaxbThree {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

//        BookBean bookOne = new BookBean();
//        bookOne.setTitle("Killing Mister Spock");
//        bookOne.setAuthor("Bill O'Reilley");
//        bookOne.setIsbn(6548);
//        bookOne.setGoodReadsId(808);
//
//        BookBean bookTwo = new BookBean();
//        bookTwo.setTitle("MST3K Unchained");
//        bookTwo.setAuthor("Dr. Thomas Servo");
//        bookTwo.setIsbn(3001);
//        bookTwo.setGoodReadsId(37);

        // Marshalling Example
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
//        try {
//
//            File file = new File("problem.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance(BookshelfBean.class);
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//
//            // weird syntax
//            BookshelfBean bookshelf = (BookshelfBean) jaxbUnmarshaller.unmarshal(file);
//            System.out.println(bookshelf);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }

        Document doc = bbbb();
        System.out.print(doc.getDocumentElement());

    }

    public static void loadXMLFromString(String xml) throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName("child");

        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);

            NodeList name = element.getElementsByTagName("name");
            Element line = (Element) name.item(0);
            System.out.println("Name: " + getCharacterDataFromElement(line));

            NodeList title = element.getElementsByTagName("title");
            line = (Element) title.item(0);
            System.out.println("Title: " + getCharacterDataFromElement(line));
        }

    }

    public static Document bbbb() throws ParserConfigurationException, SAXException, IOException {
        File documentFile = new File("problem.xml");
        System.out.println("zzzz" + documentFile);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse(documentFile);
        document.getDocumentElement().normalize();
        NodeList parentList = (NodeList)document.getElementsByTagName("parent");

        for (int i = 0; i < parentList.getLength(); ++i) {
            Element node = (Element) parentList.item(i);
            String name = node.getElementsByTagName("name").item(0).getFirstChild().getNodeValue();

            NodeList childList = node.getElementsByTagName("child");
            for (int j = 0; j < childList.getLength(); ++j) {
                Element value = (Element) childList.item(j);


                NodeList grandchildOneList = value.getElementsByTagName("grandchild");
                for (int k = 0; k < grandchildOneList.getLength(); ++k) {
                    Element grandchild = (Element) grandchildOneList.item(k);
                    String grandchildText = grandchild.getFirstChild().getNodeValue();
                    System.out.println("Name: " + name);
                    System.out.println("Grandchild: " + grandchildText);
                }
            }
        }

        return document;
    }

    public static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "?";
    }


}
