package gui;// package  gui;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new FlowLayout());

        // 1. JButton
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

        // 2. JRadioButton
        JRadioButton rb1 = new JRadioButton("Option 1");
        JRadioButton rb2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        // 3. JTextArea
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setBorder(BorderFactory.createTitledBorder("Enter Text"));

        // 4. JComboBox (Constructors)
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        JComboBox<String> comboBox1 = new JComboBox<>(fruits); // Constructor with array
        JComboBox<String> comboBox2 = new JComboBox<>();       // Empty constructor
        comboBox2.addItem("Red");
        comboBox2.addItem("Green");
        comboBox2.addItem("Blue");

        // 5. JTable
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "Alice", 20},
            {2, "Bob", 22},
            {3, "Charlie", 23}
        };
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setPreferredSize(new Dimension(300, 100));

        // Add components to frame
        frame.add(button);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(textArea);
        frame.add(new JLabel("Select Fruit:"));
        frame.add(comboBox1);
        frame.add(new JLabel("Select Color:"));
        frame.add(comboBox2);
        frame.add(tableScroll);

        // Show frame
        frame.setVisible(true);
    }
}
