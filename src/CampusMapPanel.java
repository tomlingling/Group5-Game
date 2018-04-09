/* IST 240 Team 5
 * Michael Egnak, , 
 * Thomas Ling
 * Melissa Scott
 * Leonard Cadet
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
    GameOptions p1;        
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton goToMain;
    JButton timeLimit;
    JButton timer;
    JLabel label;
    JButton gameName;
    JButton playerName;
    JButton difficulty;
    String gamePicked = "Test";
    String nameOfPlayer = "Name";
    String difficultySelected = "Normal";
    
    int counter = 10;
    int delay;
    Timer tim;
    

    public CampusMapPanel(GameOptions games)
    {
        super();
        p1 = games;
        setBackground(Color.gray);
        setLayout(null);  
        //----Name of Game Selected----
        gamePicked = p1.gameName;
        gameName = new JButton("You have chosen " + gamePicked + " as your option.");
        gameName.setBounds(new Rectangle(525,30,300,35));
        add(gameName);
        //---Player Name----
        nameOfPlayer = p1.playerName;
        playerName = new JButton("Welcome, " + nameOfPlayer);
        playerName.setBounds(new Rectangle(175,30,270,35));
        add(playerName);        
        //----Difficulty Level---
        difficultySelected = p1.difficulty;
        difficulty = new JButton("You're level is set to " + difficultySelected);
        difficulty.setBounds(new Rectangle(900,30,270,35));
        add(difficulty);
        //----Back to Main Screen---
        //goToMain = new JButton("Back to Main Screen");
        //goToMain.setBounds(new Rectangle(50,30,170,35));
        //goToMain.addActionListener(this);
        //add(goToMain);
        //----Time Limit Reminder----
        timeLimit = new JButton("Pick your campus to continue.");
        timeLimit.setBounds(new Rectangle(550,130,250,35));
        add(timeLimit);
        //----Timer Button---
        timer = new JButton("Timer");
        timer.setBounds(new Rectangle(1000,280,170,170));
        add(timer);        
        //----World Campus---
        b1 = new JButton("World Campus");
        ImageIcon imageB1 = new ImageIcon("images/PSWorld2.jpg");
        b1.setIcon(imageB1);
        b1.setBounds(new Rectangle(775,230,135,120));
        b1.addActionListener(this);
        add(b1);
        //----University Park---
        b2 = new JButton("University Park");
        ImageIcon imageB2 = new ImageIcon("images/PSUPark.jpg");
        b2.setIcon(imageB2);
        b2.setBounds(new Rectangle(600,500,138,118));        
        b2.addActionListener(this);
        add(b2);
        //----DuBois Campus
        b3 = new JButton("DuBois");
        ImageIcon imageB3 = new ImageIcon("images/PSDuBois.jpg");
        b3.setIcon(imageB3);
        b3.setBounds(new Rectangle(350,325,139,118));
        b3.addActionListener(this);
        add(b3);
        //-----Berks Campus---
        b4 = new JButton("Berks");
        ImageIcon imageB4 = new ImageIcon("images/PSBerks.jpg");
        b4.setIcon(imageB4);
        b4.setBounds(new Rectangle(950,575,140,140));
        b4.addActionListener(this);
        add(b4);
        //----Erie Campus---
        b5 = new JButton("Erie");
        ImageIcon imageB5 = new ImageIcon("images/PSErie.jpg");
        b5.setIcon(imageB5);
        b5.setBounds(new Rectangle(120,150,140,140));
        b5.addActionListener(this);
        add(b5);
        //----Altoona Campus---
        b6 = new JButton("Altoona");
        ImageIcon imageB6 = new ImageIcon("images/PSAltoona.jpg");
        b6.setIcon(imageB6);
        b6.setBounds(new Rectangle(450,550,142,140));
        b6.addActionListener(this);
        add(b6);   
        //----Map Background----
        label = new JLabel();
        ImageIcon image = new ImageIcon("images/pennsylvania.jpg");
        label.setIcon(image);
        label.setBounds(new Rectangle(0,100,1415,882));
        add(label);
        //----keep the timer moving-----------
  	if (difficultySelected == ("Easy"))
        {	
            delay = 5000; //milliseconds
            tim = new Timer(delay, this);
        }
        else if (difficultySelected == ("Medium"))
        {
            delay = 1000; //milliseconds
            tim = new Timer(delay, this);
        } 
        else if (difficultySelected == ("Hard"))
        {
            delay = 500;  //milliseconds
            tim = new Timer(delay, this);
        }
        
        
    }

   
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();
        //---Start Timer---
        tim.start();
        timer.setBackground(Color.green);
        timer.setText(String.valueOf(counter));
                counter--;
                if (counter == -1)
                {
                    tim.stop();
                    timer.setBackground(Color.red);
                    timer.setText("OUT OF TIME!!");
                    counter = 10;
                }
        if (obj == b1)
        {            
            JFrame worldCampus = new JFrame();
            worldCampus.add(new PSWorldCampus(p1));
            worldCampus.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            worldCampus.setSize(600, 480);        
            worldCampus.setVisible(true);
        }
        if (obj == b2)
        {            
            JFrame uPark = new JFrame();
            uPark.add(new PSUPark(p1));
            uPark.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            uPark.setSize(600, 480);            
            uPark.setVisible(true);
        }
        if (obj == b3)
        {            
            JFrame dubois = new JFrame();
            dubois.add(new PSDubois(p1));
            dubois.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            dubois.setSize(600, 480);         
            dubois.setVisible(true);
        }
        if (obj == b4)
        {            
            JFrame berks = new JFrame();
            berks.add(new PSBerks(p1));
            berks.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            berks.setSize(600, 480);            
            berks.setVisible(true);
        }      
        if (obj == b5)
        {            
            JFrame erie = new JFrame();
            erie.add(new PSErie(p1));
            erie.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            erie.setSize(600, 480);            
            erie.setVisible(true);
        }
        if (obj == b6)
        {            
            JFrame altoona = new JFrame();
            altoona.add(new PSAltoona(p1));
            altoona.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            altoona.setSize(600, 480);            
            altoona.setVisible(true);
        }          
    }
}