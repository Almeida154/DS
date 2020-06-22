public class Tv {
	//Caracter�sticas
	private boolean ligado;
	private int canal = 15, volume = 15;
	
	//M�todos
	public String Status() {
		return "\n---Status da Tv---"
				+ "\nLigada?: "+ getLigado()
				+ "\nCanal: "+ getCanal()
				+ "\nVolume: "+ getVolume();
	}
	
	public void ligarTv() {
		if(!getLigado()) setLigado(true);
		else System.out.println("A tv j� est� ligada!");
	}
	
	public void desligarTv() {
		if(getLigado()) setLigado(false);
		else System.out.println("A tv j� est� desligada!");
	}
	
	public void aumentarVolume() {
		if(getLigado()) {
			if(getVolume() < 101) setVolume(getVolume() + 1);
			else System.out.println("J� est� no m�ximo!");
		}
		else {
			System.out.println("Ligue a tv primeiro!");
		}
	}
	
	public void diminuirVolume() {
		if(getLigado()) {
			if(getVolume() > 0) setVolume(getVolume() - 1);
			else System.out.println("J� est� no m�nimo!");
		}
		else {
			System.out.println("Ligue a tv primeiro!");
		}
	}
	
	public void trocarCanalUp() {
		if(getLigado()) {
			if(getCanal() < 998) setCanal(getCanal() + 1);
			else System.out.println("N�o h� mais canais para cima!");
		}
		else {
			System.out.println("Ligue a tv primeiro!");
		}
	}
	
	public void trocarCanalDown() {
		if(getLigado()) {
			if(getCanal() > 1) setCanal(getCanal() - 1);
			else System.out.println("J� est� no primeiro canal!");
		}
		else {
			System.out.println("Ligue a tv primeiro!");
		}
	}
	
	//M�todos Especias
	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private int getCanal() {
		return canal;
	}
	
	private void setCanal(int canal) {
		this.canal = canal;
	}
	
	private int getVolume() {
		return volume;
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}
}