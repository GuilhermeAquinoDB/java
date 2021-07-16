package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		// Criando uma lista.
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa do codigo");
		palavras.add("Caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.sort(comparador);
		
		// Collections.sort(palavras, comparador);
		

		System.out.println(palavras);

		/*
		 * for (String p : palavras) { System.out.println(p); }
		 */
		
		// imprimindo cada String com o novo método default (forEach)
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);

	}

}

// Ordene essa lista de Strings utilizando o tamanho da String como critério de comparação.

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}