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

public class CampusMapPanel extends JPanel implements ActionListener
{

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JLabel label;

    public CampusMapPanel()
    {
        super();
        setBackground(Color.gray);
        label = new JLabel();
        ImageIcon image = new ImageIcon("images/TitlePanel.jpg");
        label.setIcon(image);
        label.setBounds(new Rectangle(45,0,150,150));
        add(label);
        setLayout(null);
        b1 = new JButton("World Campus");
        b1.setBounds(new Rectangle(500,25,150,50));
        b1.addActionListener(this);
        b2 = new JButton("University Park");
        b2.setBounds(new Rectangle(500,125,150,50));
        b2.addActionListener(this);
        b3 = new JButton("Dubois");
        b3.setBounds(new Rectangle(500,225,150,50));
        b3.addActionListener(this);
        b4 = new JButton("Berks");
        b4.setBounds(new Rectangle(500,325,150,50));
        b4.addActionListener(this);
        b5 = new JButton("Altoona");
        b5.setBounds(new Rectangle(500,425,150,50));
        b5.addActionListener(this);
        b6 = new JButton("Erie");
        b6.setBounds(new Rectangle(500,525,150,50));
        b6.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);        
    }

   
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj == b1)
        {
            JFrame worldCampus = new JFrame();
            worldCampus.add(new PSWorldCampus());
            worldCampus.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            worldCampus.setSize(600, 480);        
            worldCampus.setVisible(true);
        }
        if (obj == b2)
        {
            JFrame uPark = new JFrame();
            uPark.add(new PSUPark());
            uPark.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            uPark.setSize(600, 480);            
            uPark.setVisible(true);
        }
        if (obj == b3)
        {
            JFrame dubois = new JFrame();
            dubois.add(new PSDubois());
            dubois.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            dubois.setSize(600, 480);         
            dubois.setVisible(true);
        }
        if (obj == b4)
        {
            JFrame berks = new JFrame();
            berks.add(new PSBerks());
            berks.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            berks.setSize(600, 480);            
            berks.setVisible(true);
        }      
        if (obj == b5)
        {
            JFrame erie = new JFrame();
            erie.add(new PSErie());
            erie.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            erie.setSize(600, 480);            
            erie.setVisible(true);
        }
        if (obj == b6)
        {
            JFrame altoona = new JFrame();
            altoona.add(new PSAltoona());
            altoona.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            altoona.setSize(600, 480);            
            altoona.setVisible(true);
        }          
    }
}