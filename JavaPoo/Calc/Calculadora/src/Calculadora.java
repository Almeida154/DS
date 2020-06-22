import java.util.Scanner;
public class Calculadora {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		Operacoes calc = new Operacoes();
		calc.Ler();
		calc.SolicitarOp();
		calc.Apresentar();
	}
}