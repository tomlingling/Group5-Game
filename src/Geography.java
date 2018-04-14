
import javax.accessibility.AccessibleAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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
public class Geography extends JFrame 
{
      JButton b1;
      
    JLabel label = new JLabel ("Geography Question 1");
    JLabel label2 = new JLabel ("If you start from the Center of PA what location is these campus?");
    
    JButton button1 = new JButton("North");
    JButton button2 = new JButton("East");
    JButton button3 = new JButton("West");
    JButton button4 = new JButton("South");
    JButton button5 = new JButton("Southeast");
    JButton button6 = new JButton("Southwest");
    
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
    String getQuestion()
{
    String subject = "This will be a geography question.";
    return subject;
}
}

