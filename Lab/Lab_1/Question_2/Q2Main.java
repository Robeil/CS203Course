package CS203Course.Lab.Lab_1.Question_2;

import CS203Course.Lab.Lab_1.Question_1.Breed;
import CS203Course.Lab.Lab_1.Question_1.Cat;

public class Q2Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("winky", new Breed("mix", 10.5), 9.5);
        System.out.println(myCat.getWeight());
        System.out.println(myCat.getBreed().getWeight());
    }
}
/*
FIXME The output =>cat weight = 9.5
FIXME The output =>breed weight = 10.5
 */
