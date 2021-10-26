package CS203Course;

public class Intro {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("before executing");
        System.out.println(x); // x = 3
        System.out.println(y); // y = 4

        int result = x + y + ++x - y--;
        System.out.println(result); // result = 7

        System.out.println("after executing");
        System.out.println(x); // x = 4
        System.out.println(y); // y = 3
    }
}
