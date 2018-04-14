
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;

public class History extends JPanel implements ActionListener{

    //CampusMapPanel p1;
    GameOptions p1;
    JButton b1;
    JButton h1 ;
    JButton h2 ;
    JButton h3 ;
    JButton h4 ;
    JButton h5 ;
    JButton h6 ;
    JButton h7 ;

    //JLabel label = new JLabel("History Question 1");
    
    
    //JLabel label2 = new JLabel("What year was this Campus found?");

   // JButton button1 = new JButton("1900");
    //JButton button2 = new JButton("1910");
    //JButton button3 = new JButton("1920");
    //JButton button4 = new JButton("1930");
   // JButton button5 = new JButton("1950");
    //JButton button6 = new JButton("1980");

    
    public History (GameOptions games){
    super(); 
        p1 = games; 
        setBackground(Color.YELLOW);
        setLayout(null);
        h1 = new JButton("What year was this Campus found?");
        h1.setBounds(new Rectangle(525,30,300,35));
        add(h1);
        
        h2 = new JButton("1900");
        h2.setBounds(new Rectangle(525,150,300,35));
        add(h2);
        
        h3 = new JButton("1940");
        h3.setBounds(new Rectangle(525,250,300,35));
        add(h3);
        
        h4 = new JButton("1950");
        h4.setBounds(new Rectangle(525,350,300,35));
        add(h4);
        
        h5 = new JButton("1960");
        h5.setBounds(new Rectangle(525,450,300,35));
        add(h5);
        
        h6 = new JButton("1970");
        h6.setBounds(new Rectangle(525,550,300,35));
        add(h6);
        
        h7 = new JButton("1980");
        h7.setBounds(new Rectangle(525,650,300,35));
        add(h7);
}
    /*
    public  void actionperformed(ActionEvent event) {
        //If World Campus is selected
        if (p1.b1.isSelected()) {
            if (button1.isSelected()) {
                label2.setText("Right!");
                label2.setBackground(Color.GREEN);

            } else {
                label2.setText("Wrong!!");
                label2.setBackground(Color.RED);

            }
        }
        //If University Park is selected
        if (p1.b2.isSelected()) {
            if (button2.isSelected()) {
                label2.setText("Right!");
                label2.setBackground(Color.GREEN);

            } else {
                label2.setText("Wrong!!");
                label2.setBackground(Color.RED);

            }
        }
    }
     

    /* public History(GameOptions games) {
        b1 = new JButton();
        b1.setText("Question 1");
        b1.setBounds(new Rectangle(125, 50, 350, 50));
        add(b1);
  */

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
  

