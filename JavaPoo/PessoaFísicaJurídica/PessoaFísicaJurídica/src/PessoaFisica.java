import javax.swing.JOptionPane;
public class PessoaFisica extends Main{
	private String cpf, rg;
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String _cpf) {
		this.cpf = _cpf;
	}

	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String _rg) {
		this.rg = _rg;
	}
	
	public void RPessoaFisica() {
		JOptionPane.showMessageDialog(null, "CPF: "+getCpf()+"\nRG: "+getRg()+"\nNome: "+getNome()+"\nData Nascimento: "+getDataCriacao()+"\nRua: "+getRua()+"\nN�mero: "
		+getNum()+"\nTelefone: "+getTelefone());
	}
}
