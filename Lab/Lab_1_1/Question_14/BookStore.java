package CS203Course.Lab.Lab_1_1.Question_14;

import java.util.ArrayList;

public class BookStore {

    private Book kidsBooks;
    private Book engineeringBooks;
    private Book storyBooks;
    private int numberOfBooksSold;
    private int totalAvailableBooksInStore;

    public BookStore() {

    }

    public BookStore(Book kidsBooks, Book engineeringBooks, Book storyBooks, int numberOfBooksSold) {
        this.kidsBooks = kidsBooks;
        this.engineeringBooks = engineeringBooks;
        this.storyBooks = storyBooks;
        this.numberOfBooksSold = numberOfBooksSold;
    }

    //tracking the sold books and printing available
    public void trackSalesStatus(int numberOfBooksSold) {

        this.numberOfBooksSold = numberOfBooksSold;
        System.out.println("The books we sold: " + numberOfBooksSold);
    }

    public int getTrackSalesStatus() {
        return this.totalAvailableBooksInStore - this.numberOfBooksSold;
    }

    //trucking available books
    public void bookQuantity(int kidsQuantity, int storyQuantity, int engineeringQuantity) {

        totalAvailableBooksInStore = (kidsQuantity + storyQuantity + engineeringQuantity) - numberOfBooksSold;

    }

    public static void main(String[] args) {

        BookStore bookStoreAround = new BookStore();

        //creating arraylist books
        ArrayList<Book> kidsBooks = new ArrayList<>();
        ArrayList<Book> engineeringBooks = new ArrayList<>();
        ArrayList<Book> storyBooks = new ArrayList<>();

        //creating books
        Book kids = new Book("Kids", "Debesai Weldu", "Nebere Nebere", "Excelent", 12.99, 25);
        Book story = new Book("Engineering", "Merhawi Kidane", "Java is Fun", "Educational", 9.99, 36);
        Book eng = new Book("Story", "Aklilulu Tesfatsion", "True love", "Entertaining", 19.99, 56);

        //adding the created books to the arrayList
        kidsBooks.add(kids);
        storyBooks.add(story);
        engineeringBooks.add(eng);

        bookStoreAround.bookQuantity(25, 36, 56);
        bookStoreAround.trackSalesStatus(19);
        System.out.println("Available books now in our Store: " + bookStoreAround.getTrackSalesStatus());


    }
}
