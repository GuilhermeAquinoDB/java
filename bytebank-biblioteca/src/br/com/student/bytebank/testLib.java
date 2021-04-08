package br.com.student.bytebank;

import br.com.bytebank.bank.modelo.Conta;
import br.com.bytebank.bank.modelo.ContaCorrente;

public class testLib {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(200.3);
		
		System.out.println(c.getSaldo());
		
	}

}
