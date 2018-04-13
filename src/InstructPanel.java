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
    XML_240 x2;
    XMLDecoder de;
    String instructions = "";
    JButton b1;
    JButton b2;

    public InstructPanel()
    {
        super();
        x2 = new XML_240();        
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
        x2.openInstructions("InstructPanel.xml");
        instructions = (String) x2.ReadObject();
        x2.closeReaderXML();        
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
                b1.setText(instructions);
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

/*

public class myJPanelx extends JPanel
{

    XML_240 x2;

    public myJPanelx()
    {
        JButton b1 = new JButton("You have to read whatever you wrote, same types, same order");
        add(b1);
//=====================================
        x2 = new XML_240(); // creates the 240 class that reads and writes XML
//=====================================
        String s1 = "";
        String s2 = "";
        int num = 0;
        x2.openReaderXML("XML_test.xml");
        s1 = (String) x2.ReadObject();
        s2 = (String) x2.ReadObject();
        num = (Integer) x2.ReadObject();
        x2.closeReaderXML();
        //these statements above just open an xml file, read 3 lines in the file, then close it.
        //it is reading the XML file
        JButton b2 = new JButton("contents of s1 = " + s1);
        add(b2);
        JButton b3 = new JButton("contents of s2 = " + s2);
        add(b3);
        JButton b4 = new JButton("contents of num = " + num);
        add(b4);

    }

}

*/