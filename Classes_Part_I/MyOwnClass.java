package CS203Course.Classes_Part_I;

import java.util.Scanner;

public class MyOwnClass {
    public int number;
    public String name;

    public MyOwnClass() {
        this.name = "Unknown";
        this.number = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public static String setNewName() {
        Scanner input = new Scanner(System.in);
        String newName = input.next();
        return newName;
    }

    public static String getNewName() {
        String newN = setNewName();
        return newN;
    }

    public static void main(String[] args) {
        MyOwnClass newClass = new MyOwnClass();
        String ne = getNewName();
        System.out.println(ne);
    }
}
