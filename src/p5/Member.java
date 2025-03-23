package p5;

import p3.BorrowableBook;
import p4.PhysicalBook;

import java.util.List;

public class Member {
    private String id;
    private String name;
    private List<PhysicalBook>borrowedBooks;

    public Member(String id, String name, List<PhysicalBook> borrowedBooks) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PhysicalBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<PhysicalBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
