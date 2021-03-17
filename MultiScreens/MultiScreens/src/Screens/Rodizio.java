package Screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Rodizio extends JFrame {

	private JPanel contentPane;
	private JTextField tfLetters;
	private JTextField tfNumbers;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rodizio frame = new Rodizio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Rodizio() {
		setTitle("Rod\u00EDzio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 264);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteAPlaca = new JLabel("Digite a placa do carro");
		lblDigiteAPlaca.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 18));
		lblDigiteAPlaca.setForeground(Color.WHITE);
		lblDigiteAPlaca.setBounds(45, 22, 186, 30);
		contentPane.add(lblDigiteAPlaca);
		
		tfLetters = new JTextField();
		tfLetters.setHorizontalAlignment(SwingConstants.CENTER);
		tfLetters.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		tfLetters.setBackground(Color.GRAY);
		tfLetters.setBounds(35, 63, 92, 44);
		contentPane.add(tfLetters);
		tfLetters.setColumns(10);
				
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rodizio.this.dispose();
			}
		});
		btnFechar.setBounds(146, 132, 92, 23);
		onButtons(btnFechar);
		contentPane.add(btnFechar);
		
		tfNumbers = new JTextField();
		tfNumbers.setHorizontalAlignment(SwingConstants.CENTER);
		tfNumbers.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20));
		tfNumbers.setColumns(10);
		tfNumbers.setBackground(Color.GRAY);
		tfNumbers.setBounds(146, 63, 92, 44);
		contentPane.add(tfNumbers);
		
		JLabel lblMsg = new JLabel("");
		lblMsg.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		lblMsg.setForeground(Color.WHITE);
		lblMsg.setBounds(35, 180, 203, 23);
		contentPane.add(lblMsg);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					String day = null;
					String carPlate = tfNumbers.getText();
					int lastNumber = Integer.parseInt(carPlate.substring(3, 4));
					
					if(lastNumber == 1 || lastNumber == 2) day = "Segundas-Feiras";
					else if(lastNumber == 3 || lastNumber == 4) day = "Terças-Feiras";
					else if(lastNumber == 5 || lastNumber == 6) day = "Quartas-Feiras";
					else if(lastNumber == 7 || lastNumber == 8) day = "Quintas-Feiras";
					else day = "Sexta-Feira";
					
					lblMsg.setText("Proibido as: " + day);
					
				}catch(Exception e) {
					
					lblMsg.setText("Algo deu errado :(");
					
				}
				
			}
		});
		btnVerificar.setBounds(35, 132, 92, 23);
		onButtons(btnVerificar);
		contentPane.add(btnVerificar);
	}
	
	private void onButtons(JButton btn) {
		btn.setBackground(Color.gray);
		btn.setForeground(Color.white);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btn.setBackground(new Color(44, 44, 44));
	        }

	        public void mouseExited(MouseEvent e) {
	    		btn.setBackground(Color.gray);
	        }
		});
	}
}