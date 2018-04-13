
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
        
        
        
        
        //b1 = new JButton();
        //b1.setText("This is a place-holder for game designers");
        //b1.setBounds(new Rectangle(50,50,150,50));
        //add(b1);
    
}
