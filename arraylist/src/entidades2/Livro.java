package entidades2;

public class Livro {
	private String nome;
	private int codigo;
	private String autor;
	private int qtdEstoque;

	public Livro(String nome, int codigo, String autor, int qtdEstoque) {
		this.nome = nome;
		this.codigo = codigo;
		this.autor = autor;
		this.qtdEstoque = qtdEstoque;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getQtdEstoque() {
		return this.qtdEstoque;
	}
	
	public void exibeLivros() {
		System.out.println("Nome do Livro: " + nome + ", Codigo de identificacao" + codigo + ", Nome do autor: " + this.autor + ", Quantidade em estoque: " + qtdEstoque	 );
	}
}
