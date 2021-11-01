package CS203Course.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //Make a collections
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //get the iterator
        Iterator<String> it  = cars.iterator();


        //printing the first items
        System.out.println(it.next());


        while(it.hasNext()){

            System.out.println(it.next());
        }

        Iterator<Integer> its = numbers.iterator();
        System.out.println(its.next());

        while(its.hasNext()){
            Integer i = its.next();
            if(i < 10){
                its.remove();
            }
        }
        System.out.println(numbers);
    }
}
