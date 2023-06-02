import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class Autoclicker {
    Robot r;
    int clickDelay = 400;
    int releaseDelay = 200;

    public Autoclicker() {
        try {
            r = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
    public void clickMouse(int button){
        r.mousePress(button);
        r.delay(releaseDelay);
        r.mouseRelease(button);
        r.delay(clickDelay);
    }

    public static
    }
}
