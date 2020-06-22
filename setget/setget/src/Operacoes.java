import java.util.Scanner;
import javax.swing.JOptionPane;
public class Operacoes {
	private String sexo;
	private String alt, pes;
	double altura, peso, r;
	

	public void SolicitarAltura() {
		alt = JOptionPane.showInputDialog("Digite sua altura:");
		altura = Double.parseDouble(alt);
	}
	
	public void SolicitarPeso() {
		pes = JOptionPane.showInputDialog("Digite seu peso:");
		peso = Double.parseDouble(pes);
	}
	
	public void SolicitarSexo() {
		sexo = JOptionPane.showInputDialog("Digite seu sexo:");
	}
	
	
	public void Result(){
		Scanner in = new Scanner(System.in);
		switch(sexo){
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
	
	public void Calculo(){
		r=peso/(altura*altura);
	}
	
	public void Masculino(){
		Calculo();
		if(r>43){
			JOptionPane.showMessageDialog(null, "Voc� possui obesidade m�rbida!\nSeu IMC: "+r);
		}
		else if(r>=30 && r<40){
			JOptionPane.showMessageDialog(null, "Voc� possui obesidade moderada!\nSeu IMC: "+r);
		}
		else if(r>=25 && r<30){
			JOptionPane.showMessageDialog(null, "Voc� possui obesidade leve!\nSeu IMC: "+r);
		}
		else if(r>=20 && r<25){
			JOptionPane.showMessageDialog(null, "Voc� possui um peso adequado!\nSeu IMC: "+r);
		}
		else if(r<20){
			JOptionPane.showMessageDialog(null, "Voc� possui um peso abaixo do normal!\nSeu IMC: "+r);
		}
	}
	
	public void Feminino(){
		Calculo();
		if(r>39){
			JOptionPane.showMessageDialog(null, "Voc� possui obesidade m�rbida!\nSeu IMC: "+r);
		}
		else if(r>=29 && r<39){
			JOptionPane.showMessageDialog(null, "Voc� possui obesidade moderada!\nSeu IMC: "+r);
		}
		else if(r>=24 && r<29){
			JOptionPane.showMessageDialog(null, "Voc� possui obesidade leve!\nSeu IMC: "+r);
		}
		else if(r>=19 && r<24){
			JOptionPane.showMessageDialog(null, "Voc� possui um peso adequado!\nSeu IMC: "+r);
		}
		else if(r<19){
			JOptionPane.showMessageDialog(null, "Voc� possui um peso abaixo do normal!\nSeu IMC: "+r);
		}
	}
}