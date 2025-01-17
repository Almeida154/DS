import java.util.Scanner;
public class Baleia extends Animal implements AnimalSelvagem{

	//Classe respons�vel pelo Cachorro, sendo uma especializa��o da progenitora "Animal"
	
	public Baleia() {
		super();
		this.dorminhoco = false;
		this.classe = "Mam�fero";
		this.cor = "Cinza";
	}
	
	public void DefinirBaleia() {
		Scanner in = new Scanner(System.in);
		System.out.println("---------BALEIA---------");
		
		System.out.println("\nInsira a idade:");
		int id = in.nextInt();
		this.setIdade(id);
		
		System.out.println("\nInsira o nome:");
		String no = in.next();
		this.setNome(no);
		
		System.out.println("\nInsira a ra�a:");
		String raca = in.next();
		this.setRaca(raca);
		
		this.Barulho();
		
		System.out.println(" ");
	}
	
	//M�todos
	
	private void Barulho() {
		System.out.println("\nBaleias n�o s�o adestradas e nem domesticadas, por isso:");
		this.BarulhoSelvagem();
	}


	//Sobreposi��es
	
	@Override
	public void BarulhoSelvagem() {
		System.out.println("O(A) "+ this.getNome() +" diz: UUUUUUUUUUUH! [Tradu��o: Saia! Sou uma baleia, e selvagem.]");
		
	}
}