package gui.layoutManagers;

import javax.swing.*;

public class JRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Demo");

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup(); // Group them
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
