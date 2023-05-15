package entidades2;

public enum TipoLivro {
	ROMANCE("Romance"),
	FICCAO_CIENTIFICA("Ficção Científica"),
	AVENTURA("Aventura"),
	TUTORIAL("Tutorial");
	
	private String descricao;
	
	TipoLivro(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
