package p3;
import p1.Book;

/**
 * Represents a Book that can be borrowed.
 */
public class BorrowableBook extends Book implements Borrowable {
    private String borrower; // Tracks the current borrower's name

    /**
     * Parameterized constructor to initialize a BorrowableBook.
     */
    public BorrowableBook(String title, String author, double price) {
        super(title, author, price);
    }

    /**
     * Attempts to borrow the book. If already borrowed, prints a message.
     */
    @Override
    public void borrowItem(String borrowerName) {
        if (!isBorrowed()) {
            this.borrower = borrowerName;
        } else {
            System.out.println("Book is already borrowed by: " + this.borrower);
        }
    }

    /**
     * Returns the book, clearing the borrower information.
     */
    @Override
    public void returnItem() {
        if (isBorrowed()) {
            this.borrower = null;
        } else {
            System.out.println("Book is not currently borrowed.");
        }
    }

    /**
     * Checks if the book is currently borrowed.
     * @return true if a borrower is recorded, false otherwise.
     */
    @Override
    public boolean isBorrowed() {
        return borrower != null;
    }

    /**
     * Provides a string representation of the book, including borrowing status.
     */
    @Override
    public String toString() {
        String status = isBorrowed() ? "Borrowed by: " + borrower : "Available";
        return super.toString() + " (" + status + ")";
    }
}
