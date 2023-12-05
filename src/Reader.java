import java.util.ArrayList;

public class Reader {
    String name;
    ArrayList<String> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void Rent(Library library, Book book){
        library.removeElement(book);
        borrowedBooks.add(book.title);
    }

    public void Return(Library library, Book book){
        library.addElement(book);
        borrowedBooks.remove(book);
    }

}
