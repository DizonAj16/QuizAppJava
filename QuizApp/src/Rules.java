import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        JLabel heading = new JLabel("Welcome "  + name + " to Coding Quiz Game");
        heading.setBounds(10, 11, 528, 30);
        heading.setFont(new Font("Dialog", Font.BOLD, 22));
        heading.setForeground(new Color(30, 144, 254));
        getContentPane().add(heading);

        JLabel rules = new JLabel();
        rules.setHorizontalAlignment(SwingConstants.LEFT);
        rules.setBounds(23, 124, 515, 304);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>1. Players have a set time to answer each question.<br><br>2. Earn points for correct answers.<br><br>3. Players have limited lifelines (e.g., skip, hint).<br><br>4. Questions presented with multiple-choice answers.<br><br>5. Progress through levels for more points.<br><br>6. Penalties for skipping or providing incorrect answers.<br><br>7. There are 4 categories  to choose (JAVA, HTML, PYTHON, C++).<html>"
        );
        getContentPane().add(rules);

        back = new JButton("Back");
        back.setBounds(76, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        getContentPane().add(back);

        start = new JButton("Start");
        start.setBounds(346, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        getContentPane().add(start);
        
        JLabel lblNewLabel = new JLabel("Rules");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        lblNewLabel.setBounds(183, 70, 167, 30);
        getContentPane().add(lblNewLabel);

        setSize(540, 650);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Categories(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
}

