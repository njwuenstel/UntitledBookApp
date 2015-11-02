
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;


/**
 * Created by Sun Prairie PC on 10/29/2015.
 */
public class BookSearch {

    static String GOODREADS_PATH = "https://www.goodreads.com";
    static String GOODREADS_KEY = "BVYrzrOuMKyw4m5tGrOqQ&q";



    public static void main(String[] args) throws Exception {

        BookSearch bookSearch = new BookSearch();

        bookSearch.searchBook("9780689840920");

//        System.out.println("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
//
//        bookSearch.searchBook("ender's game");
//
//        System.out.println("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
//
//        bookSearch.searchGoodReadsId("34");
    }


    /*
     *
     */
    private void goodreadsGet(URL url) throws Exception {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");


        InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        //String line;
        //while((line = reader.readLine()) != null) {
        //    System.out.println(line);
        //}

        String inputStreamString = new Scanner(inputStream,"UTF-8").useDelimiter("\\A").next();
        System.out.println(inputStreamString);

        //Customer customer = (Customer) jc.createUnmarshaller().unmarshal(xml);

        connection.disconnect();

    }

    private BookSearch jaxbCrusher(File inputXML) {

        BookSearch rootElement = null;

        try {
            /* Create a new instance of a JAXBContext object */
            JAXBContext jaxbContext = JAXBContext.newInstance(BookSearch.class);
            /* Instantiate the unmarshaller */
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        /*
         * 1. Create a variable of the xjc type of the root element in your xml
         * 2. Cast to your root element type
         * 3. Call 'unmarshal' method from the jaxBUnmarshaller passing the problemXML file
         *
         * This will return an object containing all the information in your xml, mapped
         * to the individual xjc objects.
         */
            rootElement = (BookSearch) jaxbUnmarshaller.unmarshal(inputXML);

        } catch (JAXBException e) {

            e.printStackTrace();
        }

        return rootElement;
    }


    public void searchBook(String search) throws Exception {

        String encodedString = encodeString(search);
        String uri = "https://www.goodreads.com/search/index.xml?key=" + GOODREADS_KEY + "=" + encodedString;
        URL url = new URL(uri);
        System.out.println(url);
        goodreadsGet(url);
    }


    public void searchGoodReadsId(String search) throws Exception {

        String encodedString = encodeString(search);
        String uri = "https://www.goodreads.com/book/show/" + encodedString + "?format=xml&key=" + GOODREADS_KEY;
        URL url = new URL(uri);
        System.out.println(url);
        goodreadsGet(url);
    }

    public void searchAuthor(String search) throws Exception {

        String encodedString = encodeString(search);
        String uri = "https://www.goodreads.com/api/author_url/" + encodedString + "?key=" + GOODREADS_KEY;
        URL url = new URL(uri);
        System.out.println(url);
        goodreadsGet(url);
    }


    //https://www.goodreads.com/api/author_url/Orson%20Scott%20Card?key=BVYrzrOuMKyw4m5tGrOqQ

    public String encodeString(String path) {

       URI uri = UriBuilder.fromUri(path)
                .build();

        return uri.toString().replace("'", "%27");
    }


}
