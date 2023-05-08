package entidades2;

import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
	private ArrayList<Livro> listaDeLivros;
	
	public Livraria() {
		listaDeLivros = new ArrayList<>();
	}
	
	public void adicionarLivros(Livro livro) {
		listaDeLivros.add(livro);
	}
	
	public void removerLivros(int indice) {
		if((indice >= 0 ) && (indice < listaDeLivros.size())){
			Livro livro = listaDeLivros.remove(indice);
			System.out.println("Livro: " + livro.getNome() + "removido com exito!");
		}else {
			System.out.println("Indice invalido!");
		}
	}
	
	public void renomearLivros(int indice) {
		if((indice >= 0 ) && (indice < listaDeLivros.size())) {
			System.out.println("Digite o novo nome: ");
			Livro livro = listaDeLivros.get(indice);
			Scanner lerDados = new Scanner(System.in);
			String nomeNovo = lerDados.nextLine();
			livro.setNome(nomeNovo);
			System.out.printf("O livro foi renomeado para: %s", livro.getNome());
		}else {
			System.out.println("Indice invalido!");
		}
	}
	
	public void listarLivros() {
		if(listaDeLivros.isEmpty()) {
			System.out.println("Nao ha livros cadastrados!");
		}else {
			for(int i = 0; i<listaDeLivros.size();i++) {
				Livro livro = listaDeLivros.get(i);
				livro.exibeLivros();
			}
		}
	}
}
