import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class HelloWorldFrame extends JFrame {

    public void CreateJFrame (String title) {
        JFrame jf = new JFrame (title);
        Container container = jf.getContentPane ();
        JLabel jl = new JLabel();
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setForeground (Color.white);
        container.add (jl);
        container.setBackground (Color.RED);
        jf.setVisible (true);
        jf.setSize (500, 150);
        jf.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new HelloWorldFrame().CreateJFrame("Hello World!:)");
    }
}
