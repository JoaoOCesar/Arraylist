package entidades3;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> listaDeProdutos;
	
	public Loja() {
		listaDeProdutos = new ArrayList<>();
	}
	
	public void adicionaProduto(Produto produto) {
		listaDeProdutos.add(produto);
	}
	
	public void verificaProduto() {
		if(listaDeProdutos.isEmpty()) {
			System.out.println("Nenhum produto adicionado ao carrinho!");
		}else {
			System.out.println(listaDeProdutos.size() + " produto(s) no carrinho!");
		}
	}
	
}
