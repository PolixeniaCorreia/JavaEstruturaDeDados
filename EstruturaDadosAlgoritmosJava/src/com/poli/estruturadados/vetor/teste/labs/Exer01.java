package com.poli.estruturadados.vetor.teste.labs;

import com.poli.estruturadados.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);

		lista.Adicionar("A");
		lista.Adicionar("B");
		lista.Adicionar("C");
		
		System.out.println(lista.Contem("A"));
		System.out.println(lista.Contem("B"));
		System.out.println(lista.Contem("E"));
		
		
		
	}

}
