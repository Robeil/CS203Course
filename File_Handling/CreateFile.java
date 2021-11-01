package CS203Course.File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            File myFile = new File("FirstFile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already created");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
