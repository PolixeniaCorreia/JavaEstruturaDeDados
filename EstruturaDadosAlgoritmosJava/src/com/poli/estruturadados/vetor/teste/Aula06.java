package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.Adicionar("12");
		vetor.Adicionar("23");
		vetor.Adicionar("4");
		
	System.out.println(vetor.Busca("12"));
	System.out.println(vetor.Busca("4"));
	System.out.println(vetor.Busca("120"));
		
	}

}
