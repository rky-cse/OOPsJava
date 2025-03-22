package p2;
import p1.Book;

/**
 * Represents an electronic Book (EBook) that extends Book by adding a fileSize attribute.
 */
public class EBook extends Book {
    private double fileSize; // in MB

    // No-argument constructor
    public EBook() {}

    // Parameterized constructor for full initialization
    public EBook(String title, String author, double price, double fileSize) {
        super(title, author, price);  // Initialize inherited properties
        this.fileSize = fileSize;
    }

    // Getter and Setter for fileSize
    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Overridden toString() method to include fileSize along with the Book details
    @Override
    public String toString() {
        return "EBook [File Size: " + fileSize + " MB, " + super.toString() + "]";
    }
}
