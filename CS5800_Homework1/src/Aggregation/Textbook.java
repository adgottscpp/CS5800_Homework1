package Aggregation;
//The textbooks title, author and publisher. This information is accessed using the setter and getters of the texbooks class.
public class Textbook {
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;

    public Textbook(String newBookTitle, String newBookAuthor, String newBookPublisher) {
        this.bookTitle = newBookTitle;
        this.bookAuthor = newBookAuthor;
        this.bookPublisher = newBookPublisher;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
