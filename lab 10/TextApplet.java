import java.applet.Applet;
import java.awt.*;

public class TextApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.drawString("Hello Java Applet", 100, 100);
    }
}