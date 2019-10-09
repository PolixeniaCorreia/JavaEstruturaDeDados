package com.poli.estruturadados.pilha.teste;

import java.util.Stack;

import com.poli.estruturadados.pilha.Pilha;

public class aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
			

	}

}
