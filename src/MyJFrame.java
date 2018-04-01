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

public class MyJFrame extends JFrame
{

    public MyJFrame()
    {
        super("Communication Between Classes - Assignment");

        MyJPanel mjp = new MyJPanel();
        add(mjp, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 768);
        setVisible(true);
    }

}