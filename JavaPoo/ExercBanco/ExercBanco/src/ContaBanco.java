public class ContaBanco {
	
	//Atributos
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//M�todos
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int nc) {
		this.numConta = nc;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String nome) {
		this.dono = nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double rs) {
		this.saldo = rs;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean stts) {
		this.status = stts;
	}
	
	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if(getTipo().equals("cp")) {
			setSaldo(150);
		}
		else if(getTipo().equals("cc")) {
			setSaldo(50);
		}
	}
	
	public void fecharConta() {
		if(getSaldo() == 0) {
			setStatus(false);
		}
		else if(getSaldo() < 0){
			System.out.println("Sua conta est� negativa, pague o que deve!");
		}
		else if(getSaldo() > 0){
			System.out.println("Conta com dinheiro, retire antes.");
		}
	}
	
	public void depositar(double rs) {
		if(getStatus()) {
			setSaldo(getSaldo() + rs);
			System.out.println("Agora voc� tem: "+getSaldo()+" de saldo.");
		}
		else{
			System.out.println("Voc� deve abrir uma conta primeiro!");
		}
	}
	
	public void sacar(double rs) {
		if(getStatus()) {
			if(getSaldo() > rs) {
				setSaldo(getSaldo() - rs);
				System.out.println("Agora voc� tem: "+getSaldo()+" de saldo.");
			}
			else {
				System.out.println("Se nem tem esse dinheiro.");
			}
		}
		else{
			System.out.println("Voc� deve abrir uma conta primeiro!");
		}
	}
	
	public void pagarMensalidade() {
		if(getStatus()) {
			if(getSaldo() > 0) {
				if(getTipo().equals("cp")) {
					setSaldo(getSaldo() - 20);
					System.out.println("Foi descontado R$20,00. Agora voc� tem: "+getSaldo()+" de saldo.");
				}
				else if(getTipo().equals("cc")) {
					setSaldo(getSaldo() - 12);
					System.out.println("Foi descontado R$12,00. Agora voc� tem: "+getSaldo()+" de saldo.");
				}
			}
			else {
				System.out.println("Se nem tem esse dinheiro.");
			}
		}
		else {
			System.out.println("Voc� deve abrir uma conta primeiro!");
		}
	}
	
	
}