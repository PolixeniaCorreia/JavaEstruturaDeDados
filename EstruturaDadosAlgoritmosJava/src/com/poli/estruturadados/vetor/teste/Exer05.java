package com.poli.estruturadados.vetor.teste;

import java.util.ArrayList;

import com.poli.estruturadados.vetor.Lista;

public class Exer05 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayLista = new ArrayList<>(5);
		
		arrayLista.add("A");
		arrayLista.add("B");
		arrayLista.add("C");
		arrayLista.add("D");
		arrayLista.add("E");
		
		System.out.println(arrayLista);
		
		arrayLista.clear();
		System.out.println(arrayLista); 
		
		Lista<String> lista = new Lista<>(5);

		lista.Adicionar("A");
		lista.Adicionar("B");
		lista.Adicionar("C");
		lista.Adicionar("D");
		lista.Adicionar("E");
		
		System.out.println(lista);
		
		lista.Limpar();
		
		System.out.println(lista);
		
	}

}
