
public class TestGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("222-222-333-44");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(123);
		boolean autenticou = g1.autentica(123);
		
		System.out.println(autenticou);
	}

}
