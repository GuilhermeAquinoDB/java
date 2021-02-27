
public class TestMethods {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean conseguiuSacar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaDoAlex = new Conta();
		contaDoAlex.deposita(1000);
		
		if(contaDoAlex.transfere(300, conta)) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDoAlex.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Guilherme Aquino";
		System.out.println(conta.titular);
			
	}

}
