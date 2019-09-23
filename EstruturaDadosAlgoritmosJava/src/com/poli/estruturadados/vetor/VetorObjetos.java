package com.poli.estruturadados.vetor;

public class VetorObjetos {

	private Object [] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		tamanho = 0;
	}

	public boolean Adicionar(Object elemento){

		AumentaCapacidade();

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			//		System.out.println(""+this.elementos[this.tamanho]);
			this.tamanho++;

			return true;
		}
		return false;
	}

	public boolean Adicionar(int posicao, Object elemento){

		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!!!");
		}

		AumentaCapacidade(); 

		for(int i = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];	
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true  ;
	}

	public int tamanho() {
		return this.tamanho;
	}

	private void AumentaCapacidade() {
		if(tamanho == elementos.length) {
			Object novosElementos[] = new Object [elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				novosElementos[i] = elementos[i];
			}
			elementos = novosElementos;
		}
	}

	public Object Busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!!!");
		}

		return this.elementos[posicao];
	}

	public int Busca(Object elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return i;
			}

		}
		return -1;
	}

	public void Remover(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!!!");
		}
		for(int i = posicao; i < tamanho-1; i++) {
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}

	@Override
	public String toString(){

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");

		return s.toString(); 

	}

}
