package screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import auxClasses.ButtonDone;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HowToPlay extends JFrame {

	private JPanel contentPane;

	public HowToPlay() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 310, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Components
		
		JLabel lblTitle = new JLabel("HOW TO PLAY");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBounds(0, 11, 304, 66);
		contentPane.add(lblTitle);
		
		JLabel lblsubTitle = new JLabel("Our game");
		lblsubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblsubTitle.setForeground(new Color(255, 204, 0));
		lblsubTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblsubTitle.setBounds(0, 43, 304, 66);
		contentPane.add(lblsubTitle);
		
		JLabel lblHtp01 = new JLabel("<html><center>It's really simple, you just need <br>answer the right name<br>"
				+ "of some series.</center></html>");
		lblHtp01.setHorizontalAlignment(SwingConstants.CENTER);
		lblHtp01.setForeground(Color.WHITE);
		lblHtp01.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHtp01.setBounds(0, 103, 304, 75);
		contentPane.add(lblHtp01);
		
		JLabel lblHtp02 = new JLabel("<html><center>(Dev. obs.) You can put other<br>questions. You just need adding a<br>"
				+ "new items to the arrays at the<br> 'Questions.java' code.</center></html>");
		lblHtp02.setHorizontalAlignment(SwingConstants.CENTER);
		lblHtp02.setForeground(Color.GRAY);
		lblHtp02.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHtp02.setBounds(0, 176, 304, 91);
		contentPane.add(lblHtp02);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HowToPlay.this.dispose();
			}
		});
		btnBack.setBounds(89, 278, 124, 33);
		ButtonDone.onButton(btnBack);
		contentPane.add(btnBack);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(HowToPlay.class.getResource("/imgs/shelby.jpg")));
		background.setBounds(0, 0, 304, 339);
		contentPane.add(background);
				
	}

}