package com.poli.estruturadados.vetor.teste;

import com.poli.estruturadados.vetor.Lista;

public class Exer03 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<>(5);
		
		lista.Adicionar("A");
		lista.Adicionar("B");
		lista.Adicionar("C");
		lista.Adicionar("D");
		lista.Adicionar("E");
		
		System.out.println(lista);
		
		lista.Remover("A");
		
		System.out.println(lista);
		
		lista.Remover("E");
		
		System.out.println(lista);
		
		lista.Remover("C");
		
		System.out.println(lista);
		
	}

}
