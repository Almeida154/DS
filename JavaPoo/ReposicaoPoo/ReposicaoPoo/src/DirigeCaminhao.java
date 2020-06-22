public class DirigiCaminhao {
	public static void main(String[] args) {
		Caminhao OptimusPrime = new Caminhao();
		
		OptimusPrime.ligarTruck();
		OptimusPrime.trocarCombustivel("apple");
		OptimusPrime.desligarTruck();
		OptimusPrime.trocarCombustivel("apple");
		OptimusPrime.trocarCombustivel("diesel");
		OptimusPrime.diminuirVelocidade();
		OptimusPrime.ligarTruck();
		OptimusPrime.diminuirVelocidade();
		OptimusPrime.aumentarVelocidade();
		
		System.out.println(OptimusPrime.status());
	}
}