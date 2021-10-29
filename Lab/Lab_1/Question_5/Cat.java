package CS203Course.Lab.Lab_1.Question_5;

class Cat {
    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_HGT = 6;
    private static final double DEFAULT_WGT = 10.0;
    private String name;
    private int height;
    private double weight;

    public Cat() {
        //assign defaults to all data members
        this.name = DEFAULT_NAME; //null
        this.height = DEFAULT_HGT; // 0
        this.weight = DEFAULT_WGT; // 0.0
    }

    public Cat(String name) {
        //assign the passed name to the data member
        this.name = name;
        //use defaults for height and weight
    }

    public Cat(String name, int height) {
        //assign passed values to name and height
        this.name = name;
        this.height = height;
        //use default for weight
    }

    public Cat(String name, double weight) {
        //assign passed values to name and weight
        this.name = name;
        this.weight = weight;
        //use default for height
    }

    public Cat(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Cat bombom = new Cat();
        System.out.println(bombom.height);
    }
}
