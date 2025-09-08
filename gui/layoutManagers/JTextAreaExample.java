package gui.layoutManagers;

import javax.swing.*;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Demo");

        JTextArea area = new JTextArea(5, 4);
        area.setLineWrap(true);
        area.setText("Type your message here...");

        JScrollPane scroll = new JScrollPane(area);

        frame.add(scroll);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

