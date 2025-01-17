import java.util.Scanner;
public class Caminhao {
	//Atributos
	private String combustivel = "gasolina";
	private int velocidade = 0;
	private boolean ligado = false;
	
	//Comportamentos
	public String status() {
		return "\n---Status do TRUCK---"
				+ "\nMotor Ligado?: "+ getLigado()
				+ "\nCombust�vel: "+ getCombustivel()
				+ "\nVelocidade: "+ getVelocidade() +"km/h";
	}
	
	public void ligarTruck() {
		if(!getLigado()) {
			setLigado(true);
			System.out.println("Caminh�o ligado! VRUM VRUM");
		}
		else System.out.println("J� ta ligado!");
	}
	
	public void desligarTruck() {
		if(getLigado()) {
			setLigado(false);
			setVelocidade(0);
			System.out.println("Caminh�o desligado! ;-;");
		}
		else System.out.println("J� ta desligado!");
	}
	
	public void aumentarVelocidade(){
		if(getLigado()) {
			Scanner in = new Scanner(System.in);
			int opc;
			boolean speed = true;
			do {
				System.out.println("1 - Pisar pouqu�ssimo | 2 - Pisar pouco | 3 - Pisar mais ou menos | 4 - ATIVAR BRAYA MODE | 5 - Tirar o p� da t�bua");
				opc = in.nextInt();
				switch(opc) {
					case 1:
						if(getVelocidade()<=145) setVelocidade(getVelocidade() + 5);
						else System.out.println("Mano, pise menos!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 2:
						if(getVelocidade()<=135) setVelocidade(getVelocidade() + 15);
						else System.out.println("Mano, pise menos!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 3:
						if(getVelocidade()<=100) setVelocidade(getVelocidade() + 50);
						else System.out.println("Mano, pise menos!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 4:
						if(getVelocidade()<=50) setVelocidade(getVelocidade() + 100);
						else System.out.println("Mano, pise menos!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 5:
						System.out.println("Voc� tirou o p� da t�bua");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						speed = false;
						break;
				}
			}while(speed == true);
		}
		else System.out.println("Voc� precisa ligar o caminh�o primeiro!");
	}
	
	public void diminuirVelocidade(){
		if(getLigado()) {
			int opc;
			boolean speed = true;
			Scanner in = new Scanner(System.in);
			do {
				System.out.println("1 - Tirar pouqu�ssimo | 2 - Tirar pouco | 3 - Tirar mais ou menos | 4 - FREIO DE M�O | 5 - Cansei de freiar");
				opc = in.nextInt();
				switch(opc) {
					case 1:
						if(getVelocidade()>=5) setVelocidade(getVelocidade() - 5);
						else System.out.println("Mano, se nem ta nessa velocidade!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 2:
						if(getVelocidade()>=15) setVelocidade(getVelocidade() - 15);
						else System.out.println("Mano, se nem ta nessa velocidade!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 3:
						if(getVelocidade()>=50) setVelocidade(getVelocidade() - 50);
						else System.out.println("Mano, se nem ta nessa velocidade!");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 4:
						setVelocidade(0);
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						break;
					case 5:
						System.out.println("Voc� parou de freiar");
						System.out.println("Veloc�metro: "+getVelocidade()+"km/h");
						speed = false;
						break;
				}
			}while(speed == true);
		}
		else System.out.println("Voc� precisa ligar o caminh�o primeiro!");
	}
	
	public void trocarCombustivel(String comb) {
		if(getLigado()) {
			System.out.println("Voc� precisa desligar o caminh�o primeiro!");
		}
		else {
			if(getCombustivel().equals(comb)) {
				System.out.println("Voc� j� usa esse combust�vel!");
			}
			else {
				if(comb.equals("gasolina") || comb.equals("diesel") || comb.equals("g�s")) {
					setCombustivel(comb);
					System.out.println("Seu novo combust�vel: "+getCombustivel());
				}
				else System.out.println("Esse combust�vel n�o existe!");
			}
		}
	}
	
	//Comportamentos Especiais
	private boolean getLigado() {
		return ligado;
	}
	
	private void setLigado(boolean lig) {
		this.ligado = lig;
	}
	
	private String getCombustivel() {
		return combustivel;
	}
	
	private void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	private int getVelocidade() {
		return velocidade;
	}
	
	private void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}