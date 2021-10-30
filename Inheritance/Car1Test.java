package CS203Course.Inheritance;

public class Car1Test {
    public static void main(String[] args) {
        Car1 first = new Car1();
        GasCar gasCar1 = new GasCar("Ford","Focus",2020,23);
        BatteryCar butteryCar = new BatteryCar("Tesla","Model-3",2019,34);
        System.out.println(butteryCar.fillCost(3));
        System.out.println(gasCar1.toString());
        System.out.println(gasCar1.fillCost(9));
        System.out.println(first.toString());


        Car1[] cars = {gasCar1,butteryCar};

        for(Car1 i: cars){
            System.out.println(i.fillCost(3));
        }

    }
}
