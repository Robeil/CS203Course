package CS203Course.Lab.Lab_1.Question_1;

public class Exercise_1 {

   public class Q1Main {
        public static void main( String[] args ) {
            Breed persian = new Breed("Persian", 10.0);
            Cat chacha = new Cat("Cha Cha", persian, 12.0);
            // fixme => i created mix Breed object to use for the bombom object
            Breed mix = new Breed("NewMix",12);
            //fixme => I insert the creatd bombom object
            Cat bombom = new Cat("Bom Bom", mix, 10.0);
            Breed chachaBreed = new Breed("chacha",11);
            //fixme the chacha should be breed object not cat
            Cat puffpuff = new Cat("Puff Puff", chachaBreed, 9.0);
            double diff = chacha.getWeight()
                    - persian.getWeight();
            System.out.println(
                    puffpuff.getBreed().getWeight());
        }
    }

}
