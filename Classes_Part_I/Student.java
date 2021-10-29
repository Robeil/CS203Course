package CS203Course.Classes_Part_I;

public class Student {
    String name = "Robeil Aregawi";
    static int id = 1; // we have to declare is with static to be accessed by static and non-static method

    public void access(){
        int result = id + id;
        System.out.println(result);
    }
    public static void accessStatic(){
        int result = id + id;
        System.out.println(result);
    }
}
