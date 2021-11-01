package CS203Course.Interface;

//interface
public interface Animal { //fixme => interface
    public void animalSound(); //fixme => interface method (does not have a body)
    public void sleep(); //fixme => interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig implements Animal { //fixme => adding implements keyword
    public void animalSound() {
        //fixme =>The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        //fixme => The body of sleep() is provided here
        System.out.println("zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}