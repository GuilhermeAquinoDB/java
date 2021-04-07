package teste;

public class TestTributaveis {

	public static void main(String[] args) {
		modelo.ContaCorrente cc = new modelo.ContaCorrente(123, 456);
		cc.deposita(100.0);
		
		modelo.SeguroDeVida seguro = new modelo.SeguroDeVida();
		
		
		modelo.CalculadorImposto calc = new modelo.CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}
