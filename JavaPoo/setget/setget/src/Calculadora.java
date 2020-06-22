import javax.swing.JOptionPane;
public class Calculadora {
	public static void main(String[]args) {
		Operacoes imc = new Operacoes();
		imc.SolicitarAltura();
		imc.SolicitarPeso();
		imc.SolicitarSexo();
		imc.Result();
	}
}