/* IST 240 Team 5
 * Michael Egnak, , 
 * Thomas Ling
 * Melissa Scott
 * Leonard Cadet
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import sun.audio.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class MyJPanel extends JPanel implements ActionListener
{

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JLabel label;  
    
    public MyJPanel()
    {
        super();
        setBackground(Color.darkGray);        
        setLayout(null);    
        playMusic("Defeat.wav");
        //---Instructions--
        b1 = new JButton("Instructions");
        b1.setBounds(new Rectangle(200,25,150,50));
        b1.addActionListener(this);
        add(b1);
        //---Game Designers---
        b2 = new JButton("Game Designers");
        b2.setBounds(new Rectangle(650,25,150,50));
        b2.addActionListener(this);
        add(b2);
        //-----Tips & Tricks---
        b3 = new JButton("Tips & Tricks");
        b3.setBounds(new Rectangle(430,25,150,50));
        b3.addActionListener(this);

        b4 = new JButton("Start Game");
        b4.setBounds(new Rectangle(750,325,250,150));
        b4.addActionListener(this);
        b5 = new JButton("Options");
        b5.setBounds(new Rectangle(800,225,150,50));
        b5.addActionListener(this);
        add(b1);
        add(b2);

        add(b3);
        //b4 = new JButton("Click to select options and start game");
        //b4.setBounds(new Rectangle(750,300,250,150));
        //b4.addActionListener(this);
        //---Go to Options and Start Game---
        b5 = new JButton("Click Here to Enter");
        b5.setBounds(new Rectangle(275,425,150,50));       
        b5.addActionListener(this);
        add(b5);
        //---Panel Background----
        label = new JLabel();
        ImageIcon image = new ImageIcon("images/TitlePanel.jpg");
        label.setIcon(image);
        label.setBounds(new Rectangle(200,10,682,730));
        add(label);         
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
        if (obj == b1)
        {
            JFrame instructions = new JFrame();
            instructions.add(new InstructPanel());
            instructions.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            instructions.setSize(800, 640);        
            instructions.setVisible(true);
        }
        if (obj == b2)
        {
            JFrame gameDesigner = new JFrame();
            gameDesigner.add(new GameDesigner());
            gameDesigner.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gameDesigner.setSize(800, 640);        
            gameDesigner.setVisible(true);
        }
        if (obj == b3)
        {
            JFrame tipsTricks = new JFrame();
            tipsTricks.add(new TipsTricks());
            tipsTricks.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            tipsTricks.setSize(800, 640);        
            tipsTricks.setVisible(true);
        }
        /**if (obj == b4)
        {
            JFrame gamePanel = new JFrame();
            gamePanel.add(new CampusMapPanel());
            gamePanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gamePanel.setSize(1420, 1020);        
            gamePanel.setVisible(true);
        } */
        if (obj == b5)
        {
            JFrame gameOptions = new JFrame();
            gameOptions.add(new GameOptions());
            gameOptions.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gameOptions.setSize(800, 640);        
            gameOptions.setVisible(true);
        } 
    }

}