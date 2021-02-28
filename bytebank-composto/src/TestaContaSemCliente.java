
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDoAlex = new Conta();
		System.out.println(contaDoAlex.getSaldo());
		
		contaDoAlex.titular = new Cliente();
		System.out.println(contaDoAlex.titular);
		
		contaDoAlex.titular.nome = "Alex";
		System.out.println(contaDoAlex.titular.nome);
	}

}
