package CS203Course.Lab.Lab_1.Question_14;

import java.util.Scanner;

public class WordCount {

    private int count;

    public void setCounter() {
        this.count = 0;
    }

    //return current counter
    public int currentCount() {
        return this.count;
    }

    // counter---
    public int charCounter(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                this.count = count++;
            }
        }
        return count;
    }

    // A method that count every word and start with a decrement =>counter+++
    public void wordCounter(String sentence) {

        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                this.count = count++;
            }
        }
        // adding every word to the array to get the first character
        String[] words = sentence.split(" ", count); //HERE to store every subStringed word
        for (String word : words) {
            if (word.charAt(0) == 'A' && word.charAt(0) == 'a') {
                this.count = count--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        WordCount obj1 = new WordCount();

        System.out.println("Please enter any sentence.");
        String sentence = input.nextLine();

        obj1.setCounter();
        obj1.wordCounter(sentence);
        System.out.println(obj1.charCounter(sentence));
        System.out.println(obj1.currentCount());


    }
}
