package CS203Course.Lab.Lab_1_1.Question_16;

public class WordTest {


    public static void main(String[] args) {

        WordCount word = new WordCount();

        word.decreaseCount("This is test one");
        word.increaseCount("That one was really good");

        word.printCount();
        word.reset();
    }


}
