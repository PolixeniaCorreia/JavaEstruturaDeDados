package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);

		vetor.Adicionar("B");
		vetor.Adicionar("C");
		vetor.Adicionar("E");
		vetor.Adicionar("F");
		vetor.Adicionar("G");
		
		System.out.println(vetor);
		vetor.Remover(1);
		System.out.println(vetor);
	}

}
