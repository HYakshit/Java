import javax.swing.*;

public class SliderTicks extends JFrame {
    public SliderTicks() {
        JSlider sl = new JSlider(JSlider.VERTICAL, 0, 80, 35);
        sl.setMinorTickSpacing(2);
        sl.setMajorTickSpacing(10);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        JPanel panel = new JPanel();
        panel.add(sl);
        add(panel);
    }

    public static void main(String s[]) {
        SliderTicks st = new SliderTicks();
        st.pack();
        st.setVisible(true);
    }
}
