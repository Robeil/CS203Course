package CS203Course.Lab.Lab_1_1.Question_9;

public class Fraction {
    private int f1;
    private int f2;
    private double z;

    public Fraction(){
    }

    public Fraction(int f1, int f2) {
        this.f1 = f1;
        this.f2 = f2;
        this.z = f1 / f2;
    }

    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public int getF2() {
        return f2;
    }

    public void setF2(int f2) {
        this.f2 = f2;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double compare(Fraction f1, Fraction f2){

        if(f1.z > f2.z){
            System.out.println(+1);
        } else if(f1 == f2){
            System.out.println(0);
        } else if(f1.z < f2.z){
            System.out.println(-1);
        }
        return 0;
    }

    public static void main(String[] args) {

        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(6,3);
    }
}
