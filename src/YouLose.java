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

public class YouLose extends JPanel implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton p2;

    public YouLose()
    {
        super();
        setBackground(Color.RED);
        b1 = new JButton();
        ImageIcon imageB1 = new ImageIcon("images/YouLose.jpg");
        b1.setIcon(imageB1);
        b1.setBounds(new Rectangle(100,50,150,50));
        add(b1);
        
        b2 = new JButton();
        b2.setText("Try Again");
        b2.setBounds(new Rectangle (600,600,150,50));
        b2.addActionListener(this);
        add(b2);
        
        p2 = new JButton();
        p2.setText("Click to End Game");
        p2.setBounds(new Rectangle(550,550,150,50));
        p2.addActionListener(this);
        add(p2);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();           
        if (obj == b2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();             
        }
        if (obj == p2)
        {
            System.exit(0); 
        }
    }
}