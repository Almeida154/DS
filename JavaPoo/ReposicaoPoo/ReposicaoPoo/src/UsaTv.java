public class UsaTv {
	public static void main(String[] args) {
		Tv panasonic = new Tv();
		panasonic.desligarTv();
		panasonic.ligarTv();
		panasonic.aumentarVolume();
		panasonic.trocarCanalDown();
		System.out.println(panasonic.Status());
	}
}