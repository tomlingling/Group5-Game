
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import sun.audio.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GameOptions extends JPanel implements ActionListener
{

    JRadioButton rb1 = new JRadioButton("History",true);
    JRadioButton rb2 = new JRadioButton("Math");
    JRadioButton rb3 = new JRadioButton("Geography");
    JRadioButton rb4 = new JRadioButton("Easy",true);
    JRadioButton rb5 = new JRadioButton("Medium");
    JRadioButton rb6 = new JRadioButton("Hard");    
    JButton subject = new JButton("Select Your Subject");
    JButton difficult = new JButton("Select Your Difficulty");
    JButton save = new JButton("Click Here to Begin!");    
    JTextField name = new JTextField("Type Your Name Here",30);
    String gameName;
    String playerName;
    String difficulty;

    public GameOptions()
    {
        super();                
        setBackground(Color.darkGray);
        playMusic("GreenHill.wav");
        setLayout(new GridLayout(6,2,5,31));
        
        //---Options Buttons----
        add(subject);        
        ButtonGroup options = new ButtonGroup();
        options.add(rb1);
        options.add(rb2);
        options.add(rb3);
        //-----Difficulty Buttons-----
        add(difficult);        
        ButtonGroup difficulty = new ButtonGroup();
        difficulty.add(rb4);
        difficulty.add(rb5);
        difficulty.add(rb6);        
        //----Assign Action Listeners-----        
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
        rb5.addActionListener(this);
        rb6.addActionListener(this);                
        name.addActionListener(this);
        save.addActionListener(this);  
        //----Add All Buttons-----
        add(rb1);
        add(rb4);
        add(rb2);
        add(rb5);
        add(rb3);       
        add(rb6);                
        add(name);
        add(save);        
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
        if (obj == save)
        {
            if (rb1.isSelected())
            {
                gameName = "History";
                playerName = name.getText();
                if (rb4.isSelected())
                {
                    difficulty = "Easy";
                }
                if (rb5.isSelected())
                {
                    difficulty = "Medium";
                }
                if (rb6.isSelected())
                {
                    difficulty = "Hard";
                }                  
            }
            if (rb2.isSelected())
            {
                gameName = "Math";
                playerName = name.getText();
                if (rb4.isSelected())
                {
                    difficulty = "Easy";
                }
                if (rb5.isSelected())
                {
                    difficulty = "Medium";
                }
                if (rb6.isSelected())
                {
                    difficulty = "Hard";
                }                          
            }
            if (rb3.isSelected())
            {
                gameName = "Geography";
                playerName = name.getText();
                if (rb4.isSelected())
                {
                    difficulty = "Easy";
                }
                if (rb5.isSelected())
                {
                    difficulty = "Medium";
                }
                if (rb6.isSelected())
                {
                    difficulty = "Hard";
                }                          
            }
            JFrame gamePanel = new JFrame();
            gamePanel.add(new CampusMapPanel(this));
            gamePanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gamePanel.setSize(1420, 1020);        
            gamePanel.setVisible(true);
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
        }
    }
}