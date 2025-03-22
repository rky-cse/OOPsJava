package p4;

import p3.Borrowable;

/**
 * Represents a physical book that can be borrowed.
 */
public class PhysicalBook extends LibraryItem implements Borrowable {
    private String borrower; // Tracks the current borrower (null if available)

    public PhysicalBook(String title, String author) {
        super(title, author);
        this.borrower = null;
    }

    /**
     * Displays the details of the physical book, including its borrowing status.
     */
    @Override
    public void displayDetails() {
        String status = isBorrowed() ? "Borrowed by " + borrower : "Available";
        System.out.println("Physical Book - Title: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nStatus: " + status);
    }

    /**
     * Borrows the book if it is available.
     */
    @Override
    public void borrowItem(String borrowerName) {
        if (isBorrowed()) {
            System.out.println("Cannot borrow. This book is already borrowed by " + borrower + ".");
        } else {
            borrower = borrowerName;
            System.out.println("Book borrowed by " + borrowerName + ".");
        }
    }

    /**
     * Returns the book if it is currently borrowed.
     */
    @Override
    public void returnItem() {
        if (!isBorrowed()) {
            System.out.println("This book is not currently borrowed.");
        } else {
            System.out.println("Book returned by " + borrower + ".");
            borrower = null;
        }
    }

    /**
     * Checks if the book is currently borrowed.
     */
    @Override
    public boolean isBorrowed() {
        return borrower != null;
    }
}
