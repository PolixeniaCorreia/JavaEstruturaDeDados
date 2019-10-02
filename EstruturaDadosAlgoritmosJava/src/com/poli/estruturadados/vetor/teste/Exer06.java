package com.poli.estruturadados.vetor.teste;

import java.util.Scanner;

import com.poli.estruturadados.vetor.Lista;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lista<Contato> lista = new Lista<Contato>(20);

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


	private static void adcionarContatoFinal(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Digite o nome", scan);
		String telefone = leInformacao("Digite o telefone", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome,telefone,email);

		lista.Adicionar(contato);

		System.out.println("Contato adcionado com sucesso!");
		System.out.println(contato);

	}
	private static void imprimirVetor(Lista<Contato> lista) {
		
		System.out.println(lista);
	}


	private static void limparVetor(Lista<Contato> lista) {

		lista.Limpar();
		
		System.out.println("Todos os contatos do vetor foram excluidos");
	}

	private static void imprimeTamanhoVetor(Lista<Contato> lista) {

		System.out.println("Tamanho do vetor é de: " +lista.tamanho());
	}

	private static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser removida", scan);

		try {

			Contato contato = lista.Busca(pos);

			lista.Remover(contato);

			System.out.println("Contato excluído");


		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser removida", scan);

		try {

			lista.Remover(pos);

			System.out.println("Contato excluído");


		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.Busca(pos);

			boolean existe = lista.Contem(contato);

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

	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.Busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último indíce do contato encontrado:");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void obtemContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.Busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.Busca(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posição a ser pesquisada", scan);

		try {
			Contato contato = lista.Busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posiçao Inválida!");
		}
	}

	private static void adcionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Digite o nome", scan);
		String telefone = leInformacao("Digite o telefone", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome,telefone,email);

		int pos = leInformacaoInt("Digite a posição a adicionar o contato", scan);

		try {
			lista.Adicionar(pos, contato);

			System.out.println("Contato adcionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida, não Adicionado");
		}

	}

	private static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int leInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada inválida , digite novamente");
			}

		}

		return num;

	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String  entrada;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println();
			System.out.println("1: Adciona contato no final do vetor");
			System.out.println("2: Adciona contato em uma posição específica");
			System.out.println("3: Obtém contato em uma posiçao específica ");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice de ocntato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");	

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				}else {
					throw new Exception();
				}

			}catch(Exception e) {

				System.out.println("Entrada inválida, digite novamente \n \n ");

			}

		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;  

		for(int i = 1; i <= quantidade; i++) {

			contato = new Contato(); 

			contato.setNome("Contato "+i);
			contato.setNome("111111111 "+i);
			contato.setNome("contato"+i+"@email.com");

			lista.Adicionar(contato);

		}

	}

}
