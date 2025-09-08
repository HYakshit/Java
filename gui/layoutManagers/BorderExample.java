import java.awt.*;
import javax.swing.*;

public class BorderExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout Example");

        // Set BorderLayout with gaps
        f.setLayout(new BorderLayout(10, 10));

        f.add(new JButton("NORTH"), BorderLayout.NORTH);
        f.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        f.add(new JButton("EAST"), BorderLayout.EAST);
        f.add(new JButton("WEST"), BorderLayout.WEST);
        f.add(new JButton("CENTER"), BorderLayout.CENTER);

        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
