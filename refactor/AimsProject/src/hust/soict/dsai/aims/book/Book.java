package hust.soict.dsai.aims.book;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Media;

/**
* @author Đinh Văn Luận - 20215083
*/

public class Book extends Media {
    private static int nbBooks = 0;
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost) {
        this.id = Book.nbBooks;
        this.category = category;
        this.title = title;
        this.cost = cost;
        Book.nbBooks++;
    }

    public boolean addAuthor(String authorName) {
        // check author already?
        // found => index of that authorName in list else return -1
        if (authors.indexOf(authorName) >= 0) return false;

        authors.add(authorName);

        return true;
    }

    public boolean removeAuthor(String authorName) {
        // check author already?
        if (authors.indexOf(authorName) < 0) return false;
        
        authors.remove(authorName);

        return true;
    }

}