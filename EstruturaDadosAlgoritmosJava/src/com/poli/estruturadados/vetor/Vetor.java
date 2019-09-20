package com.poli.estruturadados.vetor;

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
			System.out.println(" " +this.elementos[this.tamanho]);
			this.tamanho++;
			
		return true;
		}
		return false;
	}
}
