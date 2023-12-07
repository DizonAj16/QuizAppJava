import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Categories extends JFrame implements ActionListener {
    JButton javaq, htmlq, pythonq, cplusplusq, back;
    String name;

    Categories(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        JLabel heading = new JLabel("Categories");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBounds(157, 11, 216, 30);
        heading.setFont(new Font("Arial Black", Font.BOLD, 24));
        heading.setForeground(new Color(30, 144, 254));
        getContentPane().add(heading);

        javaq = new JButton("Java Quiz");
        javaq.setFont(new Font("Arial Black", Font.BOLD, 11));
        javaq.setBounds(76, 100, 149, 48);
        javaq.setBackground(new Color(255, 0, 0));
        javaq.setForeground(Color.white);
        javaq.addActionListener(this);
        getContentPane().add(javaq);

        htmlq = new JButton("HTML Quiz");
        htmlq.setFont(new Font("Arial Black", Font.BOLD, 11));
        htmlq.setBounds(288, 100, 149, 48);
        htmlq.setBackground(new Color(30, 144, 254));
        htmlq.setForeground(Color.white);
        htmlq.addActionListener(this);
        getContentPane().add(htmlq);

        back = new JButton("Back");
        back.setFont(new Font("Arial Black", Font.BOLD, 11));
        back.setBounds(337, 327, 100, 30);
        back.setBackground(new Color(192, 192, 192));
        back.setForeground(Color.white);  
        back.addActionListener(this);
        getContentPane().add(back);
        
        pythonq = new JButton("Python Quiz");
        pythonq.setForeground(Color.WHITE);
        pythonq.setFont(new Font("Arial Black", Font.BOLD, 11));
        pythonq.setBackground(new Color(0, 255, 0));
        pythonq.setBounds(76, 213, 149, 48);
        pythonq.addActionListener(this);
        getContentPane().add(pythonq);
        
        
        
        cplusplusq = new JButton("C++ Quiz");
        cplusplusq.setForeground(Color.WHITE);
        cplusplusq.setFont(new Font("Arial Black", Font.BOLD, 11));
        cplusplusq.setBackground(new Color(255, 0, 128));
        cplusplusq.setBounds(288, 213, 149, 48);
        cplusplusq.addActionListener(this);
        getContentPane().add(cplusplusq);
        
        setSize(540, 469);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        String name = "user";
        new Categories(name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == javaq) {
            setVisible(false);
            new JavaQuiz(name);
        } else if (e.getSource() == htmlq) {
            setVisible(false);
            new HTMLquiz(name);
        }
        else if (e.getSource() == pythonq) {
            setVisible(false);
            new PythonQuiz(name);
        } 
        else if (e.getSource() == cplusplusq) {
            setVisible(false);
            new CplusplusQuiz(name);
        } 
        else {
            setVisible(false);
            new Login();
        }
    }
}
