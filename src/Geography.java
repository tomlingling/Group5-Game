
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Len
 */
public class Geography extends JPanel implements ActionListener {

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

    public Geography(GameOptions games, String campus) {
        super();
        p1 = games;
        setBackground(Color.darkGray);
        GridLayout mathPanel = new GridLayout(5, 10);
        setVisible(true);
        this.campus = campus;

        //-----Add question & answers based on campus selected-----
        if (campus.matches("PSWorldCampus")) {
            question = new JButton("From the Center of the PA where is this campus?");
            add(question);

            ans1 = new JButton("North");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("East");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("The interwebs...you can ping it to PA silly!");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }

        if (campus.matches("PSAltoona")) {
            question = new JButton("Where do some campus buildings reside in Altoona?");
            add(question);

            ans1 = new JButton("Downtown");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Uptown");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("City Center");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);

        }
        if (campus.matches("PSUPark")) {
            question = new JButton("What climate is this campus have from May to August?");
            add(question);

            ans1 = new JButton("humid subtropical");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Tropical Monsoon");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("Wet Tropical");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSErie")) {
            question = new JButton("What Great Lake is by this campus??");
            add(question);

            ans1 = new JButton("Superior");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Ontario");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("Erie");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSBerks")) {
            question = new JButton("What tree is common in this area?");
            add(question);

            ans1 = new JButton("Red Oak");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("Cherry Blossom");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("Occidentalis");
            ans3.addActionListener(this);
            add(ans3);

            close = new JButton("Next Question");
            close.addActionListener(this);
            add(close);
        }
        if (campus.matches("PSDubois")) {
            question = new JButton("How many Square Miles of Dubois is water?");
            add(question);

            ans1 = new JButton(".04");
            ans1.addActionListener(this);
            add(ans1);

            ans2 = new JButton("1");
            ans2.addActionListener(this);
            add(ans2);

            ans3 = new JButton("10");
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
            if (obj == ans3) {
                ans3.setText("Right!");
                ans3.setBackground(Color.GREEN);
                wcampScore = 1;
            } else {
                ans2.setText("Wrong!!");
                ans2.setBackground(Color.RED);
                wcampScore = 0;
            }
        }
        if (campus.matches("PSAltoona")) {
            if (obj == ans1) {
                ans1.setText("Right!");
                ans1.setBackground(Color.GREEN);
                altScore = 1;
            } else {
                ans2.setText("Wrong!!");
                ans2.setBackground(Color.RED);
                altScore = 0;
            }
        }
        if (campus.matches("PSUPark")) {
            if (obj == ans1) {
                ans1.setText("Right!");
                ans1.setBackground(Color.GREEN);
                upScore = 1;
            } else {
                ans3.setText("Wrong!!");
                ans3.setBackground(Color.RED);
                upScore = 0;
            }
        }
        if (campus.matches("PSErie")) {
            if (obj == ans3) {
                ans3.setText("Right!");
                ans3.setBackground(Color.GREEN);
                erieScore = 1;
            } else {
                ans1.setText("Wrong!!");
                ans1.setBackground(Color.RED);
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
                ans3.setBackground(Color.RED);
                berkScore = 0;
            }
        }
        if (campus.matches("PSDubois")) {
            if (obj == ans1) {
                ans1.setText("Right!");
                ans1.setBackground(Color.GREEN);
                dubScore = 1;
            } else {
                ans2.setText("Wrong!!");
                ans2.setBackground(Color.RED);
                dubScore = 0;
            }

        }
        if (obj == close) {
            JFrame MyJFrame = (JFrame) SwingUtilities.getRoot(this);
            MyJFrame.dispose();
        }
    }
}
