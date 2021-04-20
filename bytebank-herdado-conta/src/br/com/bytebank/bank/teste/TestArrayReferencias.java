package br.com.bytebank.bank.teste;

import br.com.bytebank.bank.modelo.Cliente;
import br.com.bytebank.bank.modelo.Conta;
import br.com.bytebank.bank.modelo.ContaCorrente;
import br.com.bytebank.bank.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(23, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 33);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//Object referenciaGenerica = referencia[2];
		//System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
