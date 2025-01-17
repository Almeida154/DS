package screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import auxClasses.ButtonDone;
import auxClasses.Points;

public class Result extends JFrame {

	private JPanel contentPane;
	private int corrects = Points.getPoints();
	private int incorrects = 10 - Points.getPoints();
	private int porcentCorrects = Points.getPoints() * 100 / 10;
	private int porcentIncorrects = (10 - Points.getPoints()) * 100 / 10;

	public Result() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 310, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		// Components
		
		JLabel lblTitle = new JLabel("YOUR");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBounds(0, 11, 304, 66);
		contentPane.add(lblTitle);
		
		JLabel lblsubTitle = new JLabel("Points");
		lblsubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblsubTitle.setForeground(new Color(255, 204, 0));
		lblsubTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblsubTitle.setBounds(0, 43, 304, 66);
		contentPane.add(lblsubTitle);
		
		JLabel lblCorrects = new JLabel("Corrects:");
		lblCorrects.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrects.setForeground(Color.GRAY);
		lblCorrects.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblCorrects.setBounds(74, 133, 80, 25);
		contentPane.add(lblCorrects);
		
		JLabel lblCorrectsResult = new JLabel();
		lblCorrectsResult.setText(this.corrects + " (" + this.porcentCorrects + "%)");
		lblCorrectsResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblCorrectsResult.setForeground(Color.WHITE);
		lblCorrectsResult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblCorrectsResult.setBounds(158, 133, 80, 25);
		contentPane.add(lblCorrectsResult);
		
		JLabel lblErrors = new JLabel("Incorrects:");
		lblErrors.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrors.setForeground(Color.GRAY);
		lblErrors.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblErrors.setBounds(65, 163, 89, 25);
		contentPane.add(lblErrors);
		
		JLabel lblErrorsResult = new JLabel();
		lblErrorsResult.setText(this.incorrects + " (" + this.porcentIncorrects + "%)");
		lblErrorsResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblErrorsResult.setForeground(Color.WHITE);
		lblErrorsResult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblErrorsResult.setBounds(158, 163, 80, 25);
		contentPane.add(lblErrorsResult);
		
		JButton btnBack = new JButton("CLOSE");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Result.this.dispose();
			}
		});
		btnBack.setBounds(91, 249, 124, 33);
		ButtonDone.onButton(btnBack);
		contentPane.add(btnBack);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(About.class.getResource("/imgs/deandemon.jpg")));
		background.setBounds(0, 0, 304, 339);
		contentPane.add(background);
		
	}

}