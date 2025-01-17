public class Lutador {
	
	//Atributos
	
	private String nome, nacionalidade, categoria;
	private double altura, peso;
	private int vitorias, derrotas, empates, idade, life;
	
	//M�todos Publicos
	
	public void chutado() {
		setLife(getLife() - 15);
		System.out.println(getNome()+" foi chutado! ---- VIDA: "+getLife());
	}
	
	public void socado() {
		setLife(getLife() - 30);
		System.out.println(getNome()+" foi socado! ---- VIDA: "+getLife());
	}
	
	public void xingado() {
		setLife(getLife() - 50);
		System.out.println(getNome()+" teve sua m�e xingada! ---- VIDA: "+getLife());
	}
	
	public void apresentar() {
		System.out.println("- "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("Idade: "+getIdade());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Categoria: "+getCategoria());
		System.out.println("Vit�rias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());
		System.out.println("");
	}
	
	
	public void status() {
		System.out.println("-------STATUS---------");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Vit�rias: "+this.getVitorias());
		System.out.println("Derrotas: "+this.getDerrotas());
		System.out.println("Empates: "+this.getEmpates());
	}
	
	private void setCategoria() {
		if(getPeso()<52.2) System.out.println("Voc� est� fora dos par�metros, n�o poder� lutar!");
		else if(getPeso() <= 70.3) this.categoria = "Leve";
		else if(getPeso() <= 83.9) this.categoria = "M�dio";
		else if(getPeso() <= 120.2) this.categoria = "Pesado";
		else { 
			this.categoria = "Invalida"; 
			System.out.println("Voc� est� fora dos par�metros, n�o poder� lutar!");
		}
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		this.idade = id;
		this.life = 100;
	}
	
	//M�todos Especiais

	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
