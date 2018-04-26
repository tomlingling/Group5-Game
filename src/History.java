
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class History extends JPanel implements ActionListener {

    GameOptions p1;
    String campus;

    JButton question;
    JButton ans1;
    JButton ans2;
    JButton ans3;
    JButton close;

    int wcampScore;
    int altScore;
    int berkScore;
    int upScore;
    int erieScore;
    int dubScore;

    public History(GameOptions games, String campus) {

        super();
        p1 = games;
        setBackground(Color.darkGray);
        GridLayout mathPanel = new GridLayout(5, 10);
        setVisible(true);
        this.campus = campus;

        //-----Add question & answers based on campus selected-----
        if (campus.matches("PSWorldCampus")) {
            question = new JButton("Who invented the Internet to make World Campus possible?");
            add(question);

            ans1 = new JButton("Al Gore");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Robert Cerf");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("Vint Kahn");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }

        if (campus.matches("PSAltoona")) {
            question = new JButton("When was this campus found?");
            add(question);

            ans1 = new JButton("1939");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("1946");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("1947?");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);

        }
        if (campus.matches("PSUPark")) {
            question = new JButton("In what year did the Graduate School form?");
            add(question);

            ans1 = new JButton("1883");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("1922");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("1950");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSErie")) {
            question = new JButton("This alumnus hit a home run in the 1987 World Series?");
            add(question);

            ans1 = new JButton("Don Baylor");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Tom Herr");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("Tom Lawless");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSBerks")) {
            question = new JButton("What was Penn State Berks originally known as?");
            add(question);

            ans1 = new JButton("Penn State Reading");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Reading Textiles Institute");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("Wyomissing Polytechnic Institute");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSDubois")) {
            question = new JButton("When was the first summer semester offered?");
            add(question);

            ans1 = new JButton("1935");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("1942");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("1945");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }

    }

    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        if (campus.matches("PSWorldCampus")) {
            if (obj == ans1) {
                ans1.setText("Right!");
                ans1.setBackground(Color.GREEN);
                wcampScore = 1;
            } else {
                ans1.setText("Wrong!!");
                ans1.setBackground(Color.RED);
                wcampScore = 0;
            }
        }
        if (campus.matches("PSAltoona")) {
            if (obj == ans1) {
                ans1.setText("Right!");
                ans1.setBackground(Color.GREEN);
                altScore = 1;
            } else {
                ans1.setText("Wrong!!");
                ans1.setBackground(Color.RED);
                altScore = 0;
            }
        }
        if (campus.matches("PSUPark")) {
            if (obj == ans2) {
                ans2.setText("Right!");
                ans2.setBackground(Color.GREEN);
                upScore = 1;
            } else {
                ans2.setText("Wrong!!");
                ans2.setBackground(Color.RED);
                upScore = 0;
            }
        }
        if (campus.matches("PSErie")) {
            if (obj == ans3) {
                ans3.setText("Right!");
                ans3.setBackground(Color.GREEN);
                erieScore = 1;
            } else {
                ans3.setText("Wrong!!");
                ans3.setBackground(Color.RED);
                erieScore = 0;
            }
        }
        if (campus.matches("PSBerks")) {
            if (obj == ans3) {
                ans3.setText("Right!");
                ans3.setBackground(Color.GREEN);
                berkScore = 1;
            } else {
                ans3.setText("Wrong!!");
                ans3.setBackground(Color.RED);;
                berkScore = 0;
            }
        }
        if (campus.matches("PSDubois")) {
            if (obj == ans2) {
                ans2.setText("Right!");
                ans2.setBackground(Color.GREEN);
                dubScore = 1;
            } else {
                ans2.setText("Wrong!!");
                ans2.setBackground(Color.RED);;
                dubScore = 0;
            }

        }
        if (obj == close) {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
        }
    }
}
