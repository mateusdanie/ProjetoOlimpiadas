package Main;

import java.util.Scanner;

import Classes.Atleta;
import Classes.ComiteOlimpico;
import Classes.Equipe;

public class Main {

	public static void menuPrincipal() {
		System.out.println("[1] Gerenciar Comitê...........");
		System.out.println("[2] Gerenciar Confederação.....");
		System.out.println("[3] Gerenciar Equipe...........");
		System.out.println("[4] Gerenciar Atleta...........");
		System.out.println("[5] Gerenciar Comissão Técnica.");
		System.out.println("[0] SAIR.......................");
	}

	public static void menu(String nome) {
		System.out.println("[1] Adicionar " + nome + ".");
		System.out.println("[2] Remover " + nome + ".");
		System.out.println("[3] Alterar " + nome + ".");
		System.out.println("[4] Listar " + nome + ".");
		System.out.println("[5] Buscar " + nome + ".");
		System.out.println("[0] SAIR.                  ");
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (true) {
			menuPrincipal();

			System.out.println("Entre com um opção: ");
			int opcao = entrada.nextInt();
			entrada.nextLine();

			if (opcao == 0)
				break;

			switch (opcao) {
				case 1:

					do {
						menu("Comitê");
						System.out.println("Entre com um opção: ");
						opcao = entrada.nextInt();
						entrada.nextLine();

						switch (opcao) {
							case 1:
								ComiteOlimpico.adicionarComite(entrada);
								break;
							case 2:
								ComiteOlimpico.removerComite(entrada);
								//
								break;
							case 3:
								break;
							case 4:
								ComiteOlimpico.listarDados();
								break;
							case 5:
								//
								break;
							default:
								//
						}

					} while (opcao != 0);

					break;
				case 2:

					do {
						menu("Confederação");

						System.out.println("Entre com um opção: ");
						opcao = entrada.nextInt();
						entrada.nextLine();

						switch (opcao) {
							case 1:
								Confederacao.adicionar(entrada);
								break;
							case 2:
								Confederacao.remover(entrada);
								break;
							case 3:
								//
								break;
							case 4:
								Confederacao.listar(entrada);
								break;
							case 5:
								//
								break;
							default:

						}

					} while (opcao != 0);
					break;
				case 3:
					do {
						menu("Equipe");

						System.out.println("Entre com um opção: ");
						opcao = entrada.nextInt();
						entrada.nextLine();

						switch (opcao) {
							case 1:
								Equipe.adicionar(entrada);
								break;
							case 2:
								Equipe.remover(entrada);
								break;
							case 3:
								//
								break;
							case 4:
								Equipe.listar();
								break;
							case 5:
								//
								break;
							default:

						}

					} while (opcao != 0);
					break;
				case 4:
					do {
						menu("Atleta");

						System.out.println("Entre com um opção: ");
						opcao = entrada.nextInt();
						entrada.nextLine();

						switch (opcao) {
							case 1:
								Atleta.adicionar(entrada);
								break;
							case 2:
								//
								break;
							case 3:
								//
								break;
							case 4:
								//
								break;
							case 5:
								//
								break;
							default:

						}

					} while (opcao != 0);
					break;
				case 5:
					do {
						menu("Comissão Técnica");

						System.out.println("Entre com um opção: ");
						opcao = entrada.nextInt();
						entrada.nextLine();

						switch (opcao) {
							case 1:
								//
								break;
							case 2:
								//
								break;
							case 3:
								//
								break;
							case 4:
								//
								break;
							case 5:
								//
								break;
							default:

						}

					} while (opcao != 0);
					break;
			}
		}
		entrada.close();
	}
}
