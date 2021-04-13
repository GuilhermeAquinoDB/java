package br.com.bytebank.bank.teste;

public class TestString {

	public static void main(String[] args) {
		
		String vazio = "    Alura    ";
		String outroVazio = vazio.trim();
		
//		System.out.println(vazio.contains("Alu"));
//		System.out.println(outroVazio);
		
//		System.out.println(outroVazio.isEmpty());
		
//		int a = 3;
//		String nome = "Alura";//object literal
//		String outro = new String("Alura");
	
//		System.out.println(nome.length());
		
/*		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}*/
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		String outra = nome.replace("A", "a");
//		String outra = nome.toUpperCase();
		
//		nome.toLowerCase();
//		System.out.println(nome);
//		System.out.println(outra);
//		System.out.println(a);
		
/*		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("Ônibus ");
		builder.append("em ");
		builder.append("Marrocos"); 
		
		String texto = builder.toString();
		System.out.println(texto);
		
		CharSequence cs = new StringBuilder("Também é uma sequencia de caracteres");
		System.out.println(cs); */
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");
		
		nome = nome.replace("AL", cs);
		
		System.out.println(nome);
	}

}
