package homework.book.storage;

import homework.book.exception.AuthorNotFountException;
import homework.book.model.Author;

public class AuthorStorage {
    private Author[] authors;
    public int size;


    public AuthorStorage() {
        authors = new Author[10];
        size = 0;
    }

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    public Author getAuthorByIndex(int index) throws AuthorNotFountException, ArrayIndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            if (authors[index] == null) {
                throw new AuthorNotFountException("Author was not found by index" + index);
            }
        } else if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index was great or equal with size");
        }
        return authors[index];
    }

    public void printAuthor() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " " + authors[i]);
            System.out.println();
        }
    }

    public void extend() {
        Author[] temp = new Author[authors.length + 10];
        for (int i = 0; i < authors.length; i++) {
            temp[i] = authors[i];
        }
        authors = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

