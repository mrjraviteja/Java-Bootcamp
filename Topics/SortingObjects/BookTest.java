package SortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {
    public static void main(String args[])
    {
        List<Book> library = new ArrayList<>();
        library.add(new Book("Java Programming", 2019));
        library.add(new Book("Algorithms Unleashed", 2022));
        library.add(new Book("Data Structures Explained", 2017));

        Collections.sort(library);

        System.out.println("Books sorted by release year: ");
        for(Book book: library)
        {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }

        System.out.println();
        System.out.println("Books sorted alphabetically: ");
        Collections.sort(library,new TitleComparator());
        for(Book book: library)
        {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
    }
}
