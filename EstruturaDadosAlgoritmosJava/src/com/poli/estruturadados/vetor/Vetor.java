package com.poli.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String [] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		tamanho = 0;
	}
	
//	public void Adicionar(String elemento) {
//		
//		for(int i = 0; i < this.elementos.length; i++) {
//			
//			if(this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				
//				System.out.println("" +elementos[i]);
//				
//				break;
//			}
//		}
//	}
	
//	public void Adicionar(String elemento) throws Exception {
//		
//		if(this.tamanho < this.elementos.length) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;
//			System.out.println("" +elementos[2]);
//			
//		}else {
//			throw new Exception("Não é possível adcionar mais elementos");
//		}		
//	}
	
	public boolean Adicionar(String elemento){
		
		AumentaCapacidade();
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
//			System.out.println(""+this.elementos[this.tamanho]);
			this.tamanho++;
			
		return true;
		}
		return false;
	}
	
	public boolean Adicionar(int posicao, String elemento){
		
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
			String novosElementos[] = new String [elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				novosElementos[i] = elementos[i];
			}
			elementos = novosElementos;
		}
	}
	
	public String Busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA!!!");
		}
	
		return this.elementos[posicao];
	}
	
	public int Busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return i;
			}
				
	  	}
		return -1;
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
