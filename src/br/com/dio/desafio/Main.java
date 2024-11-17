package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em Java");
		mentoria.setDescricao("Descrição Mentoria em Java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFelipe = new Dev();
		devFelipe.setNome("Felipe");
		devFelipe.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos por Felipe: " + devFelipe.getConteudosInscritos());
		devFelipe.progredir();
		devFelipe.progredir();
		System.out.println("Conteúdos concluídos por Felipe: " + devFelipe.getConteudosConcluidos());
		System.out.println("Conteúdos inscritos por Felipe: " + devFelipe.getConteudosInscritos());
		System.out.println("XP: " + devFelipe.calcularXpTotal());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos por João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteúdos concluídos por João: " + devJoao.getConteudosConcluidos());
		System.out.println("Conteúdos inscritos por João: " + devJoao.getConteudosInscritos());
		System.out.println("XP: " + devJoao.calcularXpTotal());
	}
}
