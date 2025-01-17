public class Lampada {
	//Atributos
	private boolean status;
	
	//Comportamentos
	public void ligarLampada() {
		if(!getStatus()) setStatus(true);
		else System.out.println("--J� EST� ACESSA--");
	}
	
	public void desligarLampada() {
		if(getStatus()) setStatus(false);
		else System.out.println("--J� EST� DESLIGADA--");
	}
	
	public void observar() {
		if(getStatus()) System.out.println("--ACESSA!--");
		else System.out.println("--DESLIGADA!--");
	}
	
	//Comportamentos Especiais
	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean stts) {
		this.status = stts;
	}
}