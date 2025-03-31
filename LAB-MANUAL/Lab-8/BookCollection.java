import java.util.*;

class Book {
    int bookId;
    String bookName;
    String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Author: " + authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Collections.addAll(bookList,
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Effective Java", "Joshua Bloch"),
                new Book(103, "Clean Code", "Robert C. Martin"));

        System.out.println("Book List:");
        bookList.forEach(System.out::println);
    }
}
