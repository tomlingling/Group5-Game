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

public class GameOptions extends JPanel implements ActionListener
{

    JRadioButton rb1 = new JRadioButton("History",true);
    JRadioButton rb2 = new JRadioButton("Math");
    JRadioButton rb3 = new JRadioButton("Geography");
    JRadioButton rb4 = new JRadioButton("Easy",true);
    JRadioButton rb5 = new JRadioButton("Medium");
    JRadioButton rb6 = new JRadioButton("Hard");    
    JButton save = new JButton("Save");
    JLabel namePlayer = new JLabel("Player Name");
    JTextField name = new JTextField("Type Your Name Here",30);
    String gameName;
    String playerName;
    String difficulty;

    public GameOptions()
    {
        super();
        setBackground(Color.darkGray);
        ButtonGroup options = new ButtonGroup();
        options.add(rb1);
        options.add(rb2);
        options.add(rb3);
        ButtonGroup difficulty = new ButtonGroup();
        difficulty.add(rb4);
        difficulty.add(rb5);
        difficulty.add(rb6);        

        rb1.setBounds(175,50,100,30);
        rb2.setBounds(175,150,100,30);
        rb3.setBounds(175,250,100,30);
        rb4.setBounds(275,50,100,30);
        rb5.setBounds(275,150,100,30);
        rb6.setBounds(275,250,100,30);        
        name.setBounds(100,250,100,30);
        //save.setBounds(300,350,100,30);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
        rb5.addActionListener(this);
        rb6.addActionListener(this);        
        //rb1.addActionListener(this);
        name.addActionListener(this);
        save.addActionListener(this);        
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);
        add(rb6);        
        add(namePlayer);
        add(name);
        add(save);
        
    }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj == save)
        {
            if (rb1.isSelected())
            {
                gameName = "History";
                playerName = name.getText();
                if (rb4.isSelected())
                {
                    difficulty = "Easy";
                }
                if (rb5.isSelected())
                {
                    difficulty = "Medium";
                }
                if (rb6.isSelected())
                {
                    difficulty = "Hard";
                }                  
            }
            if (rb2.isSelected())
            {
                gameName = "Math";
                playerName = name.getText();
                if (rb4.isSelected())
                {
                    difficulty = "Easy";
                }
                if (rb5.isSelected())
                {
                    difficulty = "Medium";
                }
                if (rb6.isSelected())
                {
                    difficulty = "Hard";
                }                          
            }
            if (rb3.isSelected())
            {
                gameName = "Geography";
                playerName = name.getText();
                if (rb4.isSelected())
                {
                    difficulty = "Easy";
                }
                if (rb5.isSelected())
                {
                    difficulty = "Medium";
                }
                if (rb6.isSelected())
                {
                    difficulty = "Hard";
                }                          
            }
            JFrame gamePanel = new JFrame();
            gamePanel.add(new CampusMapPanel(this));
            gamePanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gamePanel.setSize(1420, 1020);        
            gamePanel.setVisible(true);
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
        }
    }
}