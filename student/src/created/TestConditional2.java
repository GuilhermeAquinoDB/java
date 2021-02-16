package created;

public class TestConditional2 {
	
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		// operator OR = ||
		// operator AND = &&
		// == = Compares
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo!");
		} else {
				System.out.println("infelizmente você não pode entrar");
			}
		
		}
	}
