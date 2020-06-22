public class Quadrado {
	//Atributos
	private double lado;
	
	//Métodos
	public String area() {
		if(getLado() == 0) return "Antes, defina um lado!";
		else return "Área deste quadrado: "+getLado()*getLado();
	}

	//Métodos Especiais
	public double getLado() {
		return this.lado;
	}

	public void setLado(double side) {
		if(side<0) System.out.println("Lado Inválido.");
		else this.lado = side;
	}
}