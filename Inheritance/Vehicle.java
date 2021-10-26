package CS203Course.Inheritance;

class Vehicle {
    protected String brand = "Ford"; // vehicle attribute
    public void honk(){       // vehicle method
        System.out.println("Tuut Tuut");
    }
}
 class Car extends Vehicle {

    private String modelName = "Mustage"; // Car attribute

     public static void main(String[] args){

         Car myCar = new Car();
         myCar.honk();
         System.out.println(myCar.brand + " "+ myCar.modelName);

     }
 }