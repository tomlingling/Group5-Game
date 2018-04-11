/* IST 240 Team 5
 * Michael Egnak, , 
 * Thomas Ling
 * Melissa Scott
 * Leonard Cadet
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// This is a place holder until we know when to use this text screen in our game

public class GameOver extends JPanel {
    
    JTextArea b1;

    public GameOver()
    {
        super();
        setBackground(Color.RED);
        b1 = new JTextArea();
        b1.setText("This is a place-holder for GAME OVER");
        b1.setBounds(new Rectangle(50,50,150,50));
        add(b1);
    }
}