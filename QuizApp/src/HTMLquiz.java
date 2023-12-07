

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HTMLquiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public int count = 0;
    public int score = 0;
    
    String name;
    
    HTMLquiz(String name) {
        this.name = name;
        setBounds(5, 5, 1180, 690);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1164, 339);
        getContentPane().add(image);
        
        qno = new JLabel();
        qno.setBounds(51, 367, 50, 30);
        qno.setFont(new Font("Tahoma", Font.BOLD, 24));
        getContentPane().add(qno);
        
        question = new JLabel();
        question.setBounds(89, 367, 1075, 30);
        question.setFont(new Font("Tahoma", Font.BOLD, 24));
        getContentPane().add(question);
        
        questions[0][0] = "HTML stands for?";
        questions[0][1] = "HighText Machine Language";
        questions[0][2] = "HyperText and links Markup Language";
        questions[0][3] = "HyperText Markup Language";
        questions[0][4] = "None of these";

        questions[1][0] = "The correct sequence of HTML tags for starting a webpage is ?";
        questions[1][1] = "HTML, Head, Title, Body";
        questions[1][2] = "HTML, Body, Title, Head";
        questions[1][3] = "Head, Title, HTML, body";
        questions[1][4] = "HTML, Head, Title, section";

        questions[2][0] = "Which of the following element is responsible for making the text bold in HTML?";
        questions[2][1] = "<pre>";
        questions[2][2] = "<a>";
        questions[2][3] = "<br>";
        questions[2][4] = "<b>";

        questions[3][0] = "Which of the following tag is used for inserting the largest heading in HTML?";
        questions[3][1] = "<h3>";
        questions[3][2] = "<h1>";
        questions[3][3] = "<h5>";
        questions[3][4] = "<h6>";

        questions[4][0] = "Which of the following tag is used to insert a line-break in HTML?";
        questions[4][1] = "<br>";
        questions[4][2] = "<a>";
        questions[4][3] = "<pre>";
        questions[4][4] = "<b>";

        questions[5][0] = " How to create an unordered list (a list with the list items in bullets) in HTML?";
        questions[5][1] = "<ul>";
        questions[5][2] = "<ol>";
        questions[5][3] = "<li>";
        questions[5][4] = "<i>";

        questions[6][0] = "Which of the following tag is used to make the underlined text??";
        questions[6][1] = "<i>";
        questions[6][2] = "<ul>";
        questions[6][3] = "<pre>";
        questions[6][4] = "<u>";

        questions[7][0] = "How to create a checkbox in HTML?";
        questions[7][1] = "<input type = \"button\">";
        questions[7][2] = "<input type = \\\"checkbox\\\">";
        questions[7][3] = "<checkbox>";
        questions[7][4] = "<input type = \"check\">";

        questions[8][0] = "Which of the following tag is used to define options in a drop-down selection list?";
        questions[8][1] = "<select>";
        questions[8][2] = "<list>";
        questions[8][3] = "<dropdown>";
        questions[8][4] = "<option>";

        questions[9][0] = " Which of the following is the paragraph tag in HTML?";
        questions[9][1] = "<p>";
        questions[9][2] = "<b>";
        questions[9][3] = "<pre>";
        questions[9][4] = "None of the above";
        
        answers[0][1] = "HyperText and links Markup Language";
        answers[1][1] = "Head, Title, HTML, body";
        answers[2][1] = "<b>";
        answers[3][1] = "<h1>";
        answers[4][1] = "<br>";
        answers[5][1] = "<li>";
        answers[6][1] = "<u>";
        answers[7][1] = "<input type = \\\"checkbox\\\">";
        answers[8][1] = "<option>";
        answers[9][1] = "<p>";
        
        opt1 = new JRadioButton();
        opt1.setBounds(77, 421, 521, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(77, 487, 505, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(600, 421, 367, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(600, 487, 367, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(600, 578, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        getContentPane().add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(300, 578, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        getContentPane().add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(900, 578, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        getContentPane().add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 890, 580);
        } else {
            g.drawString("Times up!!", 890, 580);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new HTMLquiz("User");
    }
}
