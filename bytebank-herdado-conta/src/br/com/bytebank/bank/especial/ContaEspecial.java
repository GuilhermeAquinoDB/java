package br.com.bytebank.bank.especial;

import br.com.bytebank.bank.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {
	
		super.saldo += valor;

	}

}
