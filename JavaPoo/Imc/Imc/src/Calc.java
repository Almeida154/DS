import java.util.Scanner;
public class Calc {
	String s;
	double alt, peso, r;
	
	public void Style(){
		System.out.println("----------Cálculo do Índice de Massa Corporal----------");
	}
	
	public void Result(){
		Scanner in = new Scanner(System.in);
		System.out.println("Qual seu sexo?");
		s = in.next();
		switch(s){
			case "Masculino":
				Masculino();
				break;
			case "masculino":
				Masculino();
				break;
			case "Feminino":
				Feminino();
				break;
			case "feminino":
				Feminino();
				break;
		}
	}
	
	public void Info(){
		Scanner in = new Scanner(System.in);
		System.out.println("Digite sua altura:");
		alt = in.nextDouble();
		System.out.println("Digite seu peso:");
		peso = in.nextDouble();
	}
	
	public void Calculo(){
		r=peso/(alt*alt);
	}
	
	public void Masculino(){
		Calculo();
		if(r>43){
			System.out.println("Você possui obesidade mórbida!");
		}
		else if(r>=30 && r<40){
			System.out.println("Você possui obesidade moderada!");
		}
		else if(r>=25 && r<30){
			System.out.println("Você possui obesidade leve!");
		}
		else if(r>=20 && r<25){
			System.out.println("Você possui um peso adequado!");
		}
		else if(r<20){
			System.out.println("Você possui um peso abaixo do normal!");
		}
		System.out.println("SEU IMC: "+r);
	}
	
	public void Feminino(){
		Calculo();
		if(r>39){
			System.out.println("Você possui obesidade mórbida!");
		}
		else if(r>=29 && r<39){
			System.out.println("Você possui obesidade moderada!");
		}
		else if(r>=24 && r<29){
			System.out.println("Você possui obesidade leve!");
		}
		else if(r>=19 && r<24){
			System.out.println("Você possui um peso adequado!");
		}
		else if(r<19){
			System.out.println("Você possui um peso abaixo do normal!");
		}
		System.out.println("SEU IMC: "+r);
	}
	
	
	
	
	
	
	
	
	
	
}
