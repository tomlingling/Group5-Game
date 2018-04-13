
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;

public class InstructPanel extends JPanel implements ActionListener
{
    XML_240 x2;
        
    JButton b1;
    JButton b2;

    public InstructPanel()
    {
        super();
        setBackground(Color.darkGray);
        x2 = new XML_240();
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
            b1.setVisible(false);
            b2.setVisible(false);
            setBackground(Color.blue);
            
            String s1 = ""; 
            x2.openReaderXML("InstructPanel.xml");
            s1 = (String) x2.ReadObject();
            x2.closeReaderXML();
            JButton b3 = new JButton("contents of s1 = " + s1);
            add(b3);
        }    
            
        if (obj == b2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();            
        }
    }
}