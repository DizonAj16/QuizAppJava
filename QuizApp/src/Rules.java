import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	
	String name;
	JButton start, back;
	
	Rules(String name){
		this.name = name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel heading = new JLabel("Welcome " + name + " to Java Quiz Game");
		heading.setBounds(135,20,700,30);
		heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		
		JLabel rules = new JLabel();
		rules.setBounds(20,90,700,350);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rules.setText(
				"<html>" +
				"1. Players have a set time to answer each question." + "<br><br>" +
				"2. Earn points for correct answers." + "<br><br>" +
				"3. Players have limited lifelines (e.g., skip, hint)." + "<br><br>" +
				"4. Questions presented with multiple-choice answers." + "<br><br>" +
				"5. Progress through levels for more points." + "<br><br>" +
				"6. Penalties for skipping or providing incorrect answers." + "<br><br>" +
				"<html>"
				
				
				);
		add(rules);
		
		
		back = new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400,500,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.white);
		start.addActionListener(this);
		add(start);
		
		
		
		setSize(540,650);
		setLocation(450, 50);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Rules("User");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start) {
			setVisible(false);
			new Quiz(name);
		}
		else {
			setVisible(false);
			new Login();
		}
		
	}
}
