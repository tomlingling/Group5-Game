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

public class TipsTricks extends JPanel
{

    JButton b1;

    public TipsTricks()
    {
        super();
        setBackground(Color.yellow);
        b1 = new JButton();
        b1.setText("This is a place-holder for Tips and Tricks");
        b1.setBounds(new Rectangle(50,50,150,50));
        add(b1);
    }

}