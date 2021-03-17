package Screens;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Main extends JFrame {


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setTitle("MultiScreens");
		getContentPane().setBackground(Color.DARK_GRAY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 40, 635, 201);
		getContentPane().setLayout(null);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calcular c = new Calcular();
				c.setVisible(true);
			}
		});
		
		btnCalcular.setBackground(Color.GRAY);
		btnCalcular.setIcon(new ImageIcon(Main.class.getResource("/Imgs/calculadora.png")));
		btnCalcular.setBounds(21, 26, 98, 106);
		onButtons(btnCalcular);
		getContentPane().add(btnCalcular);
		
		JButton btnSalario = new JButton("");
		btnSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salario s = new Salario();
				s.setVisible(true);
			}
		});
		
		btnSalario.setBackground(Color.GRAY);
		btnSalario.setIcon(new ImageIcon(Main.class.getResource("/Imgs/salario.png")));
		btnSalario.setBounds(139, 26, 98, 106);
		onButtons(btnSalario);
		getContentPane().add(btnSalario);
		
		JButton btnRodizio = new JButton("");
		btnRodizio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rodizio r = new Rodizio();
				r.setVisible(true);
			}
		});
		
		btnRodizio.setIcon(new ImageIcon(Main.class.getResource("/Imgs/rodizio.png")));
		btnRodizio.setBackground(Color.GRAY);
		btnRodizio.setBounds(259, 26, 98, 106);
		onButtons(btnRodizio);
		getContentPane().add(btnRodizio);
		
		JButton btnComprar = new JButton("");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Compras c = new Compras();
				c.setVisible(true);
			}
		});
		btnComprar.setIcon(new ImageIcon(Main.class.getResource("/Imgs/comprar.png")));
		btnComprar.setBackground(Color.GRAY);
		btnComprar.setBounds(381, 26, 98, 106);
		onButtons(btnComprar);
		getContentPane().add(btnComprar);
		
		JButton btnRestaurante = new JButton("");
		btnRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Restaurante r = new Restaurante();
				r.setVisible(true);
			}
		});
		btnRestaurante.setIcon(new ImageIcon(Main.class.getResource("/Imgs/restaurante.png")));
		btnRestaurante.setBackground(Color.GRAY);
		btnRestaurante.setBounds(504, 26, 98, 106);
		onButtons(btnRestaurante);
		getContentPane().add(btnRestaurante);
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