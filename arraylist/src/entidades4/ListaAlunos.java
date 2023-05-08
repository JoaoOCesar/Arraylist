package entidades4;

import java.util.ArrayList;

public class ListaAlunos {
	private ArrayList<Aluno> listaAlunos;
	
	public ListaAlunos() {
		listaAlunos = new ArrayList<>();
	}
	
	public void adicionaAluno(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	public void calcMediaIndividual(int indice) {
		if((indice>=0)&&(indice < listaAlunos.size() )) {
			Aluno aluno = listaAlunos.get(indice);
			aluno.calcMedia();
			System.out.println("A media do " + aluno.getNome() + " foi: "+ aluno.calcMedia());
		}else {
			System.out.println("Indice invalido!");
		}
	}
}
