import java.util.Scanner;
public class UsaGps {
	public static void main(String[]agrs) {
		Gps samsung = new Gps("Rua Ribeirado Thurus Bengos", "PortuguÍs");
		samsung.mostrar();
		samsung.definirIdioma();
		samsung.definirRota();
		samsung.mostrar();
	}
}
