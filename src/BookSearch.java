import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;


/**
 * Created by Sun Prairie PC on 10/29/2015.
 */
public class BookSearch {

    static String GOODREADS_PATH = "https://www.goodreads.com";
    static String GOODREADS_KEY = "BVYrzrOuMKyw4m5tGrOqQ&q";



    public static void main(String[] args) throws Exception {

        BookSearch bookSearch = new BookSearch();

        bookSearch.searchBook("2964424");

        System.out.println("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");

        bookSearch.searchBook("ender's game");

        System.out.println("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");

        bookSearch.searchGoodReadsId("34");
    }


    private void goodreadsGet(URL url) throws Exception {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");

        //JAXBContext jc = JAXBContext.newInstance(Customer.class);
        InputStream xml = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        while((line = reader.readLine()) != null) {
            //System.out.println(line);
        }
        //System.out.print(xml);

        //Customer customer = (Customer) jc.createUnmarshaller().unmarshal(xml);

        connection.disconnect();

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
