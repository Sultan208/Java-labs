import java.applet.Applet;
import java.awt.*;

public class ColorApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.drawString("Colors", 50, 200);
    }
}