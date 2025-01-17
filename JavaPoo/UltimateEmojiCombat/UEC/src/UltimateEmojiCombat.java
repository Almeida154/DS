import java.util.Scanner;
public class UltimateEmojiCombat {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		Luta game = new Luta();
		Lutador l[] = new Lutador[6];
		Lutador player1, player2;
		l[0] = new Lutador("David", "Alemanha", 31, 1.75, 68.9, 11, 2, 1);
		l[1] = new Lutador("Jo�o", "Favela", 29, 1.68, 57.8, 14, 2, 3);
		l[2] = new Lutador("Paulo", "Alemanha", 35, 1.65, 80.9, 12, 2, 1);
		l[3] = new Lutador("Matheus", "Estados Unidos", 28, 1.93, 81.6, 13, 0, 2);
		l[4] = new Lutador("Samuel", "Quinto dos Infernos", 37, 1.70, 119.3, 5, 4, 3);
		l[5] = new Lutador("Kayan", "Fl�rida - Miami Beach", 30, 1.81, 105.7, 12, 2, 4);
		
		System.out.println("-----------LUTADORES---------------");
		for(int i=0; i<l.length; i++) {
			l[i].apresentar();
		}
		player1 = null;
		player2 = null;
		System.out.println("Escolha um lutador: ");
		String p1 = in.next();
		switch(p1) {
			case "David":
				player1 = l[0];
				break;
			case "Jo�o":
				player1 = l[1];
				break;
			case "Paulo":
				player1 = l[2];
				break;
			case "Matheus":
				player1 = l[3];
				break;
			case "Samuel":
				player1 = l[4];
				break;
			case "Kayan":
				player1 = l[5];
				break;
		}
		
		System.out.println("Escolha um advers�rio: ");
		String p2 = in.next();
		switch(p2) {
			case "David":
				player2 = l[0];
				break;
			case "Jo�o":
				player2 = l[1];
				break;
			case "Paulo":
				player2 = l[2];
				break;
			case "Matheus":
				player2 = l[3];
				break;
			case "Samuel":
				player2 = l[4];
				break;
			case "Kayan":
				player2 = l[5];
				break;
		}
		
		game.marcarLuta(player1, player2);
		game.lutar();

	}
}