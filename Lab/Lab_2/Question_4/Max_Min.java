package CS203Course.Lab.Lab_2.Question_4;

public class Max_Min {

    //Method that find the maximum
    public static int maximum(int[] array) {

        int[] maxMin = new int[1];
        int min = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                // maxMin[i] = array[i];
            }
           /* if (array[i] < min) {
                min = array[i];
                maxMin[i] = array[i];
            }*/
        }
        // return maxMin;
        return max;
    }

    //Method that find the minimum
    public static int minimum(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, -9, 33, 19, 78, 5};

        System.out.println(minimum(array));
        System.out.println(maximum(array));

    }
}
