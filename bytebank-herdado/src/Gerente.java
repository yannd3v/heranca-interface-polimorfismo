// Gerente é um funcionario, Gerente herda da classe funcionario, assina o contrato autenticavel, é um autenticavel

public class Gerente extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
	    return super.getSalario() * 0.1;
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}