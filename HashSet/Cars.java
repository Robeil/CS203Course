package CS203Course.HashSet;

import java.util.HashSet;

public class Cars {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>(); //fixme => creating hashSet HERE

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.contains("Mazda"));

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
