package created;

public class TestConversion {
	
	public static void main(String [] args) {
		
		double salario = 4270.50;
		//type casting
		int valor = (int) salario;
		
		System.out.println(valor);
		
		long numeroGrande = 3234444666688l;
		short valorPequeno = 2131;
		byte b = 127; 
		
		// double 64 bits.
		// float and int 32 bits.
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;

		System.out.println(pontoFlutuante);
	}

}
