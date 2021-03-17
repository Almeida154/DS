import java.awt.EventQueue;
public class UsaCalculadora {
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora calc = new Calculadora();
					calc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}