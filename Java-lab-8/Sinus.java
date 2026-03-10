package MyGraph;

import java.awt.*;
import javax.swing.*;

public class Sinus extends JFrame {

    Sinus(String s) {
        super(s);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics g) {

        g.setColor(Color.LIGHT_GRAY);

        for (int i = 0; i < 400; i += 20)
            g.drawLine(i, 0, i, 300);

        for (int i = 0; i < 300; i += 20)
            g.drawLine(0, i, 400, i);

        g.setColor(Color.BLACK);

        g.drawLine(200, 0, 200, 300);
        g.drawLine(0, 150, 400, 150);

        for (int i = 0; i < 360; i++) {

            int x = 200 + i / 2;
            int y = 150 - (int)(80 * Math.sin(Math.PI * i / 180));

            g.fillRect(x, y, 2, 2);
        }
    }
}