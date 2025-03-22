package p3;

/**
 * Interface defining borrowing behavior for library items.
 */
public interface Borrowable {
    /**
     * Borrow the item using the provided borrower's name.
     * @param borrowerName The name of the borrower.
     */
    void borrowItem(String borrowerName);

    /**
     * Return the item.
     */
    void returnItem();

    /**
     * Check if the item is currently borrowed.
     * @return true if the item is borrowed, false otherwise.
     */
    boolean isBorrowed();
}
