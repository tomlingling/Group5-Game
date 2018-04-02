/* IST 240 Team 5
 * Michael Egnak, , 
 * Thomas Ling
 * Melissa Scott
 * Leonard Cadet
 */

/**
 *
 * @author Mikee
 */
import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame
{

    public MyJFrame()
    {
        super("Communication Between Classes - Assignment");

        MyJPanel mjp = new MyJPanel();
        add(mjp, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 768);
        setVisible(true);
    }

}