package br.com.student.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de Saida com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));	
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor cbuf, consectetur adipiscing selitm, sed");
		ps.println();
		ps.println("fghjnfjhngfvnjgfnjhgfnjghfyjnghyjnjnvfgnoooolllllj");
		
		ps.close();
	}

}
