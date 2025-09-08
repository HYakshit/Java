package gui.moreOnSwings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCCE  {
    JButton jb;

    void launchFrame() {
        JFrame jf = new JFrame("Change Background Color");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jb = new JButton("Select Background Color");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // current background
                Color initialColor = jb.getBackground();

                // show dialog
                Color chosenColor = JColorChooser.showDialog(null, "Choose a Color", initialColor);

                if (chosenColor != null) {
                    jb.setBackground(chosenColor);
                }
            }
        });

        jf.add(jb, BorderLayout.CENTER);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }



    public static void main(String[] args) {
        new JCCE().launchFrame();
    }
}
