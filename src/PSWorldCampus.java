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

public class PSWorldCampus extends JPanel implements ActionListener
{
    GameOptions p1;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton goBack;
    JButton gameGo;
        
    String name = "<insert name here>";
    String game = "<insert game here>";
    

    public PSWorldCampus(GameOptions games)
    {
        super();
        p1 = games;        
        setBackground(Color.gray);
        setLayout(null);   
        //----Welcome Button----
        b1 = new JButton();
        name = p1.playerName;        
        b1.setText("Welcome to PSU World Campus " + name + ".");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
        //----Game Choice----
        b2 = new JButton();
        game = p1.gameName;        
        b2.setText("You have chosen: " + game + ".");
        b2.setBounds(new Rectangle(125,100,350,50));
        add(b2);
        //----Let's Begin----
        b3 = new JButton();
        b3.setText("Let's Begin");
        b3.setBounds(new Rectangle(125,200,350,50));
        b3.addActionListener(this);
        add(b3);
        //----Go Back----
        goBack = new JButton();
        goBack.setText("Back to Map");
        goBack.setBounds(new Rectangle(125,300, 350,50));
        goBack.addActionListener(this);
        add(goBack);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj == b3)
        {
            /** change background and buttons - may use repaint */
            setBackground(Color.black);
            setLayout(null);  
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            goBack.setVisible(false);
            /** button represents game loading */
            gameGo = new JButton();
            gameGo.setText("Game Go");
            gameGo.setBounds(new Rectangle(125,50,350,50));
            add(gameGo);            
            
        }
        if (obj == goBack)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
        }
            
    }
}