package com.poli.estruturadados.vetor.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		criarContatosDinamicamente(5, lista);

		int opcao = 1;

		while (opcao != 0) {
			
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1:
				adcionarContatoFinal(scan, lista);
				break;
			case 2:
				adcionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;

			default:
				break;
			}
		}
		System.out.println("Usuário digitou 0, programa terminado.");


	}


	private static void adcionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Digite o nome", scan);
		String telefone = leInformacao("Digite o telefone", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome,telefone,email);

		lista.add(contato);

		System.out.println("Contato adcionado com sucesso!");
		System.out.println(contato);

	}
	private static void imprimirVetor(ArrayList<Contato> lista) {

		System.out.println(lista);
	}


	private static void limparVetor(ArrayList<Contato> lista) {

		lista.clear();

		System.out.println("Todos os contatos do vetor foram excluidos");
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

		System.out.println("Tamanho do vetor é de: " +lista.size());
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser removida", scan);

		try {

			Contato contato = lista.get(pos);

			lista.remove(contato);

			System.out.println("Contato excluído");


		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser removida", scan);

		try {

			lista.remove(pos);

			System.out.println("Contato excluído");


		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.get(pos);

			boolean existe = lista.contains(contato);

			if(existe) {
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			}else {

				System.out.println("Contato não existe.");
			}

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último indíce do contato encontrado:");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void adcionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Digite o nome", scan);
		String telefone = leInformacao("Digite o telefone", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome,telefone,email);

		int pos = leInformacaoInt("Digite a posição a adicionar o contato", scan);

		try {
			lista.add(pos, contato);

			System.out.println("Contato adcionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida, não Adicionado");
		}

	}
	
	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;  

		for(int i = 1; i <= quantidade; i++) {

			contato = new Contato(); 

			contato.setNome("Contato "+i);
			contato.setNome("111111111 "+i);
			contato.setNome("contato"+i+"@email.com");

			lista.add(contato);

		}

	}

}




