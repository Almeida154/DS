import java.util.Scanner;
public class Gps {
	Scanner in = new Scanner(System.in);
	//ATRIBUTOS
	private String rota, idioma;

	//CONSTRUCT
	public Gps(String rota, String idioma) {
		this.rota = rota;
		this.idioma = idioma;
	}

	//SETTERS AND GETTERS
	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public void mostrar() {
		System.out.println("\n-------------------------------");
		System.out.println("Rota atual: "+getRota());
		System.out.println("Idioma: "+getIdioma());
		System.out.println("-------------------------------");
	}
	
	//M�TODOS
	public void definirIdioma() {
		System.out.println("\n- Definir para qual idioma? -");
		String id = in.nextLine();
		System.out.println("Idioma defino para: "+id);
		setIdioma(id);
	}
	
	public void definirRota() {
		System.out.println("\n- Definir rota -");
		String rot = in.nextLine();
		System.out.println("Rota definida para: "+rot);
		setRota(rot);
	}
}