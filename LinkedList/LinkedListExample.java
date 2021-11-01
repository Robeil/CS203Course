package CS203Course.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>(); //fixme => LinkedList created HERE
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Nissan");

        System.out.println(cars);

        for(String c: cars){
            System.out.println(c +" ");
        }

    }
}
