package gui.moreOnSwings;


import javax.swing.*;

public class SliderEx extends JFrame {
    public SliderEx() {
        JSlider slider = new JSlider(); // default 0–100
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        slider.setPaintLabels(true);

    }

    public static void main(String s[]) {
        SliderEx frame = new SliderEx();
        frame.pack();
        frame.setVisible(true);
    }
}
