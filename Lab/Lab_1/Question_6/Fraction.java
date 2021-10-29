package CS203Course.Lab.Lab_1.Question_6;

import static java.util.Objects.compare;

public class Fraction {

    private int f1;
    private int f2;
    private double z;

    public Fraction(int f1, int f2) {
        this.f1 = f1;
        this.f2 = f2;
        this.z = f1 / f2;
    }

    public int getF1() {
        return this.f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public double compareFraction(int f1, int f2) {
        double z = 0.0;
        z = f1 / f2;
        return z;
    }

    public static void compare(Fraction f1, Fraction f2) {
        if (f1.z > f2.z) {
            System.out.println(+1);
        } else if (f1.z == f2.z) {
            System.out.println(0);
        } else if(f1.z < f2.z){
            System.out.println(-1);
        }

    }

    public static void main(String[] args) {

        Fraction f1 = new Fraction(6, 3);

        Fraction f2 = new Fraction(8, 2);
        compare(f1,f2);

    }
}
