package CS203Course.Inheritance;

class Animals {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animals {
    public void animalSound() {
        System.out.println("The Pig says: wee wee");
    }
}

class Dog extends Animals {
    public void animalSound() {
        System.out.println("The Dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Animals myAnimal = new Animals(); //creating animal object
        Animals myPig = new Pig(); // creating pig object
        Animals myDog = new Dog(); // creating dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}