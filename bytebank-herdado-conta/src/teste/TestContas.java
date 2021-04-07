package teste;

public class TestContas {

	public static void main(String[] args) throws modelo.SaldoInsuficienteException {
		//Full Qualified Name FQN
		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 123);
		cc.deposita(100.0);

		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(222, 321);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC : " + cc.getSaldo());
		System.out.println("CP : " + cp.getSaldo());
	}

}
