
public class TesteContaComExcecaoChecked {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.saque();
		} catch(MyException ex) {
			System.out.println("tratamento..");
		}
	}

}
