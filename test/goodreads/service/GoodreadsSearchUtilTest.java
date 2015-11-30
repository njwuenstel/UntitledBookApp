package goodreads.service;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;


/**
 * Created by Sun Prairie PC on 11/30/2015.
 */
public class GoodreadsSearchUtilTest {

    GoodreadsSearchUtil searchUtil = new GoodreadsSearchUtil();

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getSearchBookUrlTest() {

        String searchItem = "screwtape";
        URL testUrl = null;
        URL expectedUrl = null;

        try {

            expectedUrl = new URL(searchUtil.SEARCH_BOOK_URL + searchItem);
            testUrl = searchUtil.getSearchBookUrl(searchItem);

        } catch (MalformedURLException e) {

        }

        assertEquals("The method did not return the expected URL", testUrl, expectedUrl);
    }

    @Test
    public void getShowBookUrlTest() {

        String searchItem = "17383917";
        URL testUrl = null;
        URL expectedUrl = null;

        try {

            expectedUrl = new URL(searchUtil.SHOW_BOOK_URL_FRONT + searchItem + searchUtil.SHOW_BOOK_URL_BACK);
            testUrl = searchUtil.getShowBookUrl(searchItem);

        } catch (MalformedURLException e) {

        }

        assertEquals("The method did not return the expected URL", testUrl, expectedUrl);
    }

    @Test
    public void getSearchAuthorUrlTest() {

        String searchItem = "Lewis";
        URL testUrl = null;
        URL expectedUrl = null;

        try {

            expectedUrl = new URL(searchUtil.SEARCH_AUTHOR_URL_FRONT + searchItem + searchUtil.SEARCH_AUTHOR_URL_BACK);
            testUrl = searchUtil.getSearchAuthorUrl(searchItem);

        } catch (MalformedURLException e) {

        }

        assertEquals("The method did not return the expected URL", testUrl, expectedUrl);
    }

    @Test
    public void encodeStringTest() {

        String encodedString;
        String inputString = "This is a test's test #?&!";
        String expectedEncodedString = "This%20is%20a%20test%27s%20test%20#?&!";

        encodedString = searchUtil.encodeString(inputString);

        assertEquals("The string did not encode as expected", encodedString, expectedEncodedString);
    }

    @Test
    public void goodreadsGetConnectionTest() {

        String searchItem = "screwtape";
        URL testUrl = null;

        HttpURLConnection testConnection = null;

        try {

            testUrl = new URL(searchUtil.SEARCH_BOOK_URL + searchItem);
            testConnection = searchUtil.goodreadsGetConnection(testUrl);

        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }

        assertEquals("The connection did not contain the expected URL", testConnection.getURL(), testUrl);
    }

}
