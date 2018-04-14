
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class Geography 
{
      JButton b1;
      
    JLabel label = new JLabel ("Geography Question 1");
    JLabel label2 = new JLabel ("If you start from the Center of PA what location is these campus?");
    
    JButton button1 = new JButton("North");
    JButton button2 = new JButton("East");
    JButton button3 = new JButton("West");
    JButton button4 = new JButton("South");
    
    String getQuestion()
{
    String subject = "This will be a geography question.";
    return subject;
}
}

