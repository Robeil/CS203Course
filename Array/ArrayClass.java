package CS203Course.Array;

import java.util.Arrays;

public class ArrayClass {
    public static void doubleElements(double[] a){
        int i=0;
        for(i = 0; i < a.length; i++){
            a[i] = a[i]*2;
        }
    }

    public static void main(String[] args) {
        String[] listName = new String[3];
        listName[0] = "Soliana";
        listName[1] = "Robeil";
        listName[2] = "Aregawi";
        int length = listName.length;
        System.out.println(length);

        for (String s : listName) {
            System.out.println(s + " ");
        }
        int[] age = {2, 12, 1};
        //System.out.println(age[3]);

        char[] a = {'A', 'B', 'C'};
        System.out.println(a);
        String s = new String(a);
        System.out.println(s);
        String s2 = new String(a,0,2);
        System.out.println(s2);

    }
}
