import java.applet.Applet;
import java.awt.*;

public class AnimationApplet extends Applet implements Runnable {

    int x = 0;

    public void init() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > getWidth()) x = 0;

            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 100, 50, 50);
    }
}