
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
    JButton button5 = new JButton("1950");
    JButton button6 = new JButton("1980");
    
   public void actionperformed(ActionEvent event){
       if (button1.isSelected()){
           button1.setText("Wrong!");
       }
       if (button2.isSelected()){
          button2.setText("Wrong!"); 
       }
      if (button3.isSelected()){
           button3.setText("Wrong!");
       }
       if (button4.isSelected()){
           button4.setText("Wrong!");
       }
       if (button5.isSelected()){
           button5.setText("Wrong!");
       }
       if (button6.isSelected()){
           button6.setText("Right!");
       }        
           
   } 
    public History(GameOptions games)
    
    {   b1 = new JButton();
        b1.setText("Question 1");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
    
    }
   
}
