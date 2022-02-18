package entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    //-----------------------------------------------------
    
    public Bootcamp() {}

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
    }
    
  //-----------------------------------------------------

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    
    //-----------------------------------------------------
    
    public void addDev (Dev dev) {
    	devsInscritos.add(dev);
    }
    
    public void addConteudo(Conteudo conteudo) {
    	conteudos.add(conteudo);
    }
    
    //-----------------------------------------------------

	@Override
	public int hashCode() {
		return Objects.hash(descricao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(nome, other.nome);
	}

	//-----------------------------------------------------
	
	@Override
	public String toString() {
		return nome + " || " + descricao;
	}

}
