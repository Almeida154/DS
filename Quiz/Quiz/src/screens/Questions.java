package screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import auxClasses.ButtonDone;
import auxClasses.Points;

import javax.swing.JRadioButton;

public class Questions extends JFrame {
		
	// Arrays
		
	ImageIcon[] bgs = new ImageIcon[]{
		new ImageIcon(Questions.class.getResource("/imgs/bgtheoffice.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgdemolidor.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bghimym.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgpeaky.jpeg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgrick.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgstrangerthings.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgsupernatural.jpeg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgtheboys.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgtwd.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/bgvikings.png"))
	};
	
	ImageIcon[] picutures = new ImageIcon[]{
		new ImageIcon(Questions.class.getResource("/imgs/the office.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/demolidor.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/himym.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/peaky blinders.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/rick and morty.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/stranger things.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/supernatural.jpeg")),
		new ImageIcon(Questions.class.getResource("/imgs/the boys.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/twd.jpg")),
		new ImageIcon(Questions.class.getResource("/imgs/vikings.png"))
	};
	
	
	String[][] opcs = {
		{"Lucifer", "The Office", "Bojack Horseman", "The 100"},
		{"Dark", "The Witcher", "Daredevil", "Brooklyn99"},
		{"Riverdale", "The Punisher", "Sex Education", "Himym"},
		{"Arrow", "Narcos", "Breaking Bad", "Peaky Blinders"},
		{"Rick and Morty", "Better Call Saul", "Big Mouth", "Chapolin"},
		{"The Flash", "Stranger Things", "Sherlock", "Brooklyn99"},
		{"Dark", "Supernatural", "Black Mirror", "13 Reasons Why"},	
		{"Mind Hunter", "oZark", "The Boys", "Iron Fist"},
		{"Lost in Space", "The Walking Dead", "Community", "Vis a Vis"},
		{"One Punch Man", "Modern Family", "Suits", "Vikings"},
	};
	
	String[] rightAnswers = new String[]{"The Office", "Daredevil", "Himym", "Peaky Blinders", 
			"Rick and Morty", "Stranger Things", "Supernatural", "The Boys", "The Walking Dead", "Vikings"};
	
	// Properties

	private JPanel contentPane;
	private JLabel lblBackground, lblPicture;
	private int count = 0;
	
	// Constructor

	public Questions() {
		Points.restorePoints(); // Reseting the points at static class 'Points.java'
		setTitle("Question 1/10");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 310, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		// Components
		
		JLabel lblWhatIsThat = new JLabel("What series is that?");
		lblWhatIsThat.setForeground(Color.WHITE);
		lblWhatIsThat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblWhatIsThat.setBounds(30, 172, 148, 23);
		contentPane.add(lblWhatIsThat);
				
		JRadioButton rbOp1 = new JRadioButton();
		rbOp1.setText(this.opcs[count][0]);
		rbOp1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		rbOp1.setOpaque(false);
		rbOp1.setForeground(Color.WHITE);
		rbOp1.setBackground(new Color(0,0,0,0));
		rbOp1.setBounds(24, 208, 128, 23);
		contentPane.add(rbOp1);
		
		JRadioButton rbOp2 = new JRadioButton();
		rbOp2.setText(this.opcs[count][1]);
		rbOp2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		rbOp2.setOpaque(false);
		rbOp2.setForeground(Color.WHITE);
		rbOp2.setBackground(new Color(0,0,0,0));
		rbOp2.setBounds(24, 234, 128, 23);
		contentPane.add(rbOp2);
		
		JRadioButton rbOp3 = new JRadioButton();
		rbOp3.setText(this.opcs[count][2]);
		rbOp3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		rbOp3.setOpaque(false);
		rbOp3.setForeground(Color.WHITE);
		rbOp3.setBackground(new Color(0,0,0,0));
		rbOp3.setBounds(160, 208, 128, 23);
		contentPane.add(rbOp3);
		
		JRadioButton rbOp4 = new JRadioButton();
		rbOp4.setText(this.opcs[count][3]);
		rbOp4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		rbOp4.setOpaque(false);
		rbOp4.setForeground(Color.WHITE);
		rbOp4.setBackground(new Color(0,0,0,0));
		rbOp4.setBounds(160, 234, 128, 23);
		contentPane.add(rbOp4);
		
		ButtonGroup bgOpcs = new ButtonGroup();
		bgOpcs.add(rbOp1); bgOpcs.add(rbOp2); bgOpcs.add(rbOp3); bgOpcs.add(rbOp4);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnNext.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(!bgOpcs.isSelected(null)) {
					JRadioButton[] radioOpcs = new JRadioButton[]{rbOp1, rbOp2, rbOp3, rbOp4}; // Putting all radios in an array
					String answer = null;
					
					for(int i = 0; i < 4; i++) {
						answer = radioOpcs[i].isSelected() ? radioOpcs[i].getText() : null; // Verifying which option is selected
						if(answer != null) break;
					}
					
					if(answer.equals(rightAnswers[count])) Points.sumPoint(); // Verifying if the option is right
										
					count++;

					try{
						lblBackground.setIcon(bgs[count]); // Changing the background
						lblPicture.setIcon(picutures[count]); // Changing the picture
						for(int i = 0; i < 4; i++) radioOpcs[i].setText(opcs[count][i]); // Changing the options
					}catch (Exception e) { /* Nothing */ }
					
					if(count == 9) { // 9 = Until the last but one question
						btnNext.setText("RESULTS");
						btnNext.setBounds(160, 274, 104, 33);
					}
					
					if(count == 10) { // 10 = Quantity of questions
						Questions.this.dispose();
						Result result = new Result();
						result.setVisible(true);
					}
					
					setTitle("Question " + (count + 1) + "/10");
					bgOpcs.clearSelection();
					
				}else JOptionPane.showMessageDialog(null, "Select an option, please!");
			}
		});
		btnNext.setBounds(196, 274, 75, 33);
		ButtonDone.onButton(btnNext);
		contentPane.add(btnNext);
		
		lblPicture = new JLabel("");
		lblPicture.setIcon(this.picutures[count]);
		lblPicture.setBounds(30, 21, 233, 140);
		contentPane.add(lblPicture);
				
		lblBackground = new JLabel("");
		lblBackground.setIcon(this.bgs[count]);
		lblBackground.setBounds(0, 0, 294, 329);
		contentPane.add(lblBackground);

	}
	
}