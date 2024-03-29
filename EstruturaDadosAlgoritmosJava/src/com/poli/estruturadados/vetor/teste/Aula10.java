package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato1","9.8888-5555","contato1@gmail.com");
		Contato c2 = new Contato("Contato2","9.8888-6666","contato2@gmail.com");
		Contato c3 = new Contato("Contato3","9.8888-7777","contato3@gmail.com");
		
		Contato c4 = new Contato("Contato3","9.8888-7777","contato3@gmail.com");
		
		vetor.Adicionar(c1);
		vetor.Adicionar(c2);
		vetor.Adicionar(c3);
		
		System.out.println("Tamanho = " +vetor.tamanho());
		
		int pos = vetor.Busca(c4);
		
		if(pos > -1) {
			System.out.println("Elemento existe no vetor.");
		}else {
			System.out.println("Elemento não existe no vetor.");
		}
		
	}

}
