package CS203Course.Quiizzes.Quize_2;

import java.util.ArrayList;

public class Pet {
    private String name;
    private int age;
    private float weight;

    public Pet() {
        this.name = "Gogi";
        this.age = 7;
        this.weight = 5;
    }

    public Pet(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
@Override
public String toString(){
        return "Pet name: "+ this.name+ " age "+ this.age+ " weight "+ this.weight;
}
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Pet cat1 = new Pet("Mobi", 2, 12);
        Pet cat2 = new Pet("Din", 4, 22);
        Pet dog = new Pet("Foni", 5, 23);

        pets.add(cat1);
        pets.add(cat2);
        pets.add(dog);

        System.out.println(pets.size());

        for(Pet p: pets){
            System.out.println(p.toString());
        }
        System.out.println("-----------");
        for(int i = pets.size()-1; i > -1; i--){
            System.out.println(pets.get(i));
        }

    }
}
