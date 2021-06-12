package br.com.student.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titulat = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %s R$:%010.2f", tipoConta,
					agencia, numero, titulat, saldo);
			System.out.println(valorFormatado);

			linhaScanner.close();

//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);

		}
		scanner.close();
	}

}
