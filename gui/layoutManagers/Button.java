package gui.layoutManagers;// package  gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button {

    public static void main(String[] args) {
        JFrame JFrameObj = new JFrame("Button example");
        JButton JButtonObj = new JButton("Click click");

        JButtonObj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JFrameObj, "Button was clicked!");
            }
        });
        JFrameObj.add(JButtonObj);
        JFrameObj.setSize(400, 400);
        JFrameObj.setVisible(true);
    }
}
