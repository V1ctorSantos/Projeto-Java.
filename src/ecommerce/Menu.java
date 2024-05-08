package ecommerce;
import ecommerce.model.Cliente;
import ecommerce.model.Produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.util.Cores;

public class Menu {

	private static Object keypress2;

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

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
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
				    
				    keypress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Cadastrar novo Produto\n\n");
					keypress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Acessar Loja\n\n");
					keypress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Buscar Produtos\n\n");
					keypress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Visualizar Carrinho\n\n");
					keypress();
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Finalizar Compra\n\n");
					keypress();
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Sair\n\n");
					keypress();
					break;
				
				default:
					System.out.println(Cores.TEXT_WHITE + "\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	private static void keypress() {
		// TODO Auto-generated method stub
		
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:                                  ");
		System.out.println("Victor Santos - VictorSantos04@outlook.com.br              ");
		System.out.println("github.com/V1ctorSantos                                    ");
		System.out.println("***********************************************************");
	}
		
		public static void keyPress() {

			try {

				System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");
			}
	}
	

		}


