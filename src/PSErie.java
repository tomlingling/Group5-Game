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
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class PSErie extends JPanel implements ActionListener
{
    GameOptions p1;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton goBack;
    JButton gameGo;
        
    String name = "<insert name here>";
    String game = "<insert game here>";
    

    public PSErie(GameOptions games)
    {
        super();
        p1 = games;        
        setBackground(Color.cyan);
        setLayout(null);   
        //----Welcome Button----
        b1 = new JButton();
        name = p1.playerName;        
        b1.setText("Welcome to Penn State Erie " + name + ".");
        b1.setBounds(new Rectangle(125,50,350,50));
        add(b1);
        //----Game Choice----
        b2 = new JButton();
        game = p1.gameName;        
        b2.setText("You have chosen: " + game + ".");
        b2.setBounds(new Rectangle(125,100,350,50));
        add(b2);
                   //----Show the Question----
        gameGo = new JButton();
        gameGo.setText("Click to Begin");
        gameGo.setBounds(new Rectangle(125, 300, 350,50));
        gameGo.addActionListener(this);
        add(gameGo);
        }
               public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
        MyJFrame.dispose();    
        
        if (game=="History"){
        JFrame question = new JFrame();
        question.add(new History(p1, 0, "Penn State Erie", 0));
        setBackground(Color.darkGray);        
        setLayout(null);    
        question.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        question.setSize(800, 640);        
        question.setVisible(true);
        }
        
        if (game=="Math"){
        JFrame question = new JFrame();
        question.add(new Math(p1, "PSErie"));
        setBackground(Color.darkGray);        
        setLayout(null);    
        question.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        question.setSize(800, 640);        
        question.setVisible(true);
        }
        
        if (game=="Geography"){
        JFrame question = new JFrame();
        question.add(new Geography(p1));
        setBackground(Color.darkGray);        
        setLayout(null);    
        question.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        question.setSize(800, 640);        
        question.setVisible(true);
        }     
    }     
    }
     