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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class MyJPanel extends JPanel implements ActionListener
{

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JLabel label;
    
    public MyJPanel()
    {
        super();
        setBackground(Color.BLUE);
        label = new JLabel();
        ImageIcon image = new ImageIcon("images/TitlePanel.jpg");
        label.setIcon(image);
        label.setBounds(new Rectangle(45,0,682,730));
        add(label);
        setLayout(null);
        b1 = new JButton("Instructions");
        b1.setBounds(new Rectangle(800,25,150,50));
        b1.addActionListener(this);
        b2 = new JButton("Game Designers");
        b2.setBounds(new Rectangle(800,125,150,50));
        b2.addActionListener(this);
        b3 = new JButton("Tips & Tricks");
        b3.setBounds(new Rectangle(800,225,150,50));
        b3.addActionListener(this);
        b4 = new JButton("Start Game");
        b4.setBounds(new Rectangle(750,325,250,150));
        b4.addActionListener(this);         
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj == b1)
        {
            JFrame instructions = new JFrame();
            instructions.add(new InstructPanel());
            instructions.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            instructions.setSize(800, 640);        
            instructions.setVisible(true);
        }
        if (obj == b2)
        {
            JFrame gameDesigner = new JFrame();
            gameDesigner.add(new GameDesigner());
            gameDesigner.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gameDesigner.setSize(800, 640);        
            gameDesigner.setVisible(true);
        }
        if (obj == b3)
        {
            JFrame tipsTricks = new JFrame();
            tipsTricks.add(new TipsTricks());
            tipsTricks.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            tipsTricks.setSize(800, 640);        
            tipsTricks.setVisible(true);
        }
        if (obj == b4)
        {
            JFrame gamePanel = new JFrame();
            gamePanel.add(new CampusMapPanel());
            gamePanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gamePanel.setSize(800, 640);        
            gamePanel.setVisible(true);
        }         
    }

}