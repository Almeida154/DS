
public class Automovel {
	String nome;
	String cor;
	String modelo;
	String fabricante;
	String placa;
	String mora;
	int ano;
	int aro;
	boolean teto_solar;
	boolean ligado;
	boolean luzes;
	
	public void MotorCondicao(){
		if(ligado){
			System.out.println("Seu automóvel está ligado!");
		}
		else{
			System.out.println("Seu automóvel está desligado!");
		}
	}
	public void LuzesCondicao(){
		if(luzes){
			System.out.println("As luzes estão ligadas!");
		}
		else{
			System.out.println("As luzes estão desligadas!");
		}
	}
	public void TetoSolarcondicao(){
		if(teto_solar){
			System.out.println("O teto solar está aberto!");
		}
		else{
			System.out.println("O teto solar está desligado!");
		}
	}
}