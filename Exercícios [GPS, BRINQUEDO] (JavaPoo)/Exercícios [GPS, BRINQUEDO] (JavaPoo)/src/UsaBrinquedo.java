public class UsaBrinquedo {
	public static void main(String[] args) {
		Brinquedo toy = new Brinquedo("Pista Hot Wheels tutu", 500.00);
		toy.definirFaixaEtaria();
		toy.definirNome("Max Steel");
		toy.definirPreco(200);
		toy.mostrar();
	}
}