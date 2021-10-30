package CS203Course.Inheritance;

public class GasCar extends Car1 {

    double tankCapacity;

    //this is gasCar constructor
    public GasCar(){
        //calling the car1 contractor using super()
        super("Doge","Dakota",2012);
        this.tankCapacity = 12;
    }

    public GasCar(String make, String model, int year, double tankCapacity) {
        super(make, model, year);
        this.tankCapacity = tankCapacity;
    }
    public double fillCost(int cost){
        return  tankCapacity * cost;
    }
    @Override
    public String toString(){
       return super.toString() + " Tank Capacity: " + tankCapacity;
    }
}
