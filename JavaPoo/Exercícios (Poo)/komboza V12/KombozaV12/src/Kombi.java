public class Kombi {
	public static void main(String[] args) {
		Automovel kombi = new Automovel();
		kombi.nome = "Ribeiro";
		kombi.cor = "Refletiva";
		kombi.modelo = "withboza";
		kombi.fabricante = "Perigo LTDA";
		kombi.placa = "mbb-777";
		kombi.mora = "Autom�tica";
		kombi.ano = 2077;
		kombi.aro = 25;
		kombi.teto_solar = true;
		kombi.ligado = true;
		kombi.luzes = true;
		
		kombi.MotorCondicao();
		kombi.LuzesCondicao();
		kombi.TetoSolarcondicao();
		
		System.out.println("O nome da sua kombi �: "+kombi.nome);
		System.out.println("A cor da sua kombi �: "+kombi.cor);
		System.out.println("O modelo da sua kombi �: "+kombi.modelo);
		System.out.println("O fabricante da sua kombi �: "+kombi.fabricante);
		System.out.println("A placa da sua kombi �: "+kombi.placa);
		System.out.println("A sua kombi �: "+kombi.mora);
		System.out.println("O ano de sua kombi �: "+kombi.ano);
		System.out.println("O aro de sua kombi �: "+kombi.aro);
	}
}