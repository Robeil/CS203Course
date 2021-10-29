package CS203Course.Quiizzes;

public class PetTest {

    public static void main(String[] args) {

        Pet cat = new Pet();
        System.out.println(cat.printInfo());
        System.out.println(PetState.calculateState(cat.getAge()));
        cat.setName("Rodi");
        cat.setAge(cat.getAge() + 3);
        System.out.println(cat.printInfo());
        System.out.println(PetState.calculateState(cat.getAge()));

        Pet dog = new Pet("Justin", 4, 6);
        System.out.println(dog.printInfo());
        PetState.calculateState(dog.getAge());
    }
}
