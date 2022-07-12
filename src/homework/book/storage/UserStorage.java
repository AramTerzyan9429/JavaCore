package homework.book.storage;

import homework.book.model.User;

public class UserStorage {
    private User[] books;
    public int size;

    public UserStorage() {
        books = new User[10];
        size = 0;
    }
    public void add(User book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }
    private void extend() {
        User[] temp = new User[books.length + 10];
        System.arraycopy(books, 0, temp, 0, books.length);

        temp = books;
    }

    public void printAllUsers() {
        if (!isEmpty
                ()) {
            for (int i = 0; i < size; i++) {
                System.out.println(i + " " + books[i]);
            }
        } else {
            System.out.println("There are not any book");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getEmail().equals(email)) {
                return books[i];
            }
        }
        return null;
    }
}
