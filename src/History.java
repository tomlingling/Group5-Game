
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;
public class History extends JPanel{
    JButton b1;
      
    JLabel label = new JLabel ("History Question 1");
    JLabel label2 = new JLabel ("What year was this Campus found?");
    
    JButton button1 = new JButton("1900");
    JButton button2 = new JButton("1910");
    JButton button3 = new JButton("1920");
    JButton button4 = new JButton("1930");
    
   /* JRadioButton rb1 = new JRadioButton("Test1");
    JRadioButton rb2 = new JRadioButton("Test2");
    JRadioButton rb3 = new JRadioButton("Test3");
    JRadioButton rb4 = new JRadioButton("Test4");
    */
    public History(GameOptions games)
    
    {   b1 = new JButton();
        b1.setText("Question 1");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
    
    }
   
}
