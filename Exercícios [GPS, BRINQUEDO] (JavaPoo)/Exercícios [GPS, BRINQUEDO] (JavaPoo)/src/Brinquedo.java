import java.util.Scanner;
public class Brinquedo {
	Scanner in = new Scanner(System.in);

	//ATRIBUTOS
	private String nome, faixaEtaria;
	private double preco;
	
	//CONSTRUCT
	public Brinquedo(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//M�TODOS
	public void definirPreco(double preco) {
		setPreco(preco);
	}
	
	public void definirNome(String nome) {
		setNome(nome);
	}
	
	public void mostrar(){
		System.out.println("\n-------------------------------");
		System.out.println("Brinquedo: "+getNome());
		System.out.println("Faixa Et�ria: "+getFaixaEtaria());
		System.out.println("Pre�o: R$"+getPreco());
		System.out.println("-------------------------------");
	}
	
	public void definirFaixaEtaria() {
		boolean continua = true;
		
		do {
			
			System.out.println("- Defina uma faixa et�ria: -");
			String fe = in.nextLine();
			switch(fe) {
				case "0 a 2":
					setFaixaEtaria("0 a 2");
					continua = false;
					break;
				case "3 a 5":
					setFaixaEtaria("3 a 5");
					continua = false;
					break;
				case "6 a 10":
					setFaixaEtaria("6 a 10");
					continua = false;
					break;
				case "acima de 10":
					setFaixaEtaria("acima de 10");
					continua = false;
					break;
				default:
					System.out.println("Valor inv�lido!");
					continua = true;
				}
			
		}while(continua);
		
	}
}