import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addElement(Book book){
        this.books.add(book);
    }
    public void removeElement(Book book){
        books.remove(0);
    }

    void printBooks(){
        for(Book book : books){
            System.out.println(book.getTitle());
        }
    }


}
