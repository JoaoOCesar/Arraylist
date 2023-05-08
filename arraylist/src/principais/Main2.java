package principais;

import java.util.Scanner;

import entidades3.*;

public class Main2 {
	
	public static void menu(int i, Loja loja, Scanner lerDados) {
		
		switch(i) {
		case 1:
			System.out.println("Digite o nome do produto: ");
			String nome = lerDados.next();
			Produto produto = new Produto(nome);
			loja.adicionaProduto(produto);
			break;
		case 2:
			loja.verificaProduto();
			break;
		case 3:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("ERRO");
			break;
		}
	}
	
	public static void main(String[] args) {
		int i;
		Scanner lerDados = new Scanner(System.in);
		Loja loja = new Loja();
		
		do {
			System.out.println("Digite 1 para adicionar um produto ao carrinho");
			System.out.println("Digite 2 para verificar o carrinho");
			System.out.println("Digite 3 para sair");
			
			i = lerDados.nextInt();
			menu(i,loja,lerDados);
		}while(i!=3);
		
		
	}
}
