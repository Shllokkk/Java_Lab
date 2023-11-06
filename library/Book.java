package library;

import libutility.Utility;

public class Book {
    String title;
    String author;
    long isbn;

    public Book(String title, String author) {
        this.title=title;
        this.author=author;
        try {
            this.isbn=Utility.generateISBN();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showData() {
        System.out.println("Title: "+this.title+" Author: "+this.author+" ISBN: "+this.isbn);
    }
}