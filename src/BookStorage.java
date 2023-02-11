import java.util.HashSet;
import java.util.Set;

public class BookStorage {
    private Set<Book> allBooks;

    // book storage constructor
    BookStorage(){
        this.allBooks = new HashSet<>();
    }

    // get Book from storage using name
    public Book getBookByName(String name){
        for(Book desiredBook : this.allBooks){
            if (name.equals(desiredBook.getName())){
                return desiredBook;
            }
        }
        return null;
    }

    // get Book from storage using barcode
    public Book getBookByBarCode(String barCode){
        for(Book desiredBook : this.allBooks){
            if (barCode.equals(desiredBook.getBarCode())){
                return desiredBook;
            }
        }

        return null;
    }

    // add book in library storage
    public void addNewBook(Book newBook){
        this.allBooks.add(newBook);
    }

    // remove book from storage
    public void removeBook(Book certainBook){
        this.allBooks.remove(certainBook);
    }

}