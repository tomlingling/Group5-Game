
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.beans.*;

public class InstructPanel extends JPanel implements ActionListener
{
    XMLDecoder de;
    String title;
    String l1;
    String l2;
    String l3;
    String l4;
    String l5;
    String l6;
    String l7;
    String l8;
    String l9;
    String l10;
        
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    JButton p2;
    
    public InstructPanel()
    {
        setLayout(new GridLayout(12,1));
        
        b1 = new JButton();
        add(b1);
        b2 = new JButton();
        add(b2);
        b3 = new JButton();
        add(b3);
        b4 = new JButton();
        add(b4);
        b5 = new JButton();
        add(b5);
        b6 = new JButton();
        add(b6);
        b7 = new JButton();
        add(b7);
        b8 = new JButton();
        add(b8);
        b9 = new JButton();
        add(b9);
        b10 = new JButton();
        add(b10);
        b11 = new JButton();
        add(b11);
        
        
        b1.setText(title);
        b2.setText(l1);
        b3.setText(l2);
        b4.setText(l3);
        b5.setText(l4);
        b6.setText(l5);
        b7.setText(l6);
        b8.setText(l7);
        b9.setText(l8);
        b10.setText(l9);
        b11.setText(l10);
        
        p2 = new JButton();
        p2.setText("Click Here for Main Screen");
        p2.setBounds(new Rectangle(550,550,150,50));
        p2.addActionListener(this);
        add(p2);
    }


        {
            try
            {
                de = new XMLDecoder(new BufferedInputStream(new FileInputStream("InstructPanel.xml")));
            } catch (Exception xx)
            {
                xx.printStackTrace();
            }
            try
            {
                title = (String) de.readObject();
                l1 = (String) de.readObject();
                l2 = (String) de.readObject();
                l3 = (String) de.readObject();
                l4 = (String) de.readObject();
                l5 = (String) de.readObject();
                l6 = (String) de.readObject();
                l7 = (String) de.readObject();
                l8 = (String) de.readObject();
                l9 = (String) de.readObject();
                l10 = (String) de.readObject();
                

            } catch (Exception xx)
            {
                xx.printStackTrace();
            }
            try
            {
                de.close();
            } catch (Exception xx)
            {
                xx.printStackTrace();
            }
        }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        
            

        if (obj == p2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();            
        }
    }
}