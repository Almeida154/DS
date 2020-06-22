public class Quadrado {
	//Atributos
	private double lado;
	
	//M�todos
	public String area() {
		if(getLado() == 0) return "Antes, defina um lado!";
		else return "�rea deste quadrado: "+getLado()*getLado();
	}

	//M�todos Especiais
	public double getLado() {
		return this.lado;
	}

	public void setLado(double side) {
		if(side<0) System.out.println("Lado Inv�lido.");
		else this.lado = side;
	}
}