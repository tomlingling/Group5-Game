
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.*;

public class GameDesigner extends JPanel
{

    //JButton b1;
    int x;
    int y;
    int count;
    
    String header;
    String team1;
    String team2;
    String team3;
    String team4;
            
    

    public GameDesigner()
    {
        super();
        setBackground(Color.darkGray);
        
        x = 300;
        y = 700;
        header = "scrolling";
        setSize(400,300);
    }    
        @Override
        public void paint(Graphics g){
        g.drawString(header, x, y);
        }
        
        
        
        
        //b1 = new JButton();
        //b1.setText("This is a place-holder for game designers");
        //b1.setBounds(new Rectangle(50,50,150,50));
        //add(b1);
    
}
