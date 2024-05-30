package objects;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /**
     * IBook
     */
    public class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book [title=" + title + ", author=" + author + "]";
        }

    }

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

}
