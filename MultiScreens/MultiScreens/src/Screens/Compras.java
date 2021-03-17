package Screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Compras extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras frame = new Compras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Compras() {
		setResizable(false);
		setTitle("Compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 446);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 14));
		lblValorTotal.setForeground(Color.WHITE);
		lblValorTotal.setBounds(158, 12, 89, 22);
		contentPane.add(lblValorTotal);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBounds(24, 131, 350, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox ckTempero = new JCheckBox("Tempero (R$1,50)");
		ckTempero.setForeground(Color.LIGHT_GRAY);
		ckTempero.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckTempero.setBackground(Color.GRAY);
		ckTempero.setBounds(200, 173, 123, 23);
		panel.add(ckTempero);
		
		JCheckBox ckMaionese = new JCheckBox("Maionese (R$6,30)");
		ckMaionese.setForeground(Color.LIGHT_GRAY);
		ckMaionese.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckMaionese.setBackground(Color.GRAY);
		ckMaionese.setBounds(200, 121, 130, 23);
		panel.add(ckMaionese);
		
		JCheckBox ckBiscoito = new JCheckBox("Biscoito (R$3,60)");
		ckBiscoito.setForeground(Color.LIGHT_GRAY);
		ckBiscoito.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckBiscoito.setBackground(Color.GRAY);
		ckBiscoito.setBounds(200, 147, 123, 23);
		panel.add(ckBiscoito);
		
		JCheckBox ckBatata = new JCheckBox("Batata (R$5,60)");
		ckBatata.setForeground(Color.LIGHT_GRAY);
		ckBatata.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckBatata.setBackground(Color.GRAY);
		ckBatata.setBounds(200, 95, 116, 23);
		panel.add(ckBatata);
		
		JCheckBox ckGelatina = new JCheckBox("Gelatina (R$0,90)");
		ckGelatina.setForeground(Color.LIGHT_GRAY);
		ckGelatina.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckGelatina.setBackground(Color.GRAY);
		ckGelatina.setBounds(200, 69, 126, 23);
		panel.add(ckGelatina);
		
		JCheckBox ckSal = new JCheckBox("Sal (R$1,90)");
		ckSal.setForeground(Color.LIGHT_GRAY);
		ckSal.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckSal.setBackground(Color.GRAY);
		ckSal.setBounds(200, 43, 116, 23);
		panel.add(ckSal);
		
		JCheckBox ckQueijo = new JCheckBox("Queijo (R$9,50)");
		ckQueijo.setForeground(Color.LIGHT_GRAY);
		ckQueijo.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckQueijo.setBackground(Color.GRAY);
		ckQueijo.setBounds(200, 17, 116, 23);
		panel.add(ckQueijo);
		
		JCheckBox ckArroz = new JCheckBox("Arroz (R$18,50)");
		ckArroz.setForeground(Color.LIGHT_GRAY);
		ckArroz.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckArroz.setBackground(Color.GRAY);
		ckArroz.setBounds(23, 17, 116, 23);
		panel.add(ckArroz);
		
		JCheckBox ckFeijao = new JCheckBox("Feij\u00E3o (R$8,90)");
		ckFeijao.setForeground(Color.LIGHT_GRAY);
		ckFeijao.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckFeijao.setBackground(Color.GRAY);
		ckFeijao.setBounds(23, 43, 116, 23);
		panel.add(ckFeijao);
		
		JCheckBox ckAcucar = new JCheckBox("A\u00E7ucar (R$2,40)");
		ckAcucar.setForeground(Color.LIGHT_GRAY);
		ckAcucar.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckAcucar.setBackground(Color.GRAY);
		ckAcucar.setBounds(23, 69, 116, 23);
		panel.add(ckAcucar);
		
		JCheckBox ckCafe = new JCheckBox("Caf\u00E9 (R$9,80)");
		ckCafe.setForeground(Color.LIGHT_GRAY);
		ckCafe.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckCafe.setBackground(Color.GRAY);
		ckCafe.setBounds(23, 95, 116, 23);
		panel.add(ckCafe);
		
		JCheckBox ckCereal = new JCheckBox("Cereal (R$13,90)");
		ckCereal.setForeground(Color.LIGHT_GRAY);
		ckCereal.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckCereal.setBackground(Color.GRAY);
		ckCereal.setBounds(23, 121, 116, 23);
		panel.add(ckCereal);
		
		JCheckBox ckAzeite = new JCheckBox("Aceite (R$12,80)");
		ckAzeite.setForeground(Color.LIGHT_GRAY);
		ckAzeite.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckAzeite.setBackground(Color.GRAY);
		ckAzeite.setBounds(23, 147, 116, 23);
		panel.add(ckAzeite);
		
		JCheckBox ckFarinha = new JCheckBox("Farinha de Trigo (R$3,60)");
		ckFarinha.setForeground(Color.LIGHT_GRAY);
		ckFarinha.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 12));
		ckFarinha.setBackground(Color.GRAY);
		ckFarinha.setBounds(23, 173, 165, 23);
		panel.add(ckFarinha);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(24, 44, 350, 76);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTot = new JLabel("R$0.00");
		lblTot.setHorizontalAlignment(SwingConstants.CENTER);
		lblTot.setForeground(Color.LIGHT_GRAY);
		lblTot.setFont(new Font("Microsoft Tai Le", Font.BOLD, 25));
		lblTot.setBackground(Color.GRAY);
		lblTot.setBounds(43, 0, 261, 76);
		panel_1.add(lblTot);
		
		JButton btnFechar = new JButton("Fechar");
		onButtons(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Compras.this.dispose();
				
			}
		});
		btnFechar.setBounds(24, 364, 89, 23);
		contentPane.add(btnFechar);
		
		
		JButton btnCalcular = new JButton("Calcular");
		onButtons(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Properties
				
				double total = 0;
				double valores[] = {18.5, 8.9, 2.4, 9.8, 13.9, 12.8, 3.6, 9.5, 1.9, 0.9, 5.6, 6.3, 3.6, 1.5};
				JCheckBox cks[] = {ckArroz, ckFeijao, ckAcucar, ckCafe, ckCereal, ckAzeite, ckFarinha,
						ckQueijo, ckSal, ckGelatina, ckBatata, ckMaionese, ckBiscoito, ckTempero};
				
				// Calculating the final price
				
				for(int i = 0; i < cks.length; i++) {
					total = (cks[i].isSelected() ? total += valores[i] : total);
				}
				
				lblTot.setText(String.format("R$%.2f", total));
				
			}
		});
		btnCalcular.setBounds(285, 364, 89, 23);
		contentPane.add(btnCalcular);
		
		
		JButton btnLimpar = new JButton("Limpar");
		onButtons(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Properties
				
				JCheckBox cks[] = {ckArroz, ckFeijao, ckAcucar, ckCafe, ckCereal, ckAzeite, ckFarinha,
						ckQueijo, ckSal, ckGelatina, ckBatata, ckMaionese, ckBiscoito, ckTempero};
				
				// Cleaning
				
				for(int i = 0; i < cks.length; i++) {
					cks[i].setSelected(false);
				}
				
				lblTot.setText("R$0.00");
				
			}
		});
		btnLimpar.setBounds(155, 364, 89, 23);
		contentPane.add(btnLimpar);		
		
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
