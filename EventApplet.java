import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventApplet extends Applet implements ActionListener {
    Button button;

    public void init() {
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button clicked!");
            // You can perform any action you want when the button is clicked
        }
    }
}
