package CS203Course;

public class WrapperOrBoxing {
    public static void main(String[] args) {
        //boxing ir wrapper
        int x = 2;
        Integer y = new Integer(x);
        Integer z = x;
        System.out.println(y.equals(z));
        System.out.println(z.equals(y));

        //unboxing
        Integer a = 4;
        int b = a;
        System.out.println(b);

        //You can even convert string to number
        String myNum = "15";
        int myWord = Integer.valueOf(myNum);

        System.out.println(myWord);
    }
}
