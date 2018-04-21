
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

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
    String campus;
    int questionNum;
    int score;
    String UserScore; 

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
        this.campus = campus;
        this.questionNum = questionNum;
        this.score = score;
        // Change question
        setUpQuestions();
    }
  

    private void setUpQuestions() {
        h1 = new JButton("What year was this Campus found?");
        h1.setBounds(new Rectangle(525, 30, 300, 35));

        add(h1);
        //h1.validate();
        //h1.repaint();

        h2 = new JButton("1900");
        h2.setBounds(new Rectangle(525, 150, 300, 35));

        h2.addActionListener(this);
        add(h2);
        // h2.validate();
        // h2.repaint();

        h3 = new JButton("1940");
        h3.setBounds(new Rectangle(525, 250, 300, 35));

        h3.addActionListener(this);
        add(h3);

        h4 = new JButton("1950");
        h4.setBounds(new Rectangle(525, 350, 300, 35));

        h4.addActionListener(this);
        add(h4);

        h5 = new JButton("1960");
        h5.setBounds(new Rectangle(525, 450, 300, 35));

        h5.addActionListener(this);
        add(h5);

        h6 = new JButton("1970");
        h6.setBounds(new Rectangle(525, 550, 300, 35));

        h6.addActionListener(this);
        add(h6);

        h7 = new JButton("1980");
        h7.setBounds(new Rectangle(525, 650, 300, 35));

        h7.addActionListener(this);
        add(h7);

    }

    public void actionPerformed(ActionEvent event) {
//
        Object obj = event.getSource();
        if (campus.matches("PSU World Campus")) {
            if (obj == h2) {
                h1.setText("Right!");
                h1.setBackground(Color.GREEN);
                Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();
                score++ ;
            } else {
                h1.setText("Wrong! Try Another Answer!");
                h1.setBackground(Color.RED);
            }
        }

        if (campus.matches("Penn State DuBois")) {
            if (obj == h3) {
                h1.setText("Right!");
                h1.setBackground(Color.GREEN);
                Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();
                score++ ;
            } else {
                h1.setText("Wrong! Try Another Answer!");
                h1.setBackground(Color.RED);
            }
        }

        if (campus.matches("Penn State Berks")) {
            if (obj == h4) {
                h1.setText("Right!");
                h1.setBackground(Color.GREEN);
                Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();
                score++ ;
            } else {
                h1.setText("Wrong! Try Another Answer!");
                h1.setBackground(Color.RED);
            }
        }

        if (campus.matches("Penn State Altoona")) {
            if (obj == h5) {
                h1.setText("Right!");
                h1.setBackground(Color.GREEN);
                Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();
                score++ ;
            } else {
                h1.setText("Wrong! Try Another Answer!");
                h1.setBackground(Color.RED);
            }
        }

        if (campus.matches("Penn State Erie")) {
            if (obj == h6) {
                h1.setText("Right!");
                h1.setBackground(Color.GREEN);
                Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();
                score++ ;
            } else {
                h1.setText("Wrong! Try Another Answer!");
                h1.setBackground(Color.RED);
            }
        }

        if (campus.matches("University Park")) {
            if (obj == h7) {
                h1.setText("Right!");
                h1.setBackground(Color.GREEN);
                Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                MyJFrame.dispose();
                score++ ;
            } else {
                h1.setText("Wrong! Try Another Answer!");
                h1.setBackground(Color.RED);
            }
        }
   //int FinalScore = score;
   String UserScore =String.valueOf(score);
   System.out.println(UserScore);
    }

}
