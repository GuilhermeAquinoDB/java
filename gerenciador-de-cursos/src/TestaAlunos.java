import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Leonardo Turini");
		alunos.add("Nico Steppat");
		alunos.add("Alberto de Souza");
		alunos.add("Alex Aquino");
		alunos.add("Ariadina Aniche");
		alunos.add("Sergio Gavea");
		alunos.add("Sergio Gavea");

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Alberto de Souza");

		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);

		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
}
