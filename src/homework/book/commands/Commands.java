package homework.book.commands;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL = 2;
    int PRINT_BOOK_BY_AUTHOR_NAME = 3;
    int PRINT_BOOK_BY_GENRE = 4;
    int PRINT_BOOK_BY_PRICE_RANGE = 5;

    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

     static void printCommands(){
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_BOOK + " for add Book");
        System.out.println("please input " + PRINT_ALL + " for print all Book");
        System.out.println("please input " + PRINT_BOOK_BY_AUTHOR_NAME + " for print Book by authorName");
        System.out.println("please input " + PRINT_BOOK_BY_GENRE + " for print books by genre");
        System.out.println("please input " + PRINT_BOOK_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + PRINT_ALL_AUTHOR + " For print all author");
    }
}
