package entidades2;

public class Livro {
	private String titulo;
	private String autor;
	private TipoLivro genero;
	private int quantidadeAcervo;
	public int QuantidadeAcervo;
	
	public Livro(String titulo, String autor, TipoLivro genero, int quantidadeAcervo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.quantidadeAcervo = quantidadeAcervo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public TipoLivro getGenero() {
		return genero;
	}

	public void setGenero(TipoLivro genero) {
		this.genero = genero;
	}

	public int getQuantidadeAcervo() {
		return quantidadeAcervo;
	}

	public void setQuantidadeAcervo(int quantidadeAcervo) {
		this.quantidadeAcervo = quantidadeAcervo;
	}
	
	
	
}
