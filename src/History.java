
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

    private void setUpQuestions() {
        h1 = new JButton("  ");
        h1.setBounds(new Rectangle(525, 30, 300, 35));
        if (questionNum == 0) {
            h1.setText("What year was this Campus found?");
        } else if (questionNum == 1) {
            h1.setText("When was the campus library created?");
        } else if (questionNum == 2) {
            h1.setText("Who was number 1?");
        }else if (questionNum == 3) {
            h1.setText("Click First Button to Close Window and move on");
        }
        add(h1);
        //h1.validate();
        //h1.repaint();

        h2 = new JButton(" ");
        h2.setBounds(new Rectangle(525, 150, 300, 35));
        //LOOK HERE Question Change
        if (questionNum == 0) {
            h2.setText("1900");
        } else if (questionNum == 1) {
            h2.setText("whatever");
        } else if (questionNum == 2) {
            h2.setText("question 3");
        } else if (questionNum == 3) {
            h2.setText("Click here to keep moving!");
        }
        h2.addActionListener(this);
        add(h2);
       // h2.validate();
       // h2.repaint();

        h3 = new JButton("  ");
        h3.setBounds(new Rectangle(525, 250, 300, 35));
        if (questionNum == 0) {
            h3.setText("1940");
        } else if (questionNum == 1) {
            h3.setText("whatever");
        } else if (questionNum == 2) {
            h3.setText("question 3");
        }
        add(h3);

        h4 = new JButton(" ");
        h4.setBounds(new Rectangle(525, 350, 300, 35));
        if (questionNum == 0) {
            h4.setText("1950");
        } else if (questionNum == 1) {
            h4.setText("whatever");
        } else if (questionNum == 2) {
            h4.setText("question 3");
        }
        add(h4);

        h5 = new JButton("  ");
        h5.setBounds(new Rectangle(525, 450, 300, 35));
        if (questionNum == 0) {
            h5.setText("1960");
        } else if (questionNum == 1) {
            h5.setText("whatever");
        } else if (questionNum == 2) {
            h5.setText("question 3");
        }
        add(h5);

        h6 = new JButton(" ");
        h6.setBounds(new Rectangle(525, 550, 300, 35));
        if (questionNum == 0) {
            h6.setText("1970");
        } else if (questionNum == 1) {
            h6.setText("whatever");
        } else if (questionNum == 2) {
            h6.setText("question 3");
        }
        add(h6);

        h7 = new JButton(" ");
        h7.setBounds(new Rectangle(525, 650, 300, 35));
        if (questionNum == 0) {
            h6.setText("1970");
        } else if (questionNum == 1) {
            h6.setText("whatever");
        } else if (questionNum == 2) {
            h6.setText("question 3");
        }
        add(h7);
        //revalidate();
        //validate();
    }

    public void actionPerformed(ActionEvent event) {

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
        Object obj = event.getSource();
        if (questionNum == 0) {
            if (campus.matches("PSU World Campus")) {
                if (obj == h2) {
                    h1.setText("Right! Click answer again to move forward!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    questionNum++;
                   // GameOptions games, int questionNum, String campus, int score
                    nextQuestion();
                   Frame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                   MyJFrame.dispose();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
            }
            if (campus.matches("Penn State DuBois")) {
                if (h3.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    // questionNum++;
                    //GameOptions games, int questionNum, String campus, int score
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Berks")) {
                if (h4.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Altoona")) {
                if (h5.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Erie")) {
                if (h6.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("University Park")) {
                if (h7.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }

        } else if (questionNum == 1) {
            if (campus.matches("PSU World Campus")) {
                if (obj == h2) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    questionNum++;
                    //GameOptions games, int questionNum, String campus, int score
                    nextQuestion();
                    JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                    MyJFrame.dispose();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }

            }
            if (campus.matches("Penn State DuBois")) {
                if (h3.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    // questionNum++;
                    //GameOptions games, int questionNum, String campus, int score
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Berks")) {
                if (h4.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Altoona")) {
                if (h5.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Erie")) {
                if (h6.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("University Park")) {
                if (h7.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
        } else if (questionNum == 2) {
            if (campus.matches("PSU World Campus")) {
                if (obj == h2) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    questionNum++;
                    //GameOptions games, int questionNum, String campus, int score
                    nextQuestion();
                    JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
                    MyJFrame.dispose();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }

            }
            if (campus.matches("Penn State DuBois")) {
                if (h3.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    // questionNum++;
                    //GameOptions games, int questionNum, String campus, int score
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Berks")) {
                if (h4.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Altoona")) {
                if (h5.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("Penn State Erie")) {
                if (h6.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                    nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }
            if (campus.matches("University Park")) {
                if (h7.isSelected()) {
                    h1.setText("Right!");
                    h1.setBackground(Color.GREEN);
                    score++;
                   nextQuestion();
                } else {
                    h1.setText("Wrong!! Try Again");
                    h1.setBackground(Color.RED);
                }
                questionNum++;
            }

        } 
        else if (questionNum ==3) {
            //h1.setText("Go to Next Campus!!");
          //  h1.setBackground(Color.magenta);
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
        }
    }

    private void nextQuestion() {
        setVisible(false);
        // question.this.dispose(); 
        JFrame question = new JFrame();
        question.add(new History(p1, questionNum, campus, score));
        setBackground(Color.darkGray);
        setLayout(null);
        question.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        question.setSize(800, 640);
        question.setVisible(true);

    }

}
