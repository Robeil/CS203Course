package CS203Course.Lab.Lab_1_1.Question_16;

public class WordCount {

    private int count;

    public void setCounter() {
        this.count = 0;
    }
    // counter---
    public int increaseCount(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                this.count = count++;
            }
        }
        return count;
    }

    // A method that decrement and making sure not to be less than zer0 0
    public void decreaseCount(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                this.count = count++;
            }
        }
        int count = 1;
        // adding every word to the array to get the first character
        String[] words = sentence.split(" ", count); //HERE to store every subStringed word
        for (String word : words) {
            if (word.charAt(0) == 'A' && word.charAt(0) == 'a') {
                this.count = count--;
            }
        }
        System.out.println("Making sure not to be less than 0 " +count);
    }
    //reset method
    public void reset() {
        this.count = 0;
        System.out.println("reset " +count);
    }
    // a method that print the current value of count
    public void printCount(){
        System.out.println("printing the count " +this.count);

    }
    //getter for the count property
    public int getCount() {
        return count;
    }
}
