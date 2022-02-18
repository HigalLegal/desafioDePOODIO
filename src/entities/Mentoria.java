package entities;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;

	//--------------------------------
	
	public Mentoria() {}
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}
	
	//--------------------------------
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	//--------------------------------

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * 20;
	}
	
	@Override
	public String toString() {
		return "Título: " + this.getTitulo() + " || Descrição: " + this.getDescricao() + " || Data: " + data;
	}
	
	
}
