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

public class PSErie extends JPanel
{

    JButton b1;

    public PSErie()
    {
        super();
        setBackground(Color.yellow);
        b1 = new JButton();
        b1.setText("This is a place-holder for Erie actions");
        b1.setBounds(new Rectangle(50,50,150,50));
        add(b1);
    }
}
