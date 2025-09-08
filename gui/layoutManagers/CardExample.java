package gui.layoutManagers;
import java.awt.*;
import javax.swing.*;

public class CardExample {
    CardLayout cl;
    JPanel panel;

    public CardExample() {
        JFrame f = new JFrame("CardLayout Example");
        cl = new CardLayout();
        panel = new JPanel(cl);

        // Create panels
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Card 1"));
        p1.setBackground(Color.CYAN);

        JPanel p2 = new JPanel();
        p2.add(new JLabel("Card 2"));
        p2.setBackground(Color.ORANGE);

        JPanel p3 = new JPanel();
        p3.add(new JLabel("Card 3"));
        p3.setBackground(Color.GREEN);

        // Add panels with names
        panel.add(p1, "First");
        panel.add(p2, "Second");
        panel.add(p3, "Third");

        // Buttons to navigate
        JButton bNext = new JButton("Next");
        JButton bPrev = new JButton("Previous");

        bNext.addActionListener(e -> cl.next(panel));
        bPrev.addActionListener(e -> cl.previous(panel));

        f.add(panel, BorderLayout.CENTER);
        JPanel controls = new JPanel();
        controls.add(bPrev);
        controls.add(bNext);
        f.add(controls, BorderLayout.SOUTH);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CardExample();
    }
}
