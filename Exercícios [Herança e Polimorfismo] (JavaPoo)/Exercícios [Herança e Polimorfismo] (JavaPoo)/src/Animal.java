public abstract class Animal {

	//Classe progenitora, ou classe m�e.
	

	//Caracter�sticas que todo animal tem -> Cor, Ra�a, Idade, Classe (mam�feros, aves, etc...)
	
	int idade, condicao;
	String cor, raca, classe, nome;
	boolean dorminhoco;
	
	
	//Construtor

	public Animal() {
		super();
		this.idade = 0;
		this.cor = "Indefinido";
		this.raca = "Indefinido";
		this.dorminhoco = false;
		this.classe = "Indefinido";
		this.nome = "Indefinido";
	}
	
	
	//M�todos
	
	public void statusAnimal() {
		System.out.println("------------STATUS------------\n");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade() + " anos");
		System.out.println("Classe: " + this.getClasse());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ra�a: " + this.getRaca());
		System.out.println("Dorminhoco: "+this.getDorminhoco());
		System.out.println("\n");
	}
	
	
	//Getters and Setters
	
	protected int getIdade() {
		return idade;
	}


	protected void setIdade(int idade) {
		this.idade = idade;
	}


	protected String getCor() {
		return cor;
	}


	protected void setCor(String cor) {
		this.cor = cor;
	}


	protected String getRaca() {
		return raca;
	}


	protected void setRaca(String raca) {
		this.raca = raca;
	}


	protected String getClasse() {
		return classe;
	}


	protected void setClasse(String classe) {
		this.classe = classe;
	}


	protected boolean getDorminhoco() {
		return dorminhoco;
	}


	protected void setDorminhoco(boolean dorminhoco) {
		this.dorminhoco = dorminhoco;
	}


	protected int getCondicao() {
		return condicao;
	}


	protected void setCondicao(int condicao) {
		this.condicao = condicao;
	}


	protected String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}
}