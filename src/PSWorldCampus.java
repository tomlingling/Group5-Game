/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mikee
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PSWorldCampus extends JPanel /** action listener here?*/
{

    JButton b1;
    JButton b2;
    JButton b3;
        
    String name = "<insert name here>";
    String game = "<insert game here>";
    

    public PSWorldCampus()
    {
        super();
        setBackground(Color.gray);
        setLayout(null);   
        //----Welcome Button----
        b1 = new JButton();
        b1.setText("Welcome to PSU World Campus " + name + ".");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
        //----Game Choice----
        b2 = new JButton();
        b2.setText("You have chosen: " + game + ".");
        b2.setBounds(new Rectangle(125,100,350,50));
        add(b2);
        //----Let's Begin----
        b3 = new JButton();
        b3.setText("Let's Begin");
        b3.setBounds(new Rectangle(125,200,350,50));
        add(b3);
        /** click button to start game? */          
    }
}