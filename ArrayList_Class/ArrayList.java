package CS203Course.ArrayList_Class;

import java.util.ArrayList;

class ArrayList_Ex {

    public ArrayList_Ex() {
    }

    public static String firstMethod() {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Robeil");
        nameList.add("Soliana");
        String name = nameList.get(0);

        return name;
    }

   /* public boolean add(String name) {
        String newName = firstMethod();
        System.out.println(add("Aregawi"));
        System.out.println(newName);

        return true;
    }*/

    public static void main(String[] args) {

        System.out.println(firstMethod());

    }

}
