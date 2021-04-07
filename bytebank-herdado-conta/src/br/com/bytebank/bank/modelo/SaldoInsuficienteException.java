package br.com.bytebank.bank.modelo;

public class SaldoInsuficienteException  extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String string) {
		super(string);
	}
}
