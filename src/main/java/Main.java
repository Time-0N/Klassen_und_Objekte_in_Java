import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void addBookToLib(Book[] lib1, int selectedSlot, Book book) {
        lib1[selectedSlot] = book;
    }

    public static void main(String[] args) {
        Lib lib = new Lib();
        Scanner sc = new Scanner(System.in);
        Book[] lib1 = lib.getLib();
        int selectedSlot;
        String bookName;
        String authorName;
        int isbnName;

        while (true) {
            System.out.println("1 to add to lib, 2 to read lib, 3 to exit program");
            int start = sc.nextInt();

            if (3 == start) {
                break;
            }

            switch (start) {
                case 1:
                    System.out.println("Enter the Name of the book");
                    bookName = sc.next();
                    System.out.println("Enter the Name of the author");
                    authorName = sc.next();
                    System.out.println("Enter the isbn of the book");
                    isbnName = sc.nextInt();

                    Book book = new Book(bookName, authorName, isbnName);

                    while (true) {
                        System.out.println("Enter the Slot to safe book on");
                        selectedSlot = sc.nextInt();
                        selectedSlot--;
                        if (lib1.length >= selectedSlot && selectedSlot >= 0) {
                            break;
                        } else {
                            System.out.println("Number is to big");
                        }
                    }
                    addBookToLib(lib1, selectedSlot, book);

                    System.out.println(book);

                    System.out.println(lib);
                    break;
                case 2:
                    System.out.println(lib);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
