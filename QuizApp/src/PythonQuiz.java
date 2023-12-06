
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PythonQuiz extends JFrame implements ActionListener {
    
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
    public int lifelineCounter = 0;
    
    String name;
    
    PythonQuiz(String name) {
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
        qno.setBounds(26, 367, 50, 30);
        qno.setFont(new Font("Tahoma", Font.BOLD, 24));
        getContentPane().add(qno);
        
        question = new JLabel();
        question.setBounds(64, 367, 1327, 30);
        question.setFont(new Font("Tahoma", Font.BOLD, 20));
        getContentPane().add(question);
        
        questions[0][0] = "Who developed Python Programming Language?";
        questions[0][1] = "Wick van Rossum"; 
        questions[0][2] = "Rasmus Lerdorf";
        questions[0][3] = "Guido van Rossum";
        questions[0][4] = "Niene Stom";

        questions[1][0] = "Which type of Programming does Python support ?";
        questions[1][1] = "object-oriented programming";
        questions[1][2] = "all of the mentioned";
        questions[1][3] = "functional programming";
        questions[1][4] = "structured programming";

        questions[2][0] = "Which of the following statements is used to create an empty set in Python?";
        questions[2][1] = "()";
        questions[2][2] = "[]";
        questions[2][3] = "{}";
        questions[2][4] = "set()";

        questions[3][0] = "Which one of the following is not a keyword in Python language?";
        questions[3][1] = "pass";
        questions[3][2] = "eval";
        questions[3][3] = "assert";
        questions[3][4] = "nonlocal";

        questions[4][0] = " Which of these is the definition for packages in Python?";
        questions[4][1] = "A folder of python modules";
        questions[4][2] = "A set of main modules";
        questions[4][3] = "A number of files containing Python definitions and statements";
        questions[4][4] = "A set of programs making use of Python modules";

        questions[5][0] = "Which of the following is not a core data type in Python programming?";
        questions[5][1] = "Tuples";
        questions[5][2] = "Lists";
        questions[5][3] = "Class";
        questions[5][4] = "Dictionary";

        questions[6][0] = "Which of the following functions is a built-in function in python?";
        questions[6][1] = "print()";
        questions[6][2] = "factorial()";
        questions[6][3] = "seed()";
        questions[6][4] = "sqrt()";

        questions[7][0] = "What does pip stand for python?";
        questions[7][1] = "Pip Installs Python";
        questions[7][2] = "Pip Installs Packages";
        questions[7][3] = "Preferred Installer Program";
        questions[7][4] = "All of the mentioned";

        questions[8][0] = "Which of the following functions can help us to find the version of python that we are currently working on?";
        questions[8][1] = "sys.version(1)";
        questions[8][2] = "sys.version(0)";
        questions[8][3] = "sys.version()";
        questions[8][4] = "sys.version";

        questions[9][0] = "Python supports the creation of anonymous functions at runtime, using a construct called?";
        questions[9][1] = "lambda";
        questions[9][2] = "anonymous"; 
        questions[9][3] = "pi";
        questions[9][4] = "None of the above";
        
        answers[0][1] = "Guido van Rossum";
        answers[1][1] = "all of the mentioned";
        answers[2][1] = "set()";
        answers[3][1] = "eval";
        answers[4][1] = "A folder of python modules";
        answers[5][1] = "Class";
        answers[6][1] = "print()";
        answers[7][1] = "Preferred Installer Program";
        answers[8][1] = "sys.version";
        answers[9][1] = "lambda";
        
        opt1 = new JRadioButton();
        opt1.setBounds(77, 421, 521, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(77, 487, 521, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(600, 421, 638, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(600, 487, 644, 30);
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
        new PythonQuiz("User");
    }
}
