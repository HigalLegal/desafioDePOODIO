package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import exceptions.SemMatriculaException;

public class Dev {
	
	private Integer id;
	private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    //---------------------------------
    
    public Dev() {}

	public Dev(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	//---------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	
	public void seInscrever(Conteudo conteudo) {
		conteudosInscritos.add(conteudo);
	}
	
	//---------------------------------
	
	public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
	
	public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            throw new SemMatriculaException("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
    	return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }
	
	//---------------------------------

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(id, other.id);
	}
	
	//---------------------------------
	
	@Override
	public String toString() {
		return "Dev: " + nome;
	}

}
