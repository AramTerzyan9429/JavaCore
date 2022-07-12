package homework.book.model;

import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private String genre;
    private double price;
    private int count;
    private User registeredUser;


    public Book(String title, Author author, String genre, double price, int count,User registeredUser) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.count = count;
        this.registeredUser=registeredUser;
    }

    public Book() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && count == book.count && title.equals(book.title) && author.equals(book.author) && genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, price, count);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", registeredUser='" + registeredUser + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
