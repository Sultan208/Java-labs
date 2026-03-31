import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeApplet extends Applet implements ActionListener {

    Button red, green, blue;
    Color currentColor = Color.BLACK;

    public void init() {
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) currentColor = Color.RED;
        if (e.getSource() == green) currentColor = Color.GREEN;
        if (e.getSource() == blue) currentColor = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.fillRect(100, 100, 100, 100);
    }
}