package CS203Course.Lab.Lab_1.Question_1;

public class Cat {
    private String name;
    private Breed breed;
    private double weight;

    public Cat(){}
    public Cat(String name, Breed breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    public Breed getBreed() {
        return breed;
    }
    public double getWeight() {
        return weight;
    }
//other getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
