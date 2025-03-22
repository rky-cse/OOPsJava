import p1.Book;
import p2.EBook;
import p4.Ebook;
import p4.Library;
import p4.LibraryItem;
import p4.PhysicalBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates polymorphism by storing both Book and EBook objects in a common collection.
 */
public class Main {
    public static void main(String[] args) {



        //p3

        //p3

        //p4
        Library library = new Library();

        // Create physical books
        PhysicalBook pb1 = new PhysicalBook("1984", "George Orwell");
        PhysicalBook pb2 = new PhysicalBook("Animal Farm", "George Orwell");

        // Create an ebook
        Ebook ebook1 = new Ebook("Digital Fortress", "Dan Brown", 2.5);

        // Add items to the library
        library.addItem(pb1);
        library.addItem(pb2);
        library.addItem(ebook1);

        // Display all items
        System.out.println("All library items:");
        library.displayAllItems();

        // Borrow a physical book
        System.out.println("\nAttempting to borrow '1984':");
        pb1.borrowItem("Alice");

        // Try borrowing the same book again
        System.out.println("\nAttempting to borrow '1984' again:");
        pb1.borrowItem("Bob");

        // Return the book
        System.out.println("\nReturning '1984':");
        pb1.returnItem();

        // Search for items by title containing "Animal"
        System.out.println("\nSearch results for 'Animal':");
        for (LibraryItem item : library.searchByTitle("Animal")) {
            item.displayDetails();
            System.out.println("------");
        }

    }
}
