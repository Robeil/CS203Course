package CS203Course.Lab.Lab_2.Question_7;

import java.text.DecimalFormat;
import java.util.Random;

public class Temperature {


    public static void hottestTempYear(double[] yearTemp) {
        double hottest = 0.0;
        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] > hottest) {
                hottest = yearTemp[i];
            }
        }
        System.out.println("This is the hottest ☀️  " + hottest + " for this year.");
    }

    public static void coldestTempYear(double[] yearTemp) {
        double coldest = 0.0;
        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] < coldest) {
                coldest = yearTemp[i];
            }
        }
        System.out.println("\nThis is the coldest ❄️ " + coldest + " for this year.");
    }

    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat();
        Random random = new Random();
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double[] yearTemp = new double[365];

        //Storing the entire year from random
        for (int i = 0; i < yearTemp.length; i++) {
            yearTemp[i] = (double) (random.nextInt(126));
        }

        coldestTempYear(yearTemp);
        hottestTempYear(yearTemp);
    }
}
