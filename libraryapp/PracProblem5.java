package libraryapp;

import library.*;

public class PracProblem5 {
    public static void main(String[] args) {
        Library libObj=new Library();

        Book book1=new Book("ABC","hamilton");
        Book book2=new Book("DEF","verstappen");
        Book book3=new Book("GHI","vettel");

        libObj.addBook(book1);
        libObj.addBook(book2);
        libObj.addBook(book3);

        libObj.removeBook(book2);

        libObj.listBooks();
    }
}