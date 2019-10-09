package com.poli.estruturadados.pilha.labs;

import java.util.Scanner;

import com.poli.estruturadados.pilha.Pilha;

public class Exer02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<>();
		Pilha<Integer> impar = new Pilha<>();

		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			
			System.out.println("Entre cm um número: ");
			
			int num = scan.nextInt();

			if(num == 0) {

				Integer desempilhado = par.desempilha();

				if(desempilhado == null) {
					System.out.println("Pilha par vazia");
				}else {
					System.out.println("Desempilhando pilha par: " +desempilhado);
				}

				desempilhado = impar.desempilha();

				if(desempilhado == null) {
					System.out.println("Pilha ímpar vazia");
				}else {
					System.out.println("Desempilhando pilha ímpar: " +desempilhado);
				}

			}else if(num % 2 == 0) {

				System.out.println("Número par, empilhando na pilha par: " +num);
				par.empilha(num);

			}else {

				System.out.println("Número ímpar, empilhando na pilha ímpar: " +num);
				impar.empilha(num);

			}
		}

		System.out.println("Desempilhando todos os números da pilha par: ");

		while (!par.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " +par.desempilha());	
		}
		
		System.out.println("Desempilhando todos os números da pilha ímpar: ");

		while (!impar.estaVazia()) {
			System.out.println("Desempilhando da pilha ímpar: " +impar.desempilha());	
		}
	}

}
