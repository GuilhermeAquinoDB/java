
public class TestValues {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		/*System.out.println(conta.getAgencia());
		*conta está inconsistente
		*conta.setAgencia(-50)
		*conta.setNumero(-330)*/
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(8745, 78945);
		
		System.out.println(Conta.getTotal());
	}

}
