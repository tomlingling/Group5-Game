
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Len
 */
import javax.swing.JLabel;
public class Math 
{
    JButton b1;
      
    JLabel label = new JLabel ("Math Question 1");
    JLabel label2 = new JLabel ("Count the number of letters of the campus name, divde by 2 and multipe by 5 what is the answer?");
    
    JButton button1 = new JButton("200");
    JButton button2 = new JButton("240");
    JButton button3 = new JButton("300");
    JButton button4 = new JButton("350");
    JButton button5 = new JButton("650");
    JButton button6 = new JButton("450");
    
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
    String subject = "This will be a math question.";
    return subject;
}
    
}
