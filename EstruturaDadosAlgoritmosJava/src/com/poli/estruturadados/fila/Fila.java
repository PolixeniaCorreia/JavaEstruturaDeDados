package com.poli.estruturadados.fila;

import com.poli.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho++;
		
		this.Adicionar(elemento);
	}

}
