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

public class PSWorldCampus extends JPanel implements ActionListener
{
    GameOptions p1;
    
    JButton b1;
    JButton b2;
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
        
        JFrame question = new JFrame();        
        setBackground(Color.darkGray);        
        setLayout(null);    
        question.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        question.setSize(800, 640);        
        question.setVisible(true);
    }    
        
        
        
        
        
        
        /*if ("Geography".equals(game))
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
        else if ("Math".equals(game))
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
            gameGo = new JButton();
            gameGo.setText("What percentage of the students are freshman?");
            gameGo.setBounds(new Rectangle(125,300,350,50));
            add(gameGo);                           
        }**/
            
    
}     