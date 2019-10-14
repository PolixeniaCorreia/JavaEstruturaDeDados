package com.poli.estruturadados.fila.teste;

import com.poli.estruturadados.fila.Fila;

public class aula21 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		fila.enfileira(12);
		fila.enfileira(20);
		fila.enfileira(15);
		fila.enfileira(100);

		System.out.println(fila.espiar());
		System.out.println(fila.toString());


	}

}
