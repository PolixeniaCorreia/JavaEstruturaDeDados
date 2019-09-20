package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.Adicionar("B");
		vetor.Adicionar("C");
		vetor.Adicionar("E");
		vetor.Adicionar("F");
		vetor.Adicionar("G");

		System.out.println(vetor);
		vetor.Adicionar(0, "A");
		System.out.println(vetor);	
		vetor.Adicionar(3, "D");
		System.out.println(vetor);
	}	

}
