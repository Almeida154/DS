package Screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calcular extends JFrame {

	private JPanel contentPane;
	private JTextField tfValorA;
	private JTextField tfValorB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular frame = new Calcular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calcular() {
		setTitle("Calcular");
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 201);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblPrimeiroValor = new JLabel("Primeiro valor:");
		lblPrimeiroValor.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 12));
		lblPrimeiroValor.setForeground(Color.WHITE);
		lblPrimeiroValor.setBackground(Color.WHITE);
		lblPrimeiroValor.setBounds(10, 31, 83, 14);
		contentPane.add(lblPrimeiroValor);
		
		JLabel lblSegundoValor = new JLabel("Segundo valor:");
		lblSegundoValor.setForeground(Color.WHITE);
		lblSegundoValor.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 12));
		lblSegundoValor.setBackground(Color.WHITE);
		lblSegundoValor.setBounds(10, 84, 83, 20);
		contentPane.add(lblSegundoValor);
		
		tfValorA = new JTextField();
		tfValorA.setBackground(Color.GRAY);
		tfValorA.setBounds(10, 50, 96, 25);
		contentPane.add(tfValorA);
		tfValorA.setColumns(10);
		
		tfValorB = new JTextField();
		tfValorB.setBackground(Color.GRAY);
		tfValorB.setColumns(10);
		tfValorB.setBounds(12, 105, 96, 25);
		contentPane.add(tfValorB);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(327, 33, 107, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(41, 34, 29, 30);
		panel.add(lblResultado);
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int v1, v2;
					v1 = Integer.parseInt(tfValorA.getText());
					v2 = Integer.parseInt(tfValorB.getText());
					lblResultado.setText(Integer.toString(v1 + v2));
				}catch(Exception e) {
					
				}
			}
		});
		
		btnAdicao.setBounds(127, 33, 56, 48);
		onButtons(btnAdicao);
		contentPane.add(btnAdicao);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int v1, v2;
					v1 = Integer.parseInt(tfValorA.getText());
					v2 = Integer.parseInt(tfValorB.getText());
					lblResultado.setText(Integer.toString(v1 - v2));
				}catch(Exception e) {
					
				}
			}
		});
		btnSub.setBounds(127, 86, 56, 48);
		onButtons(btnSub);
		contentPane.add(btnSub);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double v1, v2, res;
					v1 = Double.parseDouble(tfValorA.getText());
					v2 = Double.parseDouble(tfValorB.getText());
					res = v1 / v2;
					lblResultado.setText(String.format("%.2f", res));
				}
				catch(Exception e) {
					
				}
			}
		});
		btnDiv.setBounds(188, 33, 56, 48);
		onButtons(btnDiv);
		contentPane.add(btnDiv);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int v1, v2;
					v1 = Integer.parseInt(tfValorA.getText());
					v2 = Integer.parseInt(tfValorB.getText());
					lblResultado.setText(Integer.toString(v1 * v2));
				}catch(Exception e) {
					
				}
			}
		});
		btnMult.setBounds(188, 86, 56, 48);
		onButtons(btnMult);
		contentPane.add(btnMult);
		
		JButton btnClean = new JButton("C");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfValorA.setText("");
				tfValorB.setText("");
				lblResultado.setText("");
			}
		});
		btnClean.setBounds(250, 33, 56, 48);
		onButtons(btnClean);
		contentPane.add(btnClean);
		JButton btnFechar = new JButton("X");
		btnFechar.setBounds(250, 86, 56, 48);
		onButtons(btnFechar);
		contentPane.add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calcular.this.dispose();
			}
		});
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