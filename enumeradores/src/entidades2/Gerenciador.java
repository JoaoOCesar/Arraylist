package entidades2;

import java.util.ArrayList;

public class Gerenciador {
	private ArrayList<Livro> listaLivro;
	
	public Gerenciador() {
		listaLivro = new ArrayList<>();
	}
	
	public void cadastroLivros(Livro livro) {
		if(listaLivro.isEmpty()) {
			for(Livro l: listaLivro) {
				if(l.getTitulo().equals(livro)) {
					l.setQuantidadeAcervo(l.getQuantidadeAcervo()+livro.getQuantidadeAcervo());
					System.out.println("Quantidade do livro: " + l.getTitulo() + " atualizada! " + l.getQuantidadeAcervo() + "Livro(s) disponiveis no Acervo!" );
					break;
				}else {
					listaLivro.add(livro);
					break;
				}
			}
		}else {
			listaLivro.add(livro);
		}
	}
	
	
	public void disponibilidade(String nome) {
		for(Livro l: listaLivro) {
			if(l.getTitulo().equals(nome)){
				if(l.QuantidadeAcervo>=1) {
					System.out.printf("/nLivro disponivel para uso./nQuantidade disponivel no acervo: %d ", l.QuantidadeAcervo);
					break;
				}else {
					System.out.printf("/nNenhum exemplar do livro esta disponivel no momento! tente na proxima semana!");	
					break;
				}
			}
		}
		System.out.println("Livro nao cadastrado no acervo!");
	}
	
	public void emprestimoLivro(String nome) {
		for(Livro l: listaLivro) {
			if(l.getTitulo().equals(nome)){
				if(l.getQuantidadeAcervo()>=1) {
					l.setQuantidadeAcervo(l.getQuantidadeAcervo()-1);
				}else {
					System.out.println("Nenhum exemplar ");
				}
			}
		}
		System.out.println("Livro nao cadastrado no acervo!");		
	}
	
	
}
