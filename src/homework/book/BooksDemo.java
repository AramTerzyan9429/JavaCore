package homework.book;


import homework.book.commands.Commands;
import homework.book.exception.AuthorNotFountException;
import homework.book.model.Author;
import homework.book.model.Book;
import homework.book.model.Role;
import homework.book.model.User;
import homework.book.storage.AuthorStorage;
import homework.book.storage.BookStorage;
import homework.book.storage.UserStorage;

import java.util.Scanner;

public class BooksDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;


    public static void main(String[] args) {
        userStorage.add(new User("Aram", "Terzyan", "admin@mail.com", "admin", Role.ADMIN));
        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:

                    System.out.println("Invalid command .please try again");
            }
        }
    }

    private static void login() {
        System.out.println("please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("user does not exists");
        } else if (!user.getPassword().equals(emailPassword[1])) {
            System.out.println("password is wrong!");
        } else {
            currentUser = user;
            if (user.getRole() == Role.ADMIN) {
                loginAdmin();
            } else if (user.getRole() == Role.USER) {
                userLogin();
            }
        }
    }


    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input correct user data");
        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.add(user);
                System.out.println("User registered!");
            } else {
                System.out.println("User with" + userData[2] + "already exists");
            }
        }
    }

    private static void userLogin() {
        System.out.println("Welcome ," + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case LOGOUT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL:
                    bookStorage.printAllBooks();
                    break;
                case PRINT_BOOK_BY_AUTHOR_NAME:
                    printBookByAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOK_BY_PRICE_RANGE:
                    printBookByPriceRange();
                    break;

                case PRINT_ALL_AUTHOR:
                    authorStorage.printAuthor();
                    break;
                default:
                    System.out.println("Invalid command .please try again");
            }
        }
    }

    private static void loginAdmin() {
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case LOGOUT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL:
                    bookStorage.printAllBooks();
                    break;
                case PRINT_BOOK_BY_AUTHOR_NAME:
                    printBookByAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOK_BY_PRICE_RANGE:
                    printBookByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.printAuthor();
                    break;
                default:
                    System.out.println("Invalid command .please try again");
            }
        }
    }

    private static void printBookByPriceRange() {
        System.out.println("please input price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input price");
        double price2 = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(price, price2);
    }

    private static void printBookByGenre() {
        System.out.println("please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBookByAuthorName() {
        System.out.println("please input authorName");
        String authorName = scanner.nextLine();
        bookStorage.printBookByAuthor(authorName);
    }

    private static void addAuthor() {
        System.out.println("Please input by AuthorName");
        String name = scanner.nextLine();
        System.out.println("please input by surname");
        String surname = scanner.nextLine();
        System.out.println("please input by author email");
        String email = scanner.nextLine();
        System.out.println("please input gender MALE or FEMALE");
        String gender = scanner.nextLine();
        String genderUpperCase = gender.toUpperCase();
        if (genderUpperCase.equals("MALE") || genderUpperCase.equals("FEMALE")) {
            Author author = new Author(name, surname, email, gender);
            authorStorage.add(author);
            System.out.println("author created");

        } else {
            System.out.println("no correct gender");
            addAuthor();
        }
    }

    private static void addBook() {
        if (authorStorage.isEmpty()) {
            System.out.println("please add author");
            addAuthor();
        } else {
            authorStorage.printAuthor();
            System.out.println("please choose index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            try {
                Author author = authorStorage.getAuthorByIndex(authorIndex);
                System.out.println("please input book title");
                String title = scanner.nextLine();
                System.out.println("please input book price");
                try {
                    Double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("please input book count");
                    int count = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input book genre");
                    String genre = scanner.nextLine();
                    if (title == null || title.trim().isEmpty() || price <= 0 || count <= 0 || genre == null || genre.trim().isEmpty()) {
                        System.out.println("No correct date");
                        addBook();
                    }
                    Book book = new Book(title, author, genre, price, count, currentUser);
                    bookStorage.add(book);
                    System.out.println("tank you,book added");
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    addBook();
                }
            } catch (AuthorNotFountException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                addBook();
            }
        }
    }
}