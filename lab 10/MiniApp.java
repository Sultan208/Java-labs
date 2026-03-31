import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MiniApp extends Applet implements ActionListener {

    TextField tf;
    Button btn;
    String text = "";
    Color color = Color.BLUE;

    public void init() {
        tf = new TextField(20);
        btn = new Button("Show");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();
        color = new Color((int)(Math.random() * 255),
                          (int)(Math.random() * 255),
                          (int)(Math.random() * 255));
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.drawString(text, 50, 100);
        g.fillRect(50, 120, 100, 50);
    }
}