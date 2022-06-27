package homework.books;

import java.util.Scanner;

public class BooksDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input" + EXIT + "for exit");
            System.out.println("please input" + ADD_BOOK + " for add Book");
            System.out.println("please input " + PRINT_ALL + " for print all Book");
            System.out.println("please input " + PRINT_BOOK_BY_AUTHOR_NAME + " for print Books by authorName");
            System.out.println("please input " + PRINT_BOOK_BY_GENRE + "for print books by genre");
            System.out.println("please input " + PRINT_BOOK_BY_PRICE_RANGE + "for print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL:
                    bookStorage.printArray();
                    break;
                case PRINT_BOOK_BY_AUTHOR_NAME:
                    printAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOK_BY_PRICE_RANGE:
                    BookByPrice();
                    break;
                default:
                    System.out.println("Invalid command .please try again");
            }
        }
    }

    private static void BookByPrice() {
        System.out.println("please input price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input price");
        double price2 = Double.parseDouble(scanner.nextLine());
        bookStorage.printBookByPrice(price, price2);
    }

    private static void printBooksByGenre() {
        System.out.println("please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void printAuthorName() {
        System.out.println("please input authorName");
        String authorName = scanner.nextLine();
        bookStorage.printBookByAuthorName(authorName);
    }

    private static void addBook() {
        System.out.println("please input book title");
        String title = scanner.nextLine();
        System.out.println("please input book authorName");
        String authorName = scanner.nextLine();
        System.out.println("please input book price");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input book count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("please input book genre");
        String genre = scanner.nextLine();
        if (title == null || title.trim().isEmpty() || authorName == null || authorName.trim().isEmpty() || price <= 0 || count <= 0 || genre == null || genre.trim().isEmpty()) {
            System.out.println("No correct date");
            addBook();
        }

        Books books = new Books(title, authorName, genre, price, count);
        bookStorage.add(books);
        System.out.println("tank you,book added");
    }
}
