package CS203Course.Array;

import java.util.Arrays;

public class ArrayResize {


    public static int[] resizeArray(int[] array1){

        // fixme OR this is the shortest way to resize
        int[] newArray = Arrays.copyOf(array1,array1.length * 2);
        //creating new array to resize the length the array
       /* int[] tempArr = new int[array1.length * 2];

        for(int i = 0; i < array1.length; i++){
            tempArr [i] = array1[i];
        }
        array1 = tempArr ;
        return array1;*/
        return newArray;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] resize = resizeArray(arr1);

        for(int i: resize){
            System.out.print(i + " ");
        }
    }
}
