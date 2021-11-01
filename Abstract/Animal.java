package CS203Course.Abstract;

//abstract method with body
abstract class Animal { //fixme =>abstract method with body
    //abstract without method without body
    public abstract void animalSound(); //fixme =>abstract with out method without body
    //regular method
        public void sleep(){ // fixme =>regular method
            System.out.println("zzzzz");
        }
    }
//Subclass (inherit from animal)
class Pig extends Animal{
    public void animalSound(){ //
        //fixme => The body of animalSound() is provided here
        System.out.println("The Pig says: wee wee");
    }
}
class Main{
    public static void main(String[] args){
        Pig myPig = new Pig(); //fixme => we creating an pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
