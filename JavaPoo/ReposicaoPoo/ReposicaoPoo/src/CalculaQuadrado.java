public class CalculaQuadrado {
	public static void main(String[]args) {
		Quadrado q1 = new Quadrado();
		System.out.println(q1.area());
		q1.setLado(5);
		System.out.println(q1.area());
	}
}