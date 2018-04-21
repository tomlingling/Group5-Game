/* IST 240 Team 5
 * Michael Egnak, , 
 * Thomas Ling
 * Melissa Scott
 * Leonard Cadet
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

// This is a place holder until we know when to use this text screen in our game

public class GameOver extends JPanel //implements ActionListener
{
    JButton b1;
    JTextPane t1;
    String s1, s2, s3, s4, s5, s6;
    String newline = System.getProperty("line.separator");
    XML_240 x2;
    
    public GameOver()
    {
        super();
        setBackground(Color.green);
        b1 = new JButton();
        ImageIcon imageB1 = new ImageIcon("images/GameOver.jpg");
        b1.setIcon(imageB1);
        b1.setBounds(new Rectangle(100,50,150,50));
        add(b1);
        x2 = new XML_240();
        t1 = new JTextPane();
        x2.openReaderXML("playHistory.xml");
        t1.setBounds(new Rectangle(300,300,600,200));
        s1 = (String) x2.ReadObject();
        s2 = (String) x2.ReadObject();
        s3 = (String) x2.ReadObject();            
        t1.setText("Previous Scores" + newline + "Player Name: " + s1 + newline + "Game Played: " + s2 + newline + "Difficulty Selected: " + s3);
        t1.setEditable(false);
        add(t1);        
    }
}