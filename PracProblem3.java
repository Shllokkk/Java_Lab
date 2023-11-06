class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        System.out.println("Inside Constructor with 3 parameters.....");
        this.title=title;
        this.author=author;
        this.year=year;
    }

    Book(String title, String author) {
        this(title,author,-1);
        System.out.println("Inside Constructor with 2 parameters.....");
    }
    Book(String title) {
        this(title,"unknown",-1);
        System.out.println("Inside Constructor with 1 parameters.....");
    }

    void displayInfo() {
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Year: "+this.year);
    }
}

public class PracProblem3 {
    public static void main(String[] args) {
        new Book("Java Programming").displayInfo();
        new Book("Design Pattern","John Doe").displayInfo();
        new Book("Data Structures","Jane Smith",2020).displayInfo();
    }
}   