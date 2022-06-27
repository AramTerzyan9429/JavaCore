package homework.books;

import java.util.Objects;

public class Books {
    private String title;
    private String authorName;
    private String genre;
    private double price;
    private int count;

    public Books(String title, String authorName, String genre, double price, int count) {
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.price = price;
        this.count = count;
    }

    public Books() {

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Double.compare(books.price, price) == 0 && count == books.count && title.equals(books.title) && authorName.equals(books.authorName) && genre.equals(books.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, genre, price, count);
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
