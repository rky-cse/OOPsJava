package p4;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages a collection of library items.
 */
public class Library {
    private List<LibraryItem> allItems = new ArrayList<>();

    /**
     * Adds an item to the library.
     */
    public void addItem(LibraryItem item) {
        allItems.add(item);
    }

    /**
     * Displays details of all items in the library.
     */
    public void displayAllItems() {
        for (LibraryItem item : allItems) {
            item.displayDetails();
            System.out.println("------");
        }
    }

    /**
     * Searches for library items by title.
     * @param title The title (or part of it) to search for.
     * @return List of matching items.
     */
    public List<LibraryItem> searchByTitle(String title) {
        List<LibraryItem> matchingItems = new ArrayList<>();
        for (LibraryItem item : allItems) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                matchingItems.add(item);
            }
        }
        return matchingItems;
    }
}
