package CS203Course.Lab.Lab_2.Question_4;

public  class Max_Min {

    //Method that find the maximum
    public static int maximum(int[] array){
        int max =0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //Method that find the minimum
    public static int minimum(int[] array){
        int min = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {1,4,-9,33,19,78,5};

        System.out.println(Max_Min.maximum(array));
        System.out.println(Max_Min.minimum(array));

    }
}
