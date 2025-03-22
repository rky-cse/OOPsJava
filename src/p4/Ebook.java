package p4;

/**
 * Represents an electronic book. For this example, ebooks are not borrowable.
 */
public class Ebook extends LibraryItem {
    private double fileSize; // in MB

    public Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * Displays the details of the ebook.
     */
    @Override
    public void displayDetails() {
        System.out.println("Ebook - Title: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nFile Size: " + fileSize + " MB");
    }
}
