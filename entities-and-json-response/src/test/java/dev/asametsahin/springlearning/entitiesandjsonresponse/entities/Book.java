package dev.asametsahin.springlearning.entitiesandjsonresponse.entities;

public class Book {
    private int ISBN;
    private String author;
    private int salesCount;

    public Book(int ISBN, String author, int salesCount) {
        this.ISBN = ISBN;
        this.author = author;
        this.salesCount = salesCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }


}
