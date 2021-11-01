package CS203Course.Enums;

public class Main {
    enum Level{ //fixme => to use enum use the keyword "enum" and make the elements capital
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}
