
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Len
 */
public class History extends JPanel{
    JButton b1;
      
    
    
    JRadioButton rb1 = new JRadioButton("Test1");
    JRadioButton rb2 = new JRadioButton("Test2");
    JRadioButton rb3 = new JRadioButton("Test3");
    JRadioButton rb4 = new JRadioButton("Test4");
    
    public History(GameOptions games)
    
    {   b1 = new JButton();
        b1.setText("Question 1");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
    
    }
   
}
