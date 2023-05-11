package entidade2;

import java.util.LinkedList;

public class Agenda {
	private LinkedList<Contato> listaDeContatos;

	public Agenda() {
		listaDeContatos = new LinkedList<>();
	}

	public void adiconarContato(Contato contato) {
		listaDeContatos.add(contato);
	}

	public void removerContato(int indice) {
		listaDeContatos.remove(indice);
	}

	public void buscarContato(String nome) {
		for (int i = 0; i < listaDeContatos.size(); i++) {
			if (nome.equals(listaDeContatos.get(i).getNome())) {
				System.out.println(listaDeContatos.get(i).getNome()+ "existe!");
				break;
			}else {
				System.out.println("Contato inexistente");
			}
		}
		
	}

	public void listarContatos() {
		if(!listaDeContatos.isEmpty()) {
			for (int i = 0; i < listaDeContatos.size(); i++) {
				System.out.println("Nome: " + listaDeContatos.get(i).getNome() + " Numero: " + listaDeContatos.get(i).getNumero());
			}
		}
	}

}
