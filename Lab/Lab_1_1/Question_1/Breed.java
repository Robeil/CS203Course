package CS203Course.Lab.Lab_1_1.Question_1;

public class Breed {
    private String name;
    private double averageWgt; //in lbs.
    public Breed(String name, double averageWgt){
        this.name = name;
        this.averageWgt = averageWgt;
    }
    public double getWeight( ) {
        return averageWgt;
    }
//other getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageWgt() {
        return averageWgt;
    }

    public void setAverageWgt(double averageWgt) {
        this.averageWgt = averageWgt;
    }
}
