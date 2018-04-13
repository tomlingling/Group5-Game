

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import sun.audio.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GameDesigner extends JPanel
{

    JButton b1;
                
    public GameDesigner()
    {
        super();
        setBackground(Color.darkGray);

        //----placeholder buttons----
        b1 = new JButton();
        b1.setText("This is a place-holder for game designers");
        b1.setBounds(new Rectangle(50,50,150,50));
        add(b1);
        playMusic("20Fox.wav");
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
}
