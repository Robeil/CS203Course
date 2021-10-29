package CS203Course.Lab.Lab_1.Question_12;

public class BookStoreTest {

    public static void main(String[] args) {

        BookStore book1 = new BookStore("Kids", "Dane", "Mouna", "Robert", 12.99, 22);
        BookStore book2 = new BookStore("Engineering", "Steven", "Java", "Oracle", 21.99, 12);
        BookStore book3 = new BookStore("Story", "Gomes", "Java is Fun", "Oracle", 11.99, 9);
        System.out.println();
        //Kid-s books
        book1.setStoreId(123);
        System.out.println("Store "+book1.getStoreId() +" sold " +book1.totalSalesStatus(3)+" "+book1.getTitle() + ", book ID " +book1.getBookId());
        System.out.println("We have " + book1.availableBooks(3)+ " " +book1.getTitle() + " books available");

        System.out.println();
        //Story books
        book2.setStoreId(321);
        System.out.println("Store " + book2.getStoreId()+" sold " +book2.totalSalesStatus(2)+" "+book2.getTitle() + ", book ID " +book2.getBookId());
        System.out.println("We have " + book2.availableBooks(3)+ " " +book2.getTitle() + " books available");
        System.out.println();
        //Engineering books
        book3.setStoreId(231);
        System.out.println("Store " + book3.getStoreId()+" sold " +book3.totalSalesStatus(5)+" "+book3.getTitle() + ", book ID " +book3.getBookId());
        System.out.println("We have " + book3.availableBooks(3)+ " " +book3.getTitle() + " books available");

    }
}
