public class UsaBomba {
	public static void main(String[] args) {
		Bomba bomba1 = new Bomba();
		
		/* A vari�vel do par�metro ON, � referente aos segundos 
		em que a bomba ficar� ligada antes de desligar, 
		conforma o enunciado*/
		
		/* Obs.: O programa nunca entrar� na condi��o 
		 * de "ERRO: A bomba j� est� ligada", pois ela sempre 
		 * termina desligada, ou seja, imposs�vel. */

		bomba1.on(3); 
		bomba1.off();
	}
}