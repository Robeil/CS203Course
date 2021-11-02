package CS203Course.Lab.Lab_1_1.Question_5;

public class Cat {

    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_HGT = 6;
    private static final double DEFAULT_WGT = 10.0;
    private String name;
    private int height;
    private double weight;

    public Cat() {
        //assign defaults to all data members
        this.name = DEFAULT_NAME;
        this.height = DEFAULT_HGT;
        this.weight = DEFAULT_WGT;
    }

    public Cat(String name) {
        //assign the passed name to the data member
        this.name = name;
        //assign weight, height default
        this.weight = DEFAULT_WGT;
        this.height = DEFAULT_HGT;
    }

    public Cat(String name, int height) {
        //assign passed values to name and height
        this.name = name;
        this.height = height;
        //use default for weight
        this.weight = DEFAULT_WGT;
    }

    public Cat(String name, double weight) {
        //assign passed values to name and weight
        this.name = name;
        this.weight = weight;
        //use default for height
        this.height = DEFAULT_HGT;
    }

    public Cat(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String printInfo(){
        return name+" "+height+" "+weight;
    }

    public static void main(String[] args) {
       Cat bombom = new Cat("Mer",11,36);
       Cat nawnaw = new Cat();

        System.out.println(bombom.printInfo());
        System.out.println(nawnaw.printInfo());

    }
}
