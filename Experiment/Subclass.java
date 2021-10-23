package Experiment;

import javax.swing.*;
import java.awt.*;

public class Subclass extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGTHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;



    public Subclass() {
        setTitle("My first subclass");
        setSize(FRAME_WIDTH, FRAME_HEIGTHT);
        setBackground(Color.blue);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        changeBKColor();
    }
    public void changeBKColor(){
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
    }

}
