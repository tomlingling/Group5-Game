
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
public class Geography extends JPanel 
{
   
    GameOptions p1;
    JButton b1;
    JButton g1 ;
    JButton g2 ;
    JButton g3 ;
    JButton g4 ;
    JButton g5 ;
    JButton g6 ;
    JButton g7 ;
     /* 
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
     
       \*    */
   public Geography(GameOptions games){
        super(); 
        p1 = games;
        setBackground(Color.GREEN);
        setLayout(null);
        g1 = new JButton("If you start from the Center of PA what location is these campus?");
        g1.setBounds(new Rectangle(525,30,300,35));
        add(g1);
        
        g2 = new JButton("North");
        g2.setBounds(new Rectangle(525,150,300,35));
        add(g2);
        
        g3 = new JButton("West");
        g3.setBounds(new Rectangle(525,250,300,35));
        add(g3);
        
        g4 = new JButton("East");
        g4.setBounds(new Rectangle(525,350,300,35));
        add(g4);
        
        g5 = new JButton("South");
        g5.setBounds(new Rectangle(525,450,300,35));
        add(g5);
        
        g6 = new JButton("NorthEast");
        g6.setBounds(new Rectangle(525,550,300,35));
        add(g6);
        
        g7 = new JButton("NorthWest");
        g7.setBounds(new Rectangle(525,650,300,35));
        add(g7);
   }
           
           
   }       
    /*  String getQuestion()
{
    String subject = "This will be a geography question.";
    return subject;
} */


