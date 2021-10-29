package CS203Course.Lab.Lab_1.Question_7;

import CS203Course.Lab.Lab_1.Question_6.Fraction;

public class RewriteFraction {

    private int f1;
    private int f2;
    private double z;

    public RewriteFraction(int f1, int f2) {
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

    public int compare(Fraction frac) {

       /* if(frac.getF1() > frac.getF1()){
            System.out.println(+1);
        } else if (frac.getF1() == frac.getF1()){
            System.out.println(0);
        } else if(frac.getF1() < frac.getF1()){
            System.out.println(-1);
        }*/
        /*
        if (frac.z > f2.z) {
            System.out.println(+1);
        } else if (f1.z == f2.z) {
            System.out.println(0);
        } else if(f1.z < f2.z){
            System.out.println(-1);
        }
*/
        if(this.f1 > this.f2){
            System.out.println(+1);
        } else if(this.f1 == this.f2){
            System.out.println(0);
        } else if(this.f1 < this.f2){
            System.out.println(-1);
        }
        return 0;
    }

    public static void main(String[] args) {

        Fraction f1 = new Fraction(8, 2);
        System.out.println(f1.compareFraction(8,2));
    }
}
