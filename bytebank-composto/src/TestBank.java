
public class TestBank {

	public static void main(String[] args) {
		
		Cliente guilherme = new Cliente();

		guilherme.nome = "Guilherme de Aquino";
		guilherme.cpf = "123-456-789-00";
		guilherme.profissao = "Programador";
		
		Conta contaDoGui = new Conta();
		contaDoGui.deposita(100);
		System.out.println(contaDoGui.pegaSaldo());
		
		// associa o cliente guilherme a conta contaDoGui
		contaDoGui.titular = guilherme;
		
		System.out.println(contaDoGui.titular.nome);
		System.out.println(contaDoGui.titular);
		System.out.println(guilherme);
	}
}
