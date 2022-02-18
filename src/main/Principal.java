package main;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;
import exceptions.SemMatriculaException;

public class Principal {
	
	public static void main(String[] args) {
        
		try {
			Curso curso1 = new Curso();
	        curso1.setTitulo("curso java");
	        curso1.setDescricao("descri��o curso java");
	        curso1.setCargaHoraria(8);

	        Curso curso2 = new Curso();
	        curso2.setTitulo("curso js");
	        curso2.setDescricao("descri��o curso js");
	        curso2.setCargaHoraria(4);

	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitulo("mentoria de java");
	        mentoria.setDescricao("descri��o mentoria java");
	        mentoria.setData(LocalDate.now());

	        Bootcamp bootcamp = new Bootcamp();
	        bootcamp.setNome("Bootcamp Java Developer");
	        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
	        bootcamp.getConteudos().add(curso1);
	        bootcamp.getConteudos().add(curso2);
	        bootcamp.getConteudos().add(mentoria);

	        Dev devCamila = new Dev();
	        devCamila.setNome("Camila");
	        devCamila.inscreverBootcamp(bootcamp);
	        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        devCamila.progredir();
	        devCamila.progredir();
	        System.out.println("-");
	        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());
	        System.out.println("XP:" + devCamila.calcularTotalXp());

	        System.out.println("-------");

	        Dev devJoao = new Dev();
	        devJoao.setNome("Joao");
	        devJoao.inscreverBootcamp(bootcamp);
	        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
	        devJoao.progredir();
	        devJoao.progredir();
	        devJoao.progredir();
	        System.out.println("-");
	        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
	        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
	        System.out.println("XP:" + devJoao.calcularTotalXp());
		} catch(SemMatriculaException e) {
			System.out.println(e.getMessage());
		}

    }

}
