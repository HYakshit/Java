package gui.layoutManagers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Demo");

        String[] columns = {"ID", "Name", "Age"};
        Object[][] data = {
                {1, "Alice", 20},
                {2, "Bob", 22},
                {3, "Charlie", 23}
        };

        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scroll = new JScrollPane(table);

        frame.add(scroll);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
