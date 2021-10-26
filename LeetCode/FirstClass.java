package CS203Course.LeetCode;

public class FirstClass {

    String firstName = "Robeil";
    String lastName = "Aregawi";
    int age = 28;
    int x = 5;

    public static void main(String[] args) {

        FirstClass firstNum = new FirstClass();
        FirstClass firstNum1 = new FirstClass();
        FirstClass myObj = new FirstClass();

        System.out.println("This should be first : " +firstNum.x);
        System.out.println("This should be the second : " +firstNum1.x);
        firstNum.x = 40;
        System.out.println("This won't affect by the change : " +firstNum1.x);
        System.out.println("This is the modified : " +firstNum.x);
        System.out.println("Name " +myObj.firstName +" "+ myObj.lastName);
        System.out.println("Age " + myObj.age);
    }
}
