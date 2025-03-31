package lab8;

import java.util.ArrayList;
import java.util.List;

class BookCollection {
    private int bookId;
    private String bookName;
    private String authorName;

    // Constructor to initialize book details
    public BookCollection(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId + ", Name: " + bookName + ", Author: " + authorName);
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Creating a List to store books
        List<BookCollection> bookList = new ArrayList<>();

        // Adding book objects to the list
        bookList.add(new BookCollection(101, "Java Programming", "James Gosling"));
        bookList.add(new BookCollection(102, "Effective Java", "Joshua Bloch"));
        bookList.add(new BookCollection(103, "Clean Code", "Robert C. Martin"));

        // Displaying all books using a for-each loop
        System.out.println("Book List:");
        for (BookCollection book : bookList) {
            book.displayBook();
        }
    }
}
