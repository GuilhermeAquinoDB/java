package br.com.bytebank.bank.teste;

import br.com.bytebank.bank.modelo.Cliente;
import br.com.bytebank.bank.modelo.ContaCorrente;
import br.com.bytebank.bank.modelo.ContaPoupanca;

public class TestObject {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(102, 105);
		Object cp = new ContaPoupanca(154, 101);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cliente);
	}

}
