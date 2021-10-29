package CS203Course.Experiment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubJButton extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGTHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        SubJButton frame = new SubJButton();
        frame.setVisible(true);
    }

    public SubJButton() {
        Container contentPane = getContentPane();

        setSize(FRAME_WIDTH, FRAME_HEIGTHT);
        setResizable(false);
        setTitle("Program JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        JButton okButton = new JButton("Ok");
        contentPane.add(okButton);

        contentPane.setLayout(new FlowLayout());

        JButton cancelButton = new JButton("Cancel");
        contentPane.add(cancelButton);

       /* okButton.setSize(80, 30);
        cancelButton.setSize(80, 30);*/
        
        ButtonHandler handler = new ButtonHandler();
        cancelButton.addActionListener(handler);
        okButton.addActionListener(handler);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonHandler implements ActionListener {
        public ButtonHandler() {

        }

        public void actionPerformed(ActionEvent event) {
            JButton clickedButton = (JButton) event.getSource();
            Frame frame = (JFrame) rootPane.getParent();

            String buttonText = clickedButton.getText();
            frame.setTitle("You clicked " + buttonText);

        }
    }
}
