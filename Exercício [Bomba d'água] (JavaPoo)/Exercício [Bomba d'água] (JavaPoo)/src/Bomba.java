public class Bomba {
	//Atributos
	private boolean status;
	
	//Comportamentos
	public void on(int n) {
		if(!getStatus()) {
			setStatus(true);
			System.out.println("\n<--- A bomba foi ligada! --->\n");
			temporizador(n);
			this.observar();
		}
		else System.out.println("ERRO: A bomba j� est� ligada");
	}
	
	public void off() {
		if(getStatus()) setStatus(false);
		else System.out.println("ERRO: A bomba j� est� desligada");
	}
	
	private void temporizador(int segundos){
		for(; segundos>=0; segundos--) {
			System.out.println("Faltam "+segundos+" segundo(s)");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		this.setStatus(false);
	}
	
	private void observar() {
		if(getStatus()) System.out.println("\n<--- A bomba est� ligada! --->\n");
		else System.out.println("\n<--- A bomba est� desligada! --->\n");
	}
	
	//Getters and Setters
	private boolean getStatus() {
		return this.status;
	}
	
	private void setStatus(boolean n) {
		this.status = n;
	}
}