package BookDTO;

public class BookDTO {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    // Constructor
    public BookDTO(String isbn, String bookName, String author, String publisher, double price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // Getter methods
    public String getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s | Book Name: %s | Author: %s | Publisher: %s | Price: %, .0f원",
                isbn, bookName.trim(), author.trim(), publisher.trim(), price);
    }
}
