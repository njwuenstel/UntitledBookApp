package goodreads.service.pojo;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Sun Prairie PC on 11/8/2015.
 */
public class WorkBean {

    private String title;
    private String author;
    private String goodreadsId;

    private String isbn;
    private String description;
    private String imageUrl;
    private String yearFirstPublished;
    private int numberOfPages;

    /* no argument constructor */
    public WorkBean() {}

    /* getters and setters */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGoodreadsId() {
        return goodreadsId;
    }

    public void setGoodreadsId(String goodreadsId) {
        this.goodreadsId = goodreadsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getYearFirstPublished() {
        return yearFirstPublished;
    }

    public void setYearFirstPublished(String yearFirstPublished) {
        this.yearFirstPublished = yearFirstPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter, true);

        writer.println("Title: " + getTitle());
        writer.println("Author: " + getAuthor());
        writer.println("ISBN: " + getIsbn());
        writer.println("Good Reads ID: " + getGoodreadsId());
        writer.println("Image URL: " + getImageUrl());
        writer.println("Year First Published: " + getYearFirstPublished());
        writer.println("Number of Pages: " + getNumberOfPages());
        writer.println("Description: " + getDescription());

        return stringWriter.toString();
    }


}
