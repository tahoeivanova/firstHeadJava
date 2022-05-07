import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main (String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("hello!");
        JButton button2 = new JButton("yammy mayami!");
        JButton button3 = new JButton("one more...");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}