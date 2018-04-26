
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Math extends JPanel implements ActionListener {

    GameOptions p1;
    String campus;    
    
    JButton question;
    JButton ans1;
    JButton ans2;
    JButton ans3;
    JButton close;   
    
    public Math(GameOptions games, String campus) 
    {
        super();
        p1 = games;
        setBackground(Color.darkGray);
        GridLayout mathPanel = new GridLayout(5,10);
        setVisible(true);
        this.campus = campus;   
                
        //-----Add question & answers based on campus selected-----
        
        if (campus.matches("PSWorldCampus")) 
        {
            question = new JButton("How many students attend World Campus?");            
            add(question);
            
            ans1 = new JButton("Don't know");
            ans1.addActionListener(this);
            add(ans1);
            
            ans2 = new JButton("Don't care");
            ans2.addActionListener(this);
            add(ans2);
            
            ans3 = new JButton("Why do you ask?");
            ans3.addActionListener(this);
            add(ans3);
            
            close = new JButton("Next Question");            
            close.addActionListener(this);
            add(close);
        }
        
        if (campus.matches("PSAltoona")) 
        {
            question = new JButton("Solve this equation: 12 x 12 =  ");            
            add(question);
            
            ans1 = new JButton("24");
            ans1.addActionListener(this);
            add(ans1);
            
            ans2 = new JButton("144");
            ans2.addActionListener(this);
            add(ans2);
            
            ans3 = new JButton("1,728");
            ans3.addActionListener(this);
            add(ans3);
            
            close = new JButton("Next Question");            
            close.addActionListener(this);
            add(close);
            
        }
        if (campus.matches("PSUPark")) 
        {
            question = new JButton("Solve the equation for x: 3x + 10 = 28");            
            add(question);
            
            ans1 = new JButton("10");
            ans1.addActionListener(this);
            add(ans1);
            
            ans2 = new JButton("3.14");
            ans2.addActionListener(this);
            add(ans2);
            
            ans3 = new JButton("6");
            ans3.addActionListener(this);
            add(ans3);
            
            close = new JButton("Next Question");            
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSErie")) 
        {
            question = new JButton("If the sides of a triangle are 2 & 3, what is the hypotenuse?");            
            add(question);
            
            ans1 = new JButton("3.6");
            ans1.addActionListener(this);
            add(ans1);
            
            ans2 = new JButton("4.1");
            ans2.addActionListener(this);
            add(ans2);
            
            ans3 = new JButton("3.2");
            ans3.addActionListener(this);
            add(ans3);
            
            close = new JButton("Next Question");            
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSBerks")) 
        {
            question = new JButton("Solve the equation for y:  ((y/2)*3)) + 4 = 13");            
            add(question);
            
            ans1 = new JButton("3");
            ans1.addActionListener(this);
            add(ans1);
            
            ans2 = new JButton("9");
            ans2.addActionListener(this);
            add(ans2);
            
            ans3 = new JButton("6");
            ans3.addActionListener(this);
            add(ans3);
            
            close = new JButton("Next Question");            
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSDubois")) 
        {
            question = new JButton("Solve the equation:  1 - 1 = ");            
            add(question);
            
            ans1 = new JButton("11");
            ans1.addActionListener(this);
            add(ans1);
            
            ans2 = new JButton("0");
            ans2.addActionListener(this);
            add(ans2);
            
            ans3 = new JButton("2?");
            ans3.addActionListener(this);
            add(ans3);
            
            close = new JButton("Next Question");            
            close.addActionListener(this);
            add(close);
        }
        
    }    
        
     
        public void actionPerformed(ActionEvent event) 
        {
            Object obj = event.getSource();
            if (campus.matches("PSWorldCampus"))
            {                           
                if (obj == ans2) {
                ans2.setText("Right!");
                ans2.setBackground(Color.GREEN);                                                      
                } else {                        
                        ans2.setText("Wrong!!");
                        ans2.setBackground(Color.RED);                        
                }             
            }
            if (campus.matches("PSAltoona"))
            {                           
                if (obj == ans2) {
                ans2.setText("Right!");
                ans2.setBackground(Color.GREEN);                                                   
                } else {                        
                        ans2.setText("Wrong!!");
                        ans2.setBackground(Color.RED);                       
                }             
            }
            if (campus.matches("PSUPark"))
            {                           
                if (obj == ans3) {
                ans3.setText("Right!");
                ans3.setBackground(Color.GREEN);                                                    
                } else {                        
                        ans3.setText("Wrong!!");
                        ans3.setBackground(Color.RED);                        
                }             
            }
            if (campus.matches("PSErie"))
            {                           
                if (obj == ans1) {
                ans1.setText("Right!");
                ans1.setBackground(Color.GREEN);                                                      
                } else {                        
                        ans1.setText("Wrong!!");
                        ans1.setBackground(Color.RED);                        
                }             
            }
            if (campus.matches("PSBerks"))
            {                           
                if (obj == ans3) {
                ans3.setText("Right!");
                ans3.setBackground(Color.GREEN);                                                
                } else {                        
                        ans3.setText("Wrong!!");
                        ans3.setBackground(Color.RED);                       
                }             
            }
            if (campus.matches("PSDubois"))
            {                           
                if (obj == ans2) {
                ans2.setText("Right!");
                ans2.setBackground(Color.GREEN);                                                      
                } else {                        
                        ans2.setText("Wrong!!");
                        ans2.setBackground(Color.RED);                        
                }
                
            }
            if (obj == close)
            {
                JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();      
            }
        }
    }    
   