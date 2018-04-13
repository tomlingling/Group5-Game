

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import sun.audio.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*public class GameDesigner extends JPanel
{

    JButton b1;
                
    public GameDesigner()
    {
        super();
        setBackground(Color.darkGray);
<<<<<<< HEAD

=======
        
        x = 300;
        y = 200;
        header = "scrolling";
        setSize(400,300);
    }    
        @Override
        public void paint(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0, 0, 400, 300);
            g.setColor(Color.black);        
            g.drawString(header, x, y);
        }
        
        public void start() throws InterruptedException
        {
            while(true){
                while (y > 10)
                {
                    x = getWidth();
                    y--;
                    repaint();
                    Thread.sleep(10);
                }
            }
        }
        
        
>>>>>>> e64db2314cd271e627a5418d6fb1d290b676fd64
        //----placeholder buttons----
        b1 = new JButton();
        b1.setText("This is a place-holder for game designers");
        b1.setBounds(new Rectangle(50,50,150,50));
        add(b1);
        playMusic("20Fox.wav");
    }    
<<<<<<< HEAD
    
=======
        
>>>>>>> e64db2314cd271e627a5418d6fb1d290b676fd64
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
*/