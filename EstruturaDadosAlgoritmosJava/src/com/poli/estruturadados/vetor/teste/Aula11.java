package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.Lista;


public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista(1);
		
		Contato c1 = new Contato("contato1","9.8888-5665","contato1@gmail.com");

		vetor.Adicionar(c1);
		
		System.out.println(vetor);
		
	} 

}
