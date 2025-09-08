package gui.moreOnSwings;
import javax.swing.*;

public class PBExample extends JFrame {
    JProgressBar jb;
    int i = 0;

    PBExample() {
        jb = new JProgressBar(SwingConstants.HORIZONTAL);
        jb.setBounds(40, 40, 160, 30);//for location and size
        jb.setValue(0);
        jb.setStringPainted(true); // shows % text

        add(jb);
        setSize(250, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iterate() {
        while (i <= 100) {
            jb.setValue(i);
                if (i < 30)
                    jb.setString("Loading...");
                else if (i < 70)
                    jb.setString("Please wait...");

                else if (i == 100)
                    jb.setString("Done");
                else
                    jb.setString("Almost done!");
            i = i + 10;
            try { Thread.sleep(200); } catch (Exception e) {}
        }
    }


    public static void main(String[] args) {
        PBExample pb = new PBExample();
        pb.setVisible(true);
        pb.iterate();
    }
}
