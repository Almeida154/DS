import java.util.Random;
import java.util.Scanner;
public class Luta{
	Scanner in = new Scanner(System.in);

	//Atributos
	
	private Lutador player1, player2;
	private int rounds;
	private boolean aprovada;
	
	//M�todos
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			setAprovada(true);
			setPlayer1(l1);
			setPlayer2(l2);
		}
		else {
			setAprovada(false);
			setPlayer1(null);
			setPlayer2(null);			
		}
	}
	
	public void lutar() {
		if(getAprovada()) {
			System.out.println("======== A LUTA VAI COME�AR ========");
			System.out.println("Voc� escolheu o lutador: "+player1.getNome()+", boa sorte!");
			do {
				System.out.println("");
				System.out.println("Escolha uma a��o: 1 - Chutar | 2 - Socar | 3 - Xingar a m�e");
				int opc = in.nextInt();
				
				switch(opc) {
					case 1:
						player2.chutado();
						break;
					case 2:
						player2.socado();
						break;
					case 3:
						player2.xingado();
						break;
				}
				
				if(player2.getLife()<1) break;
				
				Random machinePlayer2 = new Random();
				int opc2 = machinePlayer2.nextInt(3);
				
				switch(opc2) {
					case 1:
						player1.chutado();
						break;
					case 2:
						player1.socado();
						break;
					case 3:
						player1.xingado();
						break;
				}
				
			}while(player1.getLife() > 0 && player2.getLife() > 0);
			
			if (player1.getLife() > 0) {
				player1.ganharLuta();
				player2.perderLuta();
				System.out.println("O "+player1.getNome()+" ganhou a luta!");
			}
			else {
				player1.perderLuta();
				player2.ganharLuta();
				System.out.println("O "+player2.getNome()+" ganhou a luta!");
			}
			
		}
		else{
			System.out.println("A luta n�o pode acontecer.");
		}
	}
	
	public Lutador getPlayer1() {
		return player1;
	}

	public void setPlayer1(Lutador desafiado) {
		this.player1 = desafiado;
	}

	public Lutador getPlayer2() {
		return player2;
	}

	public void setPlayer2(Lutador desafiante) {
		this.player2 = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}