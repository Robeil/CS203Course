package ArrayList_Class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Class {

    public static void array_list() {

        ArrayList<String> list = new ArrayList<>(5);
        list.add("Robeil");
        list.add(0, "Soliana");
        list.add("Haben");
        list.add("Keleab");
        list.set(0, "Aregawi");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void duplicatedNumber() {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(10);
        System.out.println("Please enter your number");


        for (int i = 0; i < 10; i++) {
            int temp = input.nextInt();
            if (!numbers.contains(temp)) {
                numbers.add(temp);
            }
            Collections.sort(numbers);
        }
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        //array_list();
        duplicatedNumber();

    }
}
