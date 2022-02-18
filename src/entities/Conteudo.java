package entities;

import java.util.Objects;

public abstract class Conteudo {
	
	protected final double XP_PADRAO = 10;

	private String titulo;
	private String descricao;
	
	//------------------------------------
	
	public Conteudo() {}
	
	public Conteudo(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}

	//------------------------------------
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//------------------------------------
	
	public abstract double calcularXP();

	//------------------------------------
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteudo other = (Conteudo) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(titulo, other.titulo);
	}

	
	
}
