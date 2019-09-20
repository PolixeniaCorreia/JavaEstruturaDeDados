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
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			System.out.println(""+this.elementos[this.tamanho]);
			this.tamanho++;
			
		return true;
		}
		return false;
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
