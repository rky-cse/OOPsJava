package freeCodeCampExercise.Ex2;

public class Book {
    private String title;
    private String author;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);

    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }

    public static void main(String[] args) {

        freeCodeCampExercise.Ex1.Book book1=new freeCodeCampExercise.Ex1.Book("Book 1","John Doe");
        freeCodeCampExercise.Ex1.Book book2=new freeCodeCampExercise.Ex1.Book("Book 2","John Doe");
        Book book3=new Book();
        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
    }

}

