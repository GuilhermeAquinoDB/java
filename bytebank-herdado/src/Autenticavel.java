//contrato Autenticavel
	// quem assina esse contrato, precisa implementar
		// método setSenha e método autenticas
public abstract interface Autenticavel  {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}