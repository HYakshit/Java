import java.awt.*;
import javax.swing.*;

public class GridExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout Example");

        // Grid with 3 rows, 2 columns, and gaps
        f.setLayout(new GridLayout(3, 2, 10, 10));

        // Add 6 buttons
        for (int i = 1; i <= 6; i++) {
            f.add(new JButton("Button " + i));
        }

        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
