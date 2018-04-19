

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import sun.audio.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GameDesigner extends JPanel implements ActionListener
{

    JButton b1;
    JButton b2;
                
    public GameDesigner()
    {
        super();
        setBackground(Color.darkGray);
        //----placeholder buttons----
        b1 = new JButton();
        ImageIcon imageButton = new ImageIcon("images/GameDesign.jpg"); 
        b1.setIcon(imageButton);                    
        add(b1);
        playMusic("TaDa.wav");
        b2 = new JButton();
        b2.setText("Back to Main Screen");
        b2.setBounds(new Rectangle(550,550,150,50));
        b2.addActionListener(this);
        add(b2);
    }    

        //----play music....thank you StackOverflow & YouTube!!!----
    public static void playMusic(String filepath)
    {
        InputStream music;
        try
        {
            music = new FileInputStream(new File(filepath));
            AudioStream audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "error");
            
        }
    }
    
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        if (obj == b2)
        {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();            
        }
    }
}