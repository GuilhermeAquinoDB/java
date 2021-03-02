
public class TestGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new  Conta(1337, 24226);
		/*conta.numero = 1337;
		conta.setNumero(1337);*/
		System.out.println(conta.getNumero());
		
		Cliente gui = new Cliente();
		//conta.titular = gui;
		gui.setNome("Guilherme de Aquino");
		
		conta.setTitular(gui);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(gui);
		System.out.println(conta.getTitular());
		
	}

}
