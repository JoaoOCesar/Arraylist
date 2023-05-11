package Principais;

import java.util.Scanner;
import entidade2.*;

public class Main3 {

	public static void menu(int x, Agenda listaContatos, Scanner lerDados) {
		
		switch(x){
		case 1:
			Contato contato = new Contato();
			System.out.println("Digite o Nome do novo contato: ");
			contato.setNome(lerDados.next());
			
			System.out.println("Digite o Numero do novo contato: ");
			contato.setNumero(lerDados.nextInt());	
			
			listaContatos.adiconarContato(contato);
			break;
		case 2:
			System.out.println("Digite o indice do contato");
			int i = lerDados.nextInt();
			
			listaContatos.removerContato(i);
			System.out.println("contato removido com exito!");
			break;
		case 3:
			System.out.println("Digite o nome do contato:");
			String nome = lerDados.next();
			listaContatos.buscarContato(nome);
			break;
		case 4:

			listaContatos.listarContatos();
				
			break;
		case 5:
			System.out.println("Encerrando o programa...");
			break;
		default:
			System.out.println("Numero inesperado.");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		int x;
		Scanner lerDados = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		do {
			System.out.println("Digite 1 para adicionar um novo contato.");
			System.out.println("Digite 2 para remover um contato.");
			System.out.println("Digite 3 para buscar um contato.");
			System.out.println("Digite 4 para listar os contatos.");
			
			x=lerDados.nextInt();
			menu(x,agenda, lerDados);
			
		}while(x!=5);
		
	}
}
