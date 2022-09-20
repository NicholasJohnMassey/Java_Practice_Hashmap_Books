import com.kenzie.app.BookShelf;

public class BookApp {
    public static void main(String[] args) {
        BookShelf favoriteReads = new BookShelf("Favorites");

        // add three books onto the bookshelf
        favoriteReads.getBookMap().put("J.K.Rowling", "Harry Potter");
        favoriteReads.getBookMap().put("Stephen King", "IT");
        favoriteReads.getBookMap().put("Barry Bird", "Java for Dummies");

        System.out.println(favoriteReads.getBookMap());


    }
}
