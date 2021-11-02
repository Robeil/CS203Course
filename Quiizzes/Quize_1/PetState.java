package CS203Course.Quiizzes.Quize_1;

public class PetState {
    public static String calculateState(int petAge){
        if(petAge < 3){
            return "Young";
        } else if(petAge >= 3 && petAge < 7){
            return "Adult";
        } else{
            return "Old";
        }
    }

}
