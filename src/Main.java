import java.util.Locale;
import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Library library = new Library();

        Reader reader = new Reader("Viktor");

        Book book1 = new Book("Zhelezniyat Svetilnik", "Stratiev", 1999);
        Book book2 = new Book("The Secret Adversary", "Christie", 1998);
        Book book3 = new Book("The Murder on the Links", "Christie", 1997);
        Book book4 = new Book("The Mystery of the Blue Train", "Christie", 1996);

        library.addElement(book1);
        library.addElement(book2);
        library.addElement(book3);
        library.addElement(book4);

        reader.Rent(library, book1);
        reader.Rent(library, book2);
        reader.Rent(library, book3);
        reader.Rent(library, book4);

        reader.Return(library, book3);

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();

        Book book5 = new Book(title, author, year);
        BookProcessor bookTwo = new BookProcessor(book1);
        bookTwo.start();
        bookTwo.interrupt();

    }
}