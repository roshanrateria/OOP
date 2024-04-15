import java.applet.*;
import java.awt.*;

public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        // Displaying textual content
        g.drawString("Welcome to Shape Applet", 20, 20);

        // Drawing shapes
        g.setColor(Color.red);
        g.drawRect(30, 30, 100, 100); // Rectangle
        g.fillRect(150, 30, 100, 100); // Filled rectangle

        g.setColor(Color.blue);
        g.drawOval(30, 150, 100, 100); // Oval
        g.fillOval(150, 150, 100, 100); // Filled oval

        g.setColor(Color.green);
        g.drawRoundRect(30, 270, 100, 100, 20, 20); // Rounded rectangle
        g.fillRoundRect(150, 270, 100, 100, 20, 20); // Filled rounded rectangle

        g.setColor(Color.orange);
        g.drawArc(30, 400, 100, 100, 90, 180); // Arc
        g.fillArc(150, 400, 100, 100, 90, 180); // Filled arc
    }
}
