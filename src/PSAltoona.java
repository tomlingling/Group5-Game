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

public class PSAltoona extends JPanel //implements ActionListener
{
    GameOptions p1;
    JButton b1;
    JButton b2;
    JButton b3;    
    JButton gameGo;
        
    String name = "<insert name here>";
    String game = "<insert game here>";
    String text;
    

    public PSAltoona(GameOptions games)
    {
        super();
        p1 = games;
        setBackground(Color.blue);
        setLayout(null);   
        //----Welcome Button---- 
        name = p1.playerName;
        b1 = new JButton();
        b1.setText("Welcome to Penn State Altoona, " + name + ".");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
        //----Game Choice----
        game = p1.gameName;
        b2 = new JButton();
        b2.setText("You have chosen: " + game + ".");
        b2.setBounds(new Rectangle(125,100,350,50));
        add(b2);
        //----Show the Question----
        if ("Geography".equals(game))
        {          
            gameGo = new JButton();
            gameGo.setText("Where is this campus located?");
            gameGo.setBounds(new Rectangle(125,300,350,50));
            add(gameGo);                             
        }
        else if ("History".equals(game))
        {
            gameGo = new JButton();
            gameGo.setText("When was this campus founded?");
            gameGo.setBounds(new Rectangle(125,300,350,50));
            add(gameGo);                           
        }
<<<<<<< HEAD
        if (obj == goBack)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
=======
        else if ("Math".equals(game))
        {
            gameGo = new JButton();
            gameGo.setText("What percentage of the students are freshman?");
            gameGo.setBounds(new Rectangle(125,300,350,50));
            add(gameGo);                           
>>>>>>> b1c9374f5c68c613bd6a8682e0358e6c4e6ae1e7
        }
            
    }
}     
 