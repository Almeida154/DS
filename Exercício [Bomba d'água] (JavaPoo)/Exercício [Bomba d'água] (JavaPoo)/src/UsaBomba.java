public class UsaBomba {
	public static void main(String[] args) {
		Bomba bomba1 = new Bomba();
		
		/* A variável do parâmetro ON, é referente aos segundos 
		em que a bomba ficará ligada antes de desligar, 
		conforma o enunciado*/
		
		/* Obs.: O programa nunca entrará na condição 
		 * de "ERRO: A bomba já está ligada", pois ela sempre 
		 * termina desligada, ou seja, impossível. */

		bomba1.on(3); 
		bomba1.off();
	}
}