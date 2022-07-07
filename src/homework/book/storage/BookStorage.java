package homework.book.storage;

import homework.book.model.Book;
public class BookStorage {
    private Book[] books;
    public int size;

    public BookStorage() {
        books = new Book[10];
        size = 0;
    }

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = books[i];
        }
        temp = books;
    }

    public void printAllBooks() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.println(i + " " + books[i]);
            }
        } else {
            System.out.println("There are not any book");
        }
    }

    public void printBookByAuthor(String authorName) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (books[i].getAuthor().getName().equals(authorName)) {
                    System.out.println(books[i]);
                }
            }
        } else {
            System.out.println("There are not added Book");
        }
    }

    public void printBooksByGenre(String genre) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (books[i].getGenre().equals(genre)) {
                    System.out.println(books[i]);
                }
            }
        } else {
            System.out.println("There are not added Book");
        }
    }

    public void printBooksByPriceRange(double from, double to) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (books[i].getPrice() >= from && books[i].getPrice() <= to) {
                    System.out.println(books[i]);
                }
            }
        } else {
            System.out.println("There are not added Book");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
