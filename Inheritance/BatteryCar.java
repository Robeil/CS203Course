package CS203Course.Inheritance;

public class BatteryCar extends Car1{

    double batteryCapacity;

    //this is gasCar constructor
    public BatteryCar(){
        //calling the car1 contractor using super()
        super("Tesla","Model-x",2020);
        this.batteryCapacity = 122;
    }

    public BatteryCar(String make, String model, int year, double batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }
    public double fillCost(int cost){
        return  (batteryCapacity * cost) / 4;
    }

    @Override
    public String toString(){
        return super.toString() + " Battery Capacity: " + batteryCapacity;
    }
}
