import java.util.Scanner;
public class Passaro extends Animal implements AnimalAdestrado, AnimalDomesticado, AnimalSelvagem{

	//Classe respons�vel pelo Cachorro, sendo uma especializa��o da progenitora "Animal"
	
	public Passaro() {
		super();
		this.dorminhoco = false;
		this.classe = "Mam�fero";
	}
	
	public void DefinirPassaro() {
		Scanner in = new Scanner(System.in);
		System.out.println("---------PASSARO---------");
		
		System.out.println("\nInsira a idade:");
		int id = in.nextInt();
		this.setIdade(id);
		
		System.out.println("\nInsira o nome:");
		String no = in.next();
		this.setNome(no);
		
		System.out.println("\nInsira a cor das penas:");
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
		System.out.println("\nO(A) "+ this.getNome() +" diz: FIOFIOOO! [Tradu��o: Oi, sou adestrado!]");
	}	


	@Override
	public void BarulhoSelvagem() {
		System.out.println("\nO(A) "+ this.getNome() +" diz: PAPAPAUA! [Tradu��o: Saia! Sou selvagem.]");
		
	}

	@Override
	public void BarulhoDomesticado() {
		System.out.println("\nO(A) "+ this.getNome() +" diz: piupiupiupiu! [Tradu��o: Oi, dono. Sou domesticado!]");
		
	}
}