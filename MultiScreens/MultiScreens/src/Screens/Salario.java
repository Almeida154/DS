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
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Salario extends JFrame {

	private JPanel contentPane;
	private JTextField tfSalario;
	private JTextField tfReceber;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salario frame = new Salario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Salario() {
		setResizable(false);
		setTitle("Sal\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteOSalario = new JLabel("Digite o sal\u00E1rio:");
		lblDigiteOSalario.setForeground(Color.WHITE);
		lblDigiteOSalario.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 16));
		lblDigiteOSalario.setBounds(10, 25, 119, 25);
		contentPane.add(lblDigiteOSalario);
		
		JLabel lblBnus = new JLabel("B\u00F4nus:");
		lblBnus.setForeground(Color.WHITE);
		lblBnus.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 16));
		lblBnus.setBounds(166, 25, 48, 25);
		contentPane.add(lblBnus);
		
		JLabel lblSalarioAReceber = new JLabel("Sal\u00E1rio a receber:");
		lblSalarioAReceber.setForeground(Color.WHITE);
		lblSalarioAReceber.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 16));
		lblSalarioAReceber.setBounds(279, 25, 131, 25);
		contentPane.add(lblSalarioAReceber);
		
		tfSalario = new JTextField();
		tfSalario.setBackground(Color.GRAY);
		tfSalario.setBounds(10, 61, 131, 32);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		tfReceber = new JTextField();
		tfReceber.setColumns(10);
		tfReceber.setBackground(Color.GRAY);
		tfReceber.setBounds(279, 61, 145, 32);
		contentPane.add(tfReceber);
		
		JSpinner spnBonus = new JSpinner();
		spnBonus.setModel(new SpinnerNumberModel(5, 0, 20, 5));
		spnBonus.setForeground(Color.GRAY);
		spnBonus.setBackground(Color.GRAY);
		spnBonus.setBounds(166, 61, 95, 32);
		contentPane.add(spnBonus);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(15, 115, 199, 163);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblResultado = new JLabel("Desconto");
		lblResultado.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblResultado.setBounds(63, 11, 70, 21);
		panel.add(lblResultado);
		
		JLabel lblInssTxt = new JLabel("INSS (7,5%):");
		lblInssTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblInssTxt.setBounds(10, 43, 83, 21);
		panel.add(lblInssTxt);
		
		JLabel lblVtTxt = new JLabel("VT (6%):");
		lblVtTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVtTxt.setBounds(10, 70, 79, 21);
		panel.add(lblVtTxt);
		
		JLabel lblVaTxt = new JLabel("VA (4,5%):");
		lblVaTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVaTxt.setBounds(10, 96, 79, 21);
		panel.add(lblVaTxt);
		
		JLabel lblTotalDeDescontoTxt = new JLabel("Total de des.:");
		lblTotalDeDescontoTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 13));
		lblTotalDeDescontoTxt.setBounds(10, 131, 109, 21);
		panel.add(lblTotalDeDescontoTxt);
		
		JLabel lblInss = new JLabel("0");
		lblInss.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInss.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblInss.setBounds(106, 43, 83, 21);
		panel.add(lblInss);
		
		JLabel lblVt = new JLabel("0");
		lblVt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVt.setBounds(106, 70, 83, 21);
		panel.add(lblVt);
		
		JLabel lblVa = new JLabel("0");
		lblVa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVa.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVa.setBounds(106, 96, 83, 21);
		panel.add(lblVa);
		
		JLabel lblTotalDeDesconto = new JLabel("0");
		lblTotalDeDesconto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalDeDesconto.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblTotalDeDesconto.setBounds(106, 131, 85, 21);
		panel.add(lblTotalDeDesconto);
		
		JLabel label_8 = new JLabel("____________________");
		label_8.setBounds(49, 115, 140, 14);
		panel.add(label_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 127));
		panel_1.setBounds(224, 115, 199, 163);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBonificao = new JLabel("Bonifica\u00E7\u00E3o");
		lblBonificao.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblBonificao.setBounds(63, 11, 79, 21);
		panel_1.add(lblBonificao);
		
		JLabel lblBonus = new JLabel("0");
		lblBonus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBonus.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblBonus.setBounds(103, 43, 86, 21);
		panel_1.add(lblBonus);
		
		JLabel lblVc = new JLabel("0");
		lblVc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVc.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVc.setBounds(103, 70, 86, 21);
		panel_1.add(lblVc);
		
		JLabel lblTotalDeBonus = new JLabel("0");
		lblTotalDeBonus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalDeBonus.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblTotalDeBonus.setBounds(103, 131, 86, 21);
		panel_1.add(lblTotalDeBonus);
		
		JLabel lblTotalDeBonusTxt = new JLabel("B\u00F4nus tot.:");
		lblTotalDeBonusTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 13));
		lblTotalDeBonusTxt.setBounds(10, 131, 94, 21);
		panel_1.add(lblTotalDeBonusTxt);
		
		JLabel lblVcTxt = new JLabel("VC (5%):");
		lblVcTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblVcTxt.setBounds(10, 70, 79, 21);
		panel_1.add(lblVcTxt);
		
		JLabel lblBonusTxt = new JLabel("B\u00F4nus:");
		lblBonusTxt.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblBonusTxt.setBounds(10, 43, 83, 21);
		panel_1.add(lblBonusTxt);
		
		JLabel label_4 = new JLabel("____________________");
		label_4.setBounds(49, 115, 140, 14);
		panel_1.add(label_4);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salario.this.dispose();
			}
		});
		btnFechar.setBounds(344, 301, 80, 23);
		onButtons(btnFechar);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfSalario.setText("");
				tfReceber.setText("");
				lblInss.setText("");
				lblVt.setText("");
				lblVa.setText("");
				lblTotalDeDesconto.setText("");
				lblBonus.setText("");
				lblVc.setText("");
				lblTotalDeBonus.setText("");
			}
		});
		btnLimpar.setBounds(254, 301, 80, 23);
		onButtons(btnLimpar);
		contentPane.add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double salario = Double.parseDouble(tfSalario.getText());
				
				// Descontos
				
				double inss = salario * 7.5 / 100;
				lblInss.setText(String.format("R$%.2f", inss));
				
				double vt = salario * 6 / 100;
				lblVt.setText(String.format("R$%.2f", vt));
				
				double va = salario * 4.5 / 100;
				lblVa.setText(String.format("R$%.2f", va));
				
				double desconto = inss + vt + va;
				lblTotalDeDesconto.setText(String.format("R$%.2f", desconto));
				
				// Bonificações
				
				int porcentagem = Integer.parseInt(spnBonus.getValue().toString());
				
				double bonus = salario * porcentagem / 100;
				lblBonus.setText(String.format("R$%.2f", bonus));
				
				double vc = salario * 5 / 100;;
				lblVc.setText(String.format("R$%.2f", vc));
				
				double totBonus = bonus + vc;
				lblTotalDeBonus.setText(String.format("R$%.2f", totBonus));
				
				double salarioReceber = salario + totBonus - desconto;
				tfReceber.setText(String.format("R$%.2f", salarioReceber));
				
			}
		});
		btnCalcular.setBounds(154, 301, 90, 23);
		onButtons(btnCalcular);
		contentPane.add(btnCalcular);
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