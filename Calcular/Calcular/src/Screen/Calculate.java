package Screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate frame = new Calculate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculate() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformeUmValor = new JLabel("Informe um valor");
		lblInformeUmValor.setBackground(Color.WHITE);
		lblInformeUmValor.setFont(new Font("ITC Avant Garde Gothic LT", Font.PLAIN, 15));
		lblInformeUmValor.setForeground(new Color(192, 192, 192));
		lblInformeUmValor.setBounds(27, 27, 138, 14);
		contentPane.add(lblInformeUmValor);
		
		JSpinner spnValue = new JSpinner();
		spnValue.setBackground(Color.WHITE);
		spnValue.setForeground(Color.WHITE);
		spnValue.setModel(new SpinnerNumberModel(0, -50, 100, 1));
		spnValue.setBounds(27, 52, 138, 20);
		contentPane.add(spnValue);
				
		JPanel panelInfos = new JPanel();
		panelInfos.setBackground(new Color(51, 51, 51));
		panelInfos.setBounds(200, 27, 211, 199);
		contentPane.add(panelInfos);
		panelInfos.setLayout(null);
		
		JLabel lblRestoDeDiviso = new JLabel("Resto de divis\u00E3o (2):");
		lblRestoDeDiviso.setFont(new Font("Arial", Font.BOLD, 12));
		lblRestoDeDiviso.setForeground(Color.LIGHT_GRAY);
		lblRestoDeDiviso.setBounds(10, 61, 117, 14);
		panelInfos.add(lblRestoDeDiviso);
		
		JLabel lblElevadoAoCubo = new JLabel("Elevado ao cubo:");
		lblElevadoAoCubo.setForeground(Color.LIGHT_GRAY);
		lblElevadoAoCubo.setFont(new Font("Arial", Font.BOLD, 12));
		lblElevadoAoCubo.setBounds(10, 86, 117, 14);
		panelInfos.add(lblElevadoAoCubo);
		
		JLabel lblRazQuadrada = new JLabel("Ra\u00EDz quadrada:");
		lblRazQuadrada.setForeground(Color.LIGHT_GRAY);
		lblRazQuadrada.setFont(new Font("Arial", Font.BOLD, 12));
		lblRazQuadrada.setBounds(10, 111, 117, 14);
		panelInfos.add(lblRazQuadrada);
		
		JLabel lblRazCbica = new JLabel("Ra\u00EDz c\u00FAbica:");
		lblRazCbica.setForeground(Color.LIGHT_GRAY);
		lblRazCbica.setFont(new Font("Arial", Font.BOLD, 12));
		lblRazCbica.setBounds(10, 136, 117, 14);
		panelInfos.add(lblRazCbica);
		
		JLabel lblValorAbsoluto = new JLabel("Valor absoluto:");
		lblValorAbsoluto.setForeground(Color.LIGHT_GRAY);
		lblValorAbsoluto.setFont(new Font("Arial", Font.BOLD, 12));
		lblValorAbsoluto.setBounds(10, 161, 117, 14);
		panelInfos.add(lblValorAbsoluto);
		
		JLabel lblResultaods = new JLabel("Resultados");
		lblResultaods.setForeground(Color.LIGHT_GRAY);
		lblResultaods.setFont(new Font("ITC Avant Garde Gothic LT", Font.PLAIN, 20));
		lblResultaods.setBounds(10, 21, 122, 25);
		panelInfos.add(lblResultaods);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setForeground(Color.LIGHT_GRAY);
		lblResto.setBounds(153, 61, 48, 14);
		panelInfos.add(lblResto);
		
		JLabel lblCubo = new JLabel("0");
		lblCubo.setForeground(Color.LIGHT_GRAY);
		lblCubo.setBounds(153, 86, 48, 14);
		panelInfos.add(lblCubo);
		
		JLabel lblQuadrada = new JLabel("0");
		lblQuadrada.setForeground(Color.LIGHT_GRAY);
		lblQuadrada.setBounds(153, 111, 48, 14);
		panelInfos.add(lblQuadrada);
		
		JLabel lblCubica = new JLabel("0");
		lblCubica.setForeground(Color.LIGHT_GRAY);
		lblCubica.setBounds(153, 136, 48, 14);
		panelInfos.add(lblCubica);
		
		JLabel lblAbsoluto = new JLabel("0");
		lblAbsoluto.setForeground(Color.LIGHT_GRAY);
		lblAbsoluto.setBounds(153, 161, 48, 14);
		panelInfos.add(lblAbsoluto);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Calculate.class.getResource("/Img/littlebrain.png")));
		label.setBounds(47, 126, 100, 100);
		contentPane.add(label);
		
		panelInfos.setVisible(false);
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelInfos.setVisible(true);
				
				int num = Integer.parseInt(spnValue.getValue().toString());
				double sqrt = Math.sqrt(num);
				double cbrt = Math.cbrt(num);
	
				lblResto.setText(Integer.toString(num % 2));
				lblCubo.setText(Double.toString(Math.pow(num, 3)));
				lblQuadrada.setText(String.format("%.2f", sqrt));
				lblCubica.setText(String.format("%.2f", cbrt));
				lblAbsoluto.setText(Integer.toString(Math.abs(num)));
				
				
			}
		});
		btnCalculate.setForeground(Color.DARK_GRAY);
		btnCalculate.setBackground(new Color(153, 153, 153));
		btnCalculate.setBounds(27, 86, 138, 23);
		contentPane.add(btnCalculate);
	}
}
