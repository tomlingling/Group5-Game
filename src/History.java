
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;

public class History extends JPanel implements ActionListener {

    //CampusMapPanel p1;
    GameOptions p1;
    JButton b1;
    JButton h1;
    JButton h2;
    JButton h3;
    JButton h4;
    JButton h5;
    JButton h6;
    JButton h7;

    //JLabel label = new JLabel("History Question 1");
    //JLabel label2 = new JLabel("What year was this Campus found?");
    // JButton button1 = new JButton("1900");
    //JButton button2 = new JButton("1910");
    //JButton button3 = new JButton("1920");
    //JButton button4 = new JButton("1930");
    // JButton button5 = new JButton("1950");
    //JButton button6 = new JButton("1980");

    /**
     *
     * @param games
     * @param questionNum
     * @param campus
     * @param score
     */
        public History(GameOptions games, int questionNum, String campus, int score) {
        super();
        p1 = games;
        setBackground(Color.YELLOW);
        setLayout(null);
        // Change question
        h1 = new JButton("  ");
        h1.setBounds(new Rectangle(525, 30, 300, 35));
        if (questionNum == 1) {
            h1.setText("What year was this Campus found?");
        } else if (questionNum == 2) {
            h1.setText("When was the campus library created?");
        } else if (questionNum == 3) {
            h1.setText("Who was number 1?");
        }
        add(h1);

        h2 = new JButton(" ");
        h2.setBounds(new Rectangle(525, 150, 300, 35));
        //LOOK HERE Question Change
        if (questionNum == 1) {
            h2.setText("1900");
        } else if (questionNum == 2) {
            h2.setText("whatever");
        } else if (questionNum == 3) {
            h2.setText("question 3");
        }
        add(h2);

        h3 = new JButton("  ");
        h3.setBounds(new Rectangle(525, 250, 300, 35));
        if (questionNum == 1) {
            h3.setText("1940");
        } else if (questionNum == 2) {
            h3.setText("whatever");
        } else if (questionNum == 3) {
            h3.setText("question 3");
        }
        add(h3);

        h4 = new JButton(" ");
        h4.setBounds(new Rectangle(525, 350, 300, 35));
        if (questionNum == 1) {
            h4.setText("1950");
        } else if (questionNum == 2) {
            h4.setText("whatever");
        } else if (questionNum == 3) {
            h4.setText("question 3");
        }
        add(h4);

        h5 = new JButton("  ");
        h5.setBounds(new Rectangle(525, 450, 300, 35));
        if (questionNum == 1) {
            h5.setText("1960");
        } else if (questionNum == 2) {
            h5.setText("whatever");
        } else if (questionNum == 3) {
            h5.setText("question 3");
        }
        add(h5);

        h6 = new JButton(" ");
        h6.setBounds(new Rectangle(525, 550, 300, 35));
        if (questionNum == 1) {
            h6.setText("1970");
        } else if (questionNum == 2) {
            h6.setText("whatever");
        } else if (questionNum == 3) {
            h6.setText("question 3");
        }
        add(h6);

        h7 = new JButton(" ");
        h7.setBounds(new Rectangle(525, 650, 300, 35));
        if (questionNum == 1) {
            h6.setText("1970");
        } else if (questionNum == 2) {
            h6.setText("whatever");
        } else if (questionNum == 3) {
            h6.setText("question 3");
        }
        add(h7);
    }
    /*
     public  void actionperformed(ActionEvent event) {
     //If World Campus is selected
     if (p1.b1.isSelected()) {
     if (button1.isSelected()) {
     label2.setText("Right!");
     label2.setBackground(Color.GREEN);

     } else {
     label2.setText("Wrong!!");
     label2.setBackground(Color.RED);

     }
     }
     //If University Park is selected
     if (p1.b2.isSelected()) {
     if (button2.isSelected()) {
     label2.setText("Right!");
     label2.setBackground(Color.GREEN);

     } else {
     label2.setText("Wrong!!");
     label2.setBackground(Color.RED);

     }
     }
     }
     

     /* public History(GameOptions games) {
     b1 = new JButton();
     b1.setText("Question 1");
     b1.setBounds(new Rectangle(125, 50, 350, 50));
     add(b1);
     */

 

    @Override
    public void actionPerformed(ActionEvent ae) {

        /*
       
        
        
         if
         answer1 is presses && campus == stateCollege
         then
         check question 1
         if 
         question is 1
         then
         recall history class
         Pass game, and question++, also increase score
         else if
         answer 2 is pressed
         if
         question is 1
         then
         print wrong answer
                        
        
         */
    }
}
