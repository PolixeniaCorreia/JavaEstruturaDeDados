package com.poli.estruturadados.fila.teste;

import com.poli.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();
	
		fila.enfileira(new Paciente ("A", 2));
		fila.enfileira(new Paciente ("B", 3));
		fila.enfileira(new Paciente ("C", 1));

		System.out.println(fila);	

		System.out.println(fila.desenfileira());
		
		System.out.println(fila);
	}

}
