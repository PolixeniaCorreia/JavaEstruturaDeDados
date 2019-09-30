package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.Lista;

public class Exer04 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<>(5);

		lista.Adicionar("A");
		lista.Adicionar("B");
		lista.Adicionar("C");
		lista.Adicionar("D");
		lista.Adicionar("E");

		System.out.println(lista.Obtem(0));
		System.out.println(lista.Obtem(2));
		System.out.println(lista.Obtem(4));
		
	}

}
