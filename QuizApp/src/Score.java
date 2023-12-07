import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{

	Score(String name, int score){
		setBounds(600,150,700,550);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score1.jpg"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(89,90,504,250);
		getContentPane().add(image);
		
		JLabel heading = new JLabel("Thankyou " + name + "for playing Coding Quiz Game");
		heading.setBounds(10,11,631,40);
		heading.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		getContentPane().add(heading);
		
		JLabel lblscore = new JLabel("Your score is " + score + " points");
		lblscore.setHorizontalAlignment(SwingConstants.CENTER);
		lblscore.setBounds(118,364,463,58);
		lblscore.setFont(new Font("Arial Black", Font.BOLD, 30));
		getContentPane().add(lblscore);
		
		JButton submit = new JButton("Play Again");
		submit.setFont(new Font("Arial Black", Font.BOLD, 11));
        submit.setBounds(251, 433, 150, 43);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        getContentPane().add(submit);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Score("User", 0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
		
	}

}
