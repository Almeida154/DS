package poo;

public class Cachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cao = new Animal();
		Animal cao2 = new Animal();
		
		cao.nome = "Tilapia";
		cao2.nome = "Golira";
		cao.idade = 52;
		cao.raca = "Viralata";
		cao.andando = false;
		cao.correndo = true;
		cao.caminhar();
		cao.correr();
		System.out.println("O nome do meu 1� cachorro �: "+cao.nome);
		System.out.println("O nome do meu 2� cachorro �: "+cao2.nome);
	}
}