package CS203Course.Inheritance;

public class Car1 {

    String make;
    String model;
    int year;

    public Car1() {
        make = "Toyota";
        model = "Corolla";
        year = 2012;
    }

    public Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //fixme
    public double fillCost(int tankCapacity) {
        return tankCapacity * 0;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }
}
