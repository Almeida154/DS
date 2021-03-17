package Screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;

public class Restaurante extends JFrame {

	private JPanel contentPane;
	private JTextField tfConsumoTotal;
	private JTextField tfCouver;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurante frame = new Restaurante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Restaurante() {
		setTitle("Restaurante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 463);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Restaurante.class.getResource("/Imgs/balaio.jpg")));
		label.setBounds(10, 11, 320, 120);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(9, 273, 321, 103);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTaxaDeServicos = new JLabel("Taxa de servi\u00E7o (10%):");
		lblTaxaDeServicos.setForeground(new Color(220, 220, 220));
		lblTaxaDeServicos.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblTaxaDeServicos.setBounds(10, 11, 137, 20);
		panel.add(lblTaxaDeServicos);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setForeground(new Color(220, 220, 220));
		lblValorTotal.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblValorTotal.setBounds(9, 40, 77, 20);
		panel.add(lblValorTotal);
		
		JLabel lblValorPorPessoa = new JLabel("Valor por pessoa:");
		lblValorPorPessoa.setForeground(new Color(220, 220, 220));
		lblValorPorPessoa.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblValorPorPessoa.setBounds(10, 67, 115, 20);
		panel.add(lblValorPorPessoa);
		
		JLabel lblTaxa = new JLabel("R$0.00");
		lblTaxa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTaxa.setForeground(new Color(244, 164, 96));
		lblTaxa.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		lblTaxa.setBounds(175, 11, 124, 20);
		panel.add(lblTaxa);
		
		JLabel lblValorTot = new JLabel("R$0.00");
		lblValorTot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorTot.setForeground(new Color(244, 164, 96));
		lblValorTot.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		lblValorTot.setBounds(175, 40, 124, 20);
		panel.add(lblValorTot);
		
		JLabel lblPorPessoa = new JLabel("R$0.00");
		lblPorPessoa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorPessoa.setForeground(new Color(244, 164, 96));
		lblPorPessoa.setFont(new Font("Microsoft YaHei", Font.BOLD, 14));
		lblPorPessoa.setBounds(175, 67, 124, 20);
		panel.add(lblPorPessoa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 142, 320, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblConsumoTotal = new JLabel("Consumo total:");
		lblConsumoTotal.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblConsumoTotal.setBounds(10, 11, 97, 14);
		panel_1.add(lblConsumoTotal);
		
		tfConsumoTotal = new JTextField();
		tfConsumoTotal.setBounds(170, 10, 140, 20);
		panel_1.add(tfConsumoTotal);
		tfConsumoTotal.setColumns(10);
		
		JLabel lblCouverArcstico = new JLabel("Couver art\u00EDstico:");
		lblCouverArcstico.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblCouverArcstico.setBounds(10, 37, 103, 14);
		panel_1.add(lblCouverArcstico);
		
		tfCouver = new JTextField();
		tfCouver.setForeground(Color.GRAY);
		tfCouver.setHorizontalAlignment(SwingConstants.RIGHT);
		tfCouver.setText("R$5.00");
		tfCouver.setEditable(false);
		tfCouver.setColumns(10);
		tfCouver.setBounds(170, 36, 140, 20);
		panel_1.add(tfCouver);
		
		JLabel lblDividir = new JLabel("Dividir conta por?");
		lblDividir.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblDividir.setBounds(10, 61, 112, 20);
		panel_1.add(lblDividir);
		
		JSpinner spnDividirConta = new JSpinner();
		spnDividirConta.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spnDividirConta.setBounds(170, 61, 140, 20);
		panel_1.add(spnDividirConta);
		
		JLabel lblPagarMesa = new JLabel("Pagar 10% da mesa?");
		lblPagarMesa.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 14));
		lblPagarMesa.setBounds(10, 88, 127, 20);
		panel_1.add(lblPagarMesa);
		
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setSelected(true);
		rbSim.setBackground(Color.LIGHT_GRAY);
		rbSim.setBounds(180, 89, 52, 23);
		panel_1.add(rbSim);
		
		JRadioButton rbNao = new JRadioButton("N\u00E3o");
		rbNao.setBackground(Color.LIGHT_GRAY);
		rbNao.setBounds(245, 88, 52, 23);
		panel_1.add(rbNao);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbNao);
		group.add(rbSim);
		
		JButton btnFechar = new JButton("Fechar");
		onButtons(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Restaurante.this.dispose();
			}
		});
		btnFechar.setBounds(10, 387, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					double valorTot = 0;
					double conta = Double.parseDouble(tfConsumoTotal.getText());
					double taxaMesa = conta / 10;
					conta += 5;
					int qntdPessoas = Integer.parseInt(spnDividirConta.getValue().toString());
					
					valorTot = conta;
					valorTot = rbSim.isSelected() ? valorTot += taxaMesa : valorTot;

					lblPorPessoa.setText(String.format("R$%.2f", valorTot / qntdPessoas));
					lblTaxa.setText(String.format("R$%.2f", taxaMesa));
					lblValorTot.setText(String.format("R$%.2f", valorTot));
				}catch(Exception e) {
					
				}
				
				
			}
		});
		onButtons(btnCalcular);
		btnCalcular.setBounds(242, 387, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfConsumoTotal.setText("");
				spnDividirConta.setValue(0);
				lblTaxa.setText("R$0.00");
				lblPorPessoa.setText("R$0.00");
				lblValorTot.setText("R$0.00");
			}
		});
		onButtons(btnLimpar);
		btnLimpar.setBounds(127, 387, 89, 23);
		contentPane.add(btnLimpar);
		setLocationRelativeTo(null);
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