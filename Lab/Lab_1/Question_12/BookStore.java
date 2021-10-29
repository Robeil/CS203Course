package CS203Course.Lab.Lab_1.Question_12;

public class BookStore {
    private String category;
    private String author;
    private String title;
    private String publisher;
    private int storeId;
    private int bookId;
    private double price;
    private static  int quantity;

    public BookStore(String category, String author, String title, String publisher, double price, int quantity) {
        this.category = category;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;

    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //tracking total sold books
    public static int totalSalesStatus(int bookSold) {

        if (bookSold <= quantity) {
            return bookSold;
        } else {
            System.out.println("Sorry we are out");
        }
        return bookSold;
    }

    //Printing available books in store
    public int availableBooks(int bookSold) {

        int available = 0;

        if (bookSold == this.quantity) {
            System.out.println("Sorry we don't have any available right now");
        } else {
            available = this.quantity - totalSalesStatus(bookSold);
        }
        return available;
    }
}
