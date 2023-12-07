import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon1.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 400, 360);
        getContentPane().add(image);

        JLabel heading = new JLabel("Coding Quiz Game");
        heading.setBounds(400, 60, 365, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        getContentPane().add(heading);

        JLabel name = new JLabel("Enter your name:");
        name.setBounds(400, 160, 300, 20);
        name.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        name.setForeground(new Color(0, 0, 64));
        getContentPane().add(name);

        tfname = new JTextField();
        tfname.setBounds(400, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        getContentPane().add(tfname);

        rules = new JButton("Start");
        rules.setFont(new Font("Tahoma", Font.BOLD, 11));
        rules.setBounds(410, 270, 120, 25);
        rules.setBackground(new Color(0, 0, 255));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        getContentPane().add(rules);

        back = new JButton("Back");
        back.setFont(new Font("Tahoma", Font.BOLD, 11));
        back.setBounds(570, 270, 120, 25);
        back.setBackground(new Color(0, 172, 255));
        back.setForeground(Color.white);
        back.addActionListener(this);
        getContentPane().add(back);

        setSize(821, 400);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }
}

