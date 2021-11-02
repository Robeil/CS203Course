package CS203Course.Lab.Lab_1_1.Question_1;

import CS203Course.Lab.Lab_1.Question_1.Breed;
import CS203Course.Lab.Lab_1.Question_1.Cat;

public class Q1 {
    public static void main( String[] args ) {
        CS203Course.Lab.Lab_1.Question_1.Breed persian = new CS203Course.Lab.Lab_1.Question_1.Breed("Persian", 10.0);
        CS203Course.Lab.Lab_1.Question_1.Cat chacha = new CS203Course.Lab.Lab_1.Question_1.Cat("Cha Cha", persian, 12.0);
        // fixme => i created mix Breed object to use for the bombom object
        CS203Course.Lab.Lab_1.Question_1.Breed mix = new CS203Course.Lab.Lab_1.Question_1.Breed("NewMix",12);
        //fixme => I insert the creatd bombom object
        CS203Course.Lab.Lab_1.Question_1.Cat bombom = new CS203Course.Lab.Lab_1.Question_1.Cat("Bom Bom", mix, 10.0);
        CS203Course.Lab.Lab_1.Question_1.Breed chachaBreed = new Breed("chacha",11);
        //fixme the chacha should be breed object not cat
        CS203Course.Lab.Lab_1.Question_1.Cat puffpuff = new Cat("Puff Puff", chachaBreed, 9.0);
        double diff = chacha.getWeight()
                - persian.getWeight();
        System.out.println(
                puffpuff.getBreed().getWeight());
    }

}
