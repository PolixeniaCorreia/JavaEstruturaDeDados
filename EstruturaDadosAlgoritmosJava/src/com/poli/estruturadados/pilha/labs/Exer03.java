package com.poli.estruturadados.pilha.labs;

import com.poli.estruturadados.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<>(20);

		Livro livro1 = new Livro();
		livro1.setNome("O Poder do Habito"); 
		livro1.setAutor("Charles Duhigg");
		livro1.setAnoLancamento("2016");
		livro1.setIsbn("kfo2563");

		Livro livro2 = new Livro();
		livro2.setNome("UML Metodologias e Ferramentas CASE"); 
		livro2.setAutor("Alberto Silva");
		livro2.setAnoLancamento("2018");
		livro2.setIsbn("kfo2562"); 

		Livro livro3 = new Livro();
		livro3.setNome("Engenharia de Software 7° Edição"); 
		livro3.setAutor("Roger S.Pressman");
		livro3.setAnoLancamento("2019");
		livro3.setIsbn("kfo2561");

		System.out.println("Pilha de livros criada, pilha está vazia? " +pilha.estaVazia());

		System.out.println("Empilhando livros na pilha");

		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);

		System.out.println(pilha.tamanho()+ "3 livros foram empilhados: ");
		System.out.println(pilha);

		System.out.println("Espiando o topo da pilha: " +pilha.topo());

		System.out.println("Desempilhando livros da pilha");

		while (!pilha.estaVazia()) {

			System.out.println("Desempilhando livro: " +pilha.desempilha());	
		}

		System.out.println("Todos os livros foram desempilhados, pilha vazia. " +pilha.estaVazia());

	}

}
