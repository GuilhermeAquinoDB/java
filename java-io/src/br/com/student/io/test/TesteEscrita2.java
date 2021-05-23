package br.com.student.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

		// Fluxo de Saida com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor cbuf");
		bw.newLine();
		bw.write("fghjnfjhngfvnjgfnjhgfnjghfyjnghyjnjnvfgnj");
		
		bw.close();
	}

}
