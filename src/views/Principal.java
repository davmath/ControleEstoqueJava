package views;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;		
		do {
			System.out.println("\n-- CONTROLE DE ESTOQUE --\n");
			//PRODUTO
			System.out.println("-PRODUTOS-");
			System.out.println("1 - Cadastro de produtos");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Deletar produtos");
			System.out.println("4 - Editar produtos");
			//FORNECEDOR
			System.out.println("-FORNECEDOR-");
			System.out.println("5 - Cadastro fornecedor");
			System.out.println("6 - Listar fornecedores");
			System.out.println("7 - Deletar fornecedores");
			System.out.println("8 - Editar fornecedores");
			//ENTRADA
			System.out.println("-ENTRADA DE PRODUTOS-");
			System.out.println("9 - Entrada de produto");
			System.out.println("11 - Consultar entrada de produtos");
			//SAIDA
			System.out.println("-SA�DA DE PRODUTOS-");
			System.out.println("10 - Sa�da de produtos");
			System.out.println("11 - Consultar sa�da de produtos");
			//ESTOQUE
			System.out.println("-ESTOQUE ATUAL-");
			System.out.println("12 - Consultar estoque atual");
			//SAIR
			System.out.println("0 - Sair");
			System.out.println("\nDigite a op��o desejada:");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				CadastrarProduto.renderizar();
				break;
			case 2:	
				ListarProdutos.renderizar();
				break;
			case 3:
				DeletarProduto.remover();
				break;
			case 4:	
//				EditarProduto.alterar();
				break;
			case 5:	
				CadastrarFornecedor.renderizar();
				break;
			case 6:
				ListarFornecedor.renderizar();
				break;
			case 7:
				DeletarFornecedor.remover();
				break;
			case 8:	
				break;
			case 9:	
				EntrarProduto.renderizar();
				break;
			case 10:	
				break;
			case 11:	
				ConsultarEntrada.renderizar();
				break;
			case 12:	
				break;
			case 0:		
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\n-- OP��O INV�LIDA!!! --\n");		
				break;
			}
		} while (opcao != 0);		
		sc.close();
	}
}