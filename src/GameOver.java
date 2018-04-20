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

public class GameOver extends JPanel //implements ActionListener
{
    JButton b1;

    public GameOver()
    {
        super();
        setBackground(Color.green);
        b1 = new JButton();
        ImageIcon imageB1 = new ImageIcon("images/GameOver.jpg");
        b1.setIcon(imageB1);
        b1.setBounds(new Rectangle(100,50,150,50));
        add(b1);
    }
}