package entities;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	//------------------------------------------
	
	public Curso() {}
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
	}
	
	//------------------------------------

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//------------------------------------

	@Override
	public double calcularXP() {
		
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "T�tulo: " + this.getTitulo() + " || Descri��o: " + this.getDescricao() + " || Carga hor�ria: " + cargaHoraria;
	}
	
	
	
}
