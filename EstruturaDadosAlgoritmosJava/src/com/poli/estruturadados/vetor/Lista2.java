package com.poli.estruturadados.vetor;

import com.poli.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{

	public Lista2() {
		super();
	}

	public Lista2(int capacidade) {
		super(capacidade);
	}

	public boolean adiciona(T elemento) {
		return super.Adicionar(elemento);
	}

	public boolean adiciona(int posicao, T elemento) {
		return super.Adicionar(posicao, elemento);
	}
}
