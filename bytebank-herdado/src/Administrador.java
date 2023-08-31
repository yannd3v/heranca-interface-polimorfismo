
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
	}

	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
