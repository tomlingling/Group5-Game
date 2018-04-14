
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Len
 */

public class Math extends JPanel //implements ActionListener
{
    GameOptions p1;
    JButton b1;
    JButton m1 ;
    JButton m2 ;
    JButton m3 ;
    JButton m4 ;
    JButton m5 ;
    JButton m6 ;
    JButton m7 ;
      
    //JLabel label = new JLabel ("Math Question 1");
    //JLabel label2 = new JLabel ("Count the number of letters of the campus name, divde by 2 and multipe by 5 what is the answer?");
    
    //JButton button1 = new JButton("200");
    //JButton button2 = new JButton("240");
    //JButton button3 = new JButton("300");
    //JButton button4 = new JButton("350");
    //JButton button5 = new JButton("650");
    //JButton button6 = new JButton("450");
    
    /*
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
     
          */   
       public Math(GameOptions games){
        super(); 
        p1 = games; 
        setBackground(Color.GREEN);
        setLayout(null);
        m1 = new JButton("What year was this Campus found?");
        m1.setBounds(new Rectangle(525,30,300,35));
        add(m1);
        
        m2 = new JButton("1900");
        m2.setBounds(new Rectangle(525,150,300,35));
        add(m2);
        
        m3 = new JButton("1940");
        m3.setBounds(new Rectangle(525,250,300,35));
        add(m3);
        
        m4 = new JButton("1950");
        m4.setBounds(new Rectangle(525,350,300,35));
        add(m4);
        
        m5 = new JButton("1960");
        m5.setBounds(new Rectangle(525,450,300,35));
        add(m5);
        
        m6 = new JButton("1970");
        m6.setBounds(new Rectangle(525,550,300,35));
        add(m6);
        
        m7 = new JButton("1980");
        m7.setBounds(new Rectangle(525,650,300,35));
        add(m7);
       }    
           
   } 
   /* 
String getQuestion()
{
    String subject = "This will be a math question.";
    return subject;
}
  */   

