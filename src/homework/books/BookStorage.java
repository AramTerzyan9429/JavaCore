package homework.books;

import homework.ExtendsLesson15.B;

public class BookStorage {


    private Books[] array = new Books[10];
    private int size = 0;

    public void add(Books books) {
        if (array.length == size) {
            extend();
        }
        array[size++] = books;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void printBookByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printBookByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }

        }
    }

    public void printBookByPrice(double price, double price2) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= price && array[i].getPrice() <= price2) {
                System.out.println(array[i]);
            }
        }
    }

    public void extend() {
        Books[] temp = new Books[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}


