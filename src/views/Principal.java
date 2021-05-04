package views;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;		
		do {
			System.out.println("\n-- CONTROLE DE ESTOQUE --\n");
			System.out.println("1 - Entrada de produto");
			System.out.println("2 - Saída de produtos");
			System.out.println("3 - Cadastro fornecedor");
			System.out.println("4 - Consultar entrada e saída de produtos");
			System.out.println("5 - Consultar estoque atual");
			System.out.println("6 - Cadastro de produtos");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada:");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				break;
			case 2:	
				break;
			case 3:	
				break;
			case 4:	
				break;
			case 5:	
				break;
			case 6:	
				CadastrarProduto.renderizar();
				break;	
			case 0:		
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\n-- OPÇÃO INVÁLIDA!!! --\n");		
				break;
			}
		} while (opcao != 0);		
		sc.close();
	}
}