package principais;

import java.util.Scanner;

import entidades2.Livraria;
import entidades2.Livro;

public class MainEx1 {

	public static void menu(int i, Livraria listaLivros, Scanner lerDados) {
		
		switch(i) {
		case 1:
			System.out.printf("Insira o nome do livro: ");
			String nome = lerDados.next();
			System.out.printf("Digite o codigo do livro: ");
			int codigo = lerDados.nextInt();
			System.out.println("Digite o nome do autor: " );
			String autor = lerDados.next();
			System.out.println("Digite a quantidade disponivel: ");
			int qtd = lerDados.nextInt();
			Livro livro = new Livro(nome,codigo,autor,qtd);
			listaLivros.adicionarLivros(livro);
			break;
		case 2:
			listaLivros.listarLivros();
			break;
		case 3:
			System.out.printf("\nDigite o indice do livro que deseja renomear: ");
			int indice = lerDados.nextInt();
			listaLivros.renomearLivros(indice-1);
			break;
		case 4:
			System.out.printf("\nDigite o indice do livro que deseja remover: ");
			int indice2 = lerDados.nextInt();
			listaLivros.removerLivros(indice2-1);
			break;
		case 0:
			System.out.println("Encerrando...");
			break;
		default:
			System.out.println("Erro!");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		Livraria livro = new Livraria();
		int indice;
		
		do {
		System.out.println("Digite 1 para CADASTRAR um novo livro.");
		System.out.println("Digite 2 para VISUALIZAR os livros.");
		System.out.println("Digite 3 para RENOMEAR os livros.");
		System.out.println("Digite 4 para REMOVER os livros.");
		System.out.println("Digite 0 para sair");
		
		
		indice = lerDados.nextInt();
		menu(indice, livro, lerDados);
		
		} while (indice!=0);
	}
}
