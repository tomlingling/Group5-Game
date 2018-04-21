/* IST 240 Team 5
 * Michael Egnak, , 
 * Thomas Ling
 * Melissa Scott
 * Leonard Cadet
 */


import com.sun.org.apache.xpath.internal.patterns.NodeTest;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

// This is a place holder until we know when to use this text screen in our game

public class GameOver extends JPanel implements ActionListener
{
    JButton b1, b2, b3, b4;
    JTextPane t1;
    String s1, s2, s3, s4;
    String newline = System.getProperty("line.separator");
    XML_240 x2;
//    History H; 
//    String MyScore;
    public GameOver()
    {   
        super();
//        H = FinalScore_H;  History FinalScore_H
      //  MyScore = H.UserScore; 
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
        t1.setText("Previous Scores" + newline + "Player Name: " + s1 + newline + "Game Played: " + s2 + newline + "Difficulty Selected: " + s3 );
        t1.setEditable(false);
        add(t1);
       // b4 = new JButton();
       // b4.setText("Your score is"+ MyScore); 
        b2 = new JButton();
        b2.setText("Return to Main Screen");
        b3 = new JButton();
        b3.setText("End Game");
        b2.addActionListener(this);
        b3.addActionListener(this);
        b2.setBounds(new Rectangle (400,300,150,50));
        b3.setBounds(new Rectangle(500,300,150,50));
        add(b2);
        add(b3);
        
    }
    
    public void actionPerformed(ActionEvent event)
    {
        
        Object obj = event.getSource();
        if (obj == b2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();               
        }
        if (obj == b3)
        {
            System.exit(0);             
        }
    }    
}