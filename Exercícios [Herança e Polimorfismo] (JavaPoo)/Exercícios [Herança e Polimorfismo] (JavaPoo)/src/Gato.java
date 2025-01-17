import java.util.Scanner;
public class Gato extends Animal implements AnimalAdestrado, AnimalDomesticado, AnimalSelvagem{
	
	//Classe respons�vel pelo Gato, sendo uma especializa��o da progenitora "Animal"

	public Gato() {
		super();
		this.dorminhoco = true;
		this.classe = "Mam�fero";
	}
	
	public void DefinirGato() {
		Scanner in = new Scanner(System.in);
		System.out.println("---------GATO---------");
		
		System.out.println("\nInsira a idade:");
		int id = in.nextInt();
		this.setIdade(id);
		
		System.out.println("\nInsira o nome:");
		String no = in.next();
		this.setNome(no);
		
		System.out.println("\nInsira a cor:");
		String cor = in.next();
		this.setCor(cor);
		
		System.out.println("\nInsira a ra�a:");
		String raca = in.next();
		this.setRaca(raca);
		
		this.Barulho();
		
		System.out.println(" ");
	}
	
	//M�todos
	
	private void Barulho() {
		Scanner in = new Scanner(System.in);
		boolean aux = true;
		do {
			System.out.println("\nEle �: 1 - Adestrado | 2 - Domesticado | 3 - Selvagem");
			int opc = in.nextInt();
			switch(opc) {
				case 1:
					this.BarulhoAdestrado();
					aux = false;
					break;
				case 2:
					this.BarulhoDomesticado();
					aux = false;
					break;
				case 3:
					this.BarulhoSelvagem();
					aux = false;
					break;
				default:
					System.out.println("- Tente novamente! -");
					aux = true;
			}
		}while(aux);
	}
	

	//Sobreposi��es

	@Override
	public void BarulhoAdestrado() {
		System.out.println("\nO(A) "+ this.getNome() +" diz: MIAU! [Tradu��o: Oi, sou adestrado!]");
	}	


	@Override
	public void BarulhoSelvagem() {
		System.out.println("\nO(A) "+ this.getNome() +" diz: MIAAAAAAAAU! [Tradu��o: Saia! Sou selvagem.]");
		
	}

	@Override
	public void BarulhoDomesticado() {
		System.out.println("\nO(A) "+ this.getNome() +" diz: MIAU! [Tradu��o: Oi, dono. Sou domesticado!]");
		
	}
}