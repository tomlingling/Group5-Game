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
import java.io.*;
import java.beans.*;

public class InstructPanel extends JPanel implements ActionListener
{
    XMLDecoder de;
    String instructions;
    JButton b1;
    JButton b2;

    public InstructPanel()
    {
        super();
        setBackground(Color.yellow);
        b1 = new JButton();
        b1.setText("Click Here To View Instructions");
        b1.setBounds(new Rectangle(50,50,150,50));
        b1.addActionListener(this);
        b2 = new JButton();
        b2.setText("Back to Main Screen");
        b2.setBounds(new Rectangle(550,550,150,50));
        b2.addActionListener(this);
        add(b1);
        add(b2);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj == b1)
        {
            try
            {
                de = new XMLDecoder(new BufferedInputStream(new FileInputStream("InstructPanel.xml")));
            }
            catch (Exception xx)
            {
                xx.printStackTrace();
            }
            try
            {
                instructions = (String) de.readObject();
            }
            catch (Exception xx)
            {
                xx.printStackTrace();
            }
            try
            {
                de.close();
            }
            catch (Exception xx)
            {
                xx.printStackTrace();
            }
        }
        if (obj == b2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();            
        }
    }
}