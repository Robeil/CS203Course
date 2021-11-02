package CS203Course.Quiizzes.Quize_2;

public class SmallestStringFinder {

    public static int smallestString(String[] arr){
        int smallest = 0;
        for(int i = 0; i < arr.length; i++){
                if(arr[i].length() < arr[smallest].length()){ // fixme pay attention HERE
                    smallest = i;
                }
        }
        return smallest;
    }

    public static void main(String[] args) {

        String[] arr = {"Everything","is you","are","dogs","when"};
        System.out.println(smallestString(arr));
    }
}
