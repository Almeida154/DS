public class Bancao {
	public static void main(String[]args){
		ContaBanco p1 = new ContaBanco();
		p1.setDono("Jubileu");
		p1.setNumConta(3567);
		p1.abrirConta("cp");
		p1.depositar(500);
		p1.sacar(650);
		p1.pagarMensalidade();
		p1.fecharConta();
	}
}
