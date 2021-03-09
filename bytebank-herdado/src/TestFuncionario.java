
public class TestFuncionario {

	public static void main(String[] args) {
		
		Gerente gui = new Gerente();
		gui.setNome("Guilherme de Aquino");
		gui.setCpf("123-456-789-00");
		gui.setSalario(2500.00);
		
		System.out.println(gui.getNome());
		System.out.println(gui.getBonificacao());

	}

}
