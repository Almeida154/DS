import java.util.Scanner;
public class Operacoes {
	Scanner in = new Scanner (System.in);
	int opc;
	int a, b, r;
	String tlgnepai;
	
	public void Ler(){
		System.out.println("Digite um valor:");
		a = in.nextInt();
		System.out.println("Digite outro valor:");
		b = in.nextInt();
	}
	
	public void SolicitarOp(){
		System.out.println("------------------------------CALCULADORA-----------------------------");
		System.out.println("Opera��es: 1-Soma | 2-Subtra��o | 3-Divis�o | 4-Multiplica��o | 5-Exit");
		opc = in.nextInt();
		switch(opc){
			case 1:
				Somar();
				break;
			case 2:
				Sub();
				break;
			case 3:
				Div();
				break;
			case 4:
				Mult();
				break;
		}
	}
	
	public void Apresentar(){
		switch(opc){
		case 1:
			tlgnepai = "soma";
			break;
		case 2:
			tlgnepai = "subtra��o";
			break;
		case 3:
			tlgnepai = "divis�o";
			break;
		case 4:
			tlgnepai = "multiplica��o";
			break;
		}
		System.out.println("O resultado da "+tlgnepai+" � "+r);
	}
	
	public void Somar() {
		r = a + b;
	}
	
	public void Sub() {
		r = a - b;
	}
	
	public void Div() {
		r = a / b;
	}
	
	public void Mult() {
		r = a * b;
	}
}