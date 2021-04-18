package br.com.bytebank.bank.teste;

public class Teste {
	
	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
/*		idades[0] = 29;
		idades[1] = 23;
		idades[2] = 47;
		idades[3] = 50;
		idades[4] = 69;
		
		int idade1 = idades[1];
		
		System.out.println(idade1);
	
		System.out.println(idades.length); */
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}

}
