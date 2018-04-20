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
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TipsTricks extends JPanel implements ActionListener
{
    XML_240 x2;
    JTextPane t1; 
    JButton b1;
    JButton p2;
    String s1, s2, s3, s4, s5, s6;
    String newline = System.getProperty("line.separator");
    
    public TipsTricks()
    {
        super();
        x2 = new XML_240();
        setBackground(Color.blue);
        b1 = new JButton();
        add(b1);
        b1.addActionListener(this);
        b1.setText("Click Here for Tips and Tricks on the Game");
        p2 = new JButton();
        p2.setText("Click Here for Main Screen");
        p2.setBounds(new Rectangle(550,550,150,50));
        p2.addActionListener(this);
        add(p2);
    }


    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj==b1)
        {
            setLayout(null);
            t1 = new JTextPane();
            b1.setVisible(false);
            x2.openReaderXML("TipsTricks.xml");
            t1.setBounds(new Rectangle(50,50,600,200));
            p2.setBounds(new Rectangle(300,450,200,100));
            s1 = (String) x2.ReadObject();
            s2 = (String) x2.ReadObject();
            s3 = (String) x2.ReadObject();
            s4 = (String) x2.ReadObject();
            s5 = (String) x2.ReadObject();
            s6 = (String) x2.ReadObject();            
            t1.setText(s1 + newline + s2 + newline + s3 + newline + s4 + newline + s5 + newline + s6);
            t1.setEditable(false);
            add(t1);
        }
        if (obj == p2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();            
        }
    }
}