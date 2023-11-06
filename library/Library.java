package library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> collection=new ArrayList<>();

    public void addBook(Book book) {
        collection.add(book);
        System.out.println(book.title+" book has been added");
    }

    public void removeBook(Book book) {
        collection.remove(book);
        System.out.println(book.title+" book has been removed");
    }

    public void listBooks() {
        System.out.println("List of Books");
        if(!collection.isEmpty()) {
            int size=collection.size();
            int i=0;
            while(i<size) {
                collection.get(i).showData();
                i++;
            }
        }
    }
}