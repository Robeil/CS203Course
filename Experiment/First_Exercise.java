package CS203Course.Experiment;

import javax.swing.*;

public class First_Exercise {
    public static void main(String[] args) {

        JFrame jFrame;
        jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
        JOptionPane.showMessageDialog(jFrame, "How are you?");
        JOptionPane.showMessageDialog(null, "One\nTwo\nThree");
        String input = JOptionPane.showInputDialog(null, "Enter text: ");
        JOptionPane.showMessageDialog(null, "Good bye");
        String ageStr = JOptionPane.showInputDialog(null, "Enter your age: ");
        int age = Integer.parseInt(ageStr);
        System.out.println(ageStr);
        System.out.println(age);
        System.out.println(input);
        JOptionPane.showMessageDialog(null, "I love you");
        String askingName = JOptionPane.showInputDialog("What is your name?");
        String ageInput = JOptionPane.showInputDialog("How old are you?");
        int firstName = Integer.parseInt(ageInput);
        System.out.println(askingName);
        System.out.println(age);
        JFrame defaultJFrame = new JFrame();
        defaultJFrame.setVisible(true);

    }
}
