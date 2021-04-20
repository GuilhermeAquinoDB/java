package br.com.bytebank.bank.teste;

import br.com.bytebank.bank.modelo.ContaCorrente;
import br.com.bytebank.bank.modelo.ContaPoupanca;
import br.com.bytebank.bank.modelo.SaldoInsuficienteException;

//br.com.bytebank.bank.teste.TestContas
public class TestContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 123);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 321);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC : " + cc.getSaldo());
		System.out.println("CP : " + cp.getSaldo());
		
	}

}
