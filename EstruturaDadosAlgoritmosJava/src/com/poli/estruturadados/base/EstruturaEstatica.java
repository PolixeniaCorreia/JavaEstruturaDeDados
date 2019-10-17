package com.poli.estruturadados.base;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	public EstruturaEstatica(){
		this(10);
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	protected boolean Adicionar(T elemento){

		AumentaCapacidade();

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

			return true;
		}
		return false;
	}

	protected boolean Adicionar(int posicao, T elemento){

		if (posicao < 0 || posicao > tamanho){
			throw new IllegalArgumentException("Posição ISnválida");
		}

		AumentaCapacidade();

		
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	public void remove(int posicao){

		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}

		for (int i = posicao; i < tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}

		tamanho--;
	}

	private void AumentaCapacidade() {
		if(tamanho == elementos.length) {
			T novosElementos[] = (T[]) new Object [elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				novosElementos[i] = elementos[i];
			}
			elementos = novosElementos;
		}
	}

	public int tamanho() {
		return this.tamanho;
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
