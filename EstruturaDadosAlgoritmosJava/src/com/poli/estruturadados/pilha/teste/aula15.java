package com.poli.estruturadados.pilha.teste;

import com.poli.estruturadados.pilha.Pilha;

public class aula15 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());

		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());
		
		
	}

}
