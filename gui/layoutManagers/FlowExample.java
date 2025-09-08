package gui.layoutManagers;

import java.awt.*;
import javax.swing.*;

public class FlowExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout Example");

//        f.setLayout(new FlowLayout()); // set layout manager
//        f.setLayout(new FlowLayout(FlowLayout.LEFT));   // Align left
//        f.setLayout(new FlowLayout(FlowLayout.CENTER)); // Default
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));  // Align right

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));

        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
