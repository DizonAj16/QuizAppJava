import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CplusplusQuiz extends JFrame implements ActionListener {
    
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
    
    CplusplusQuiz(String name) {
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
        question.setBounds(98, 367, 1066, 30);
        question.setFont(new Font("Tahoma", Font.BOLD, 22));
        getContentPane().add(question);
        
        questions[0][0] = "Who invented C++?";
        questions[0][1] = "Ken Thompson";
        questions[0][2] = "Bjarne Stroustrup";
        questions[0][3] = "Brian Kernighan";
        questions[0][4] = "Dennis Ritchie";

        questions[1][0] = "What is C++?";
        questions[1][1] = "C++ is an object oriented programming language";
        questions[1][2] = "C++ is a procedural programming language";
        questions[1][3] = "C++ supports both procedural and object oriented programming language";
        questions[1][4] = "C++ is a functional programming language";

        questions[2][0] = "Which of the following is the correct syntax of including a user defined header files in C++?";
        questions[2][1] = "#include “userdefined”";
        questions[2][2] = "#include [userdefined]";
        questions[2][3] = "#include <userdefined.h>";
        questions[2][4] = "#include <userdefined>";

        questions[3][0] = "Which of the following is used for comments in C++?";
        questions[3][1] = " // comment */";
        questions[3][2] = "both // comment or /* comment */";
        questions[3][3] = "// comment";
        questions[3][4] = "/* comment */";

        questions[4][0] = " Which of the following is a correct identifier in C++?";
        questions[4][1] = "VAR_1234";
        questions[4][2] = "$var_name";
        questions[4][3] = "7VARNAME";
        questions[4][4] = "7var_name";

        questions[5][0] = "Which of the following is not a type of Constructor in C++?";
        questions[5][1] = "Default constructor";
        questions[5][2] = "Parameterized constructor";
        questions[5][3] = "Friend constructor";
        questions[5][4] = "Copy constructor";

        questions[6][0] = "Which of the following approach is used by C++?";
        questions[6][1] = "Left-right";
        questions[6][2] = "Right-left";
        questions[6][3] = "Top-down";
        questions[6][4] = "Bottom-up";
 
        questions[7][0] = "Which of the following type is provided by C++ but not C?";
        questions[7][1] = "float";
        questions[7][2] = "bool";
        questions[7][3] = "int";
        questions[7][4] = "double";

        questions[8][0] = "By default, all the files in C++ are opened in _________ mode.";
        questions[8][1] = "Binary";
        questions[8][2] = "VTC";
        questions[8][3] = "ISCII";
        questions[8][4] = "Text";

        questions[9][0] = "Which of the following correctly declares an array in C++?";
        questions[9][1] = "array{10};";
        questions[9][2] = "array array[10];";
        questions[9][3] = "int array;";
        questions[9][4] = "int array[10];";
        
        answers[0][1] = "Bjarne Stroustrup";
        answers[1][1] = "C++ supports both procedural and object oriented programming language";
        answers[2][1] = "#include “userdefined”";
        answers[3][1] = "both // comment or /* comment */";
        answers[4][1] = "VAR_1234";
        answers[5][1] = "Friend constructor";
        answers[6][1] = "Bottom-up";
        answers[7][1] = "bool";
        answers[8][1] = "Text";
        answers[9][1] = "int array[10];";
        
        opt1 = new JRadioButton();
        opt1.setBounds(77, 421, 463, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 18));
        getContentPane().add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(77, 487, 463, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 18));
        getContentPane().add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(548, 421, 616, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 18));
        getContentPane().add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(548, 487, 616, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 18));
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
        new CplusplusQuiz("User");
    }
}

