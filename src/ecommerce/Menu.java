package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_PURPLE_BACKGROUND);

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                E-COMMERCE                           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar novo Cliente               ");
			System.out.println("            2 - Cadastrar novo Produto               ");
			System.out.println("            3 - Acessar Loja                         ");
			System.out.println("            4 - Buscar Produtos                      ");
			System.out.println("            5 - Visualizar Carrinho                  ");
			System.out.println("            6 - Finalizar Compra                     ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			
			
			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println(Cores.TEXT_WHITE_BOLD +"\nE-COMMERCE - Obrigado pela Preferência!");
				sobre();
				
				leia.close();
				
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Cadastrar novo Cliente\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Cadastrar novo Produto\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Acessar Loja\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Buscar Produtos\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Visualizar Carrinho\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Finalizar Compra\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Sair\n\n");

					break;
				
				default:
					System.out.println(Cores.TEXT_WHITE + "\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:                                  ");
		System.out.println("Victor Santos - VictorSantos04@outlook.com.br              ");
		System.out.println("github.com/V1ctorSantos                                    ");
		System.out.println("***********************************************************");
	}



	}


