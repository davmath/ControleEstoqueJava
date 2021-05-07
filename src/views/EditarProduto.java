//package views;
//
//import java.util.Scanner;
//
//import controllers.ProdutoController;
//
//public class EditarProduto {
//	
//	private static Scanner sc = new Scanner(System.in);
//
//	public static void alterar() {
//		System.out.println("\n".repeat(10));
//		System.out.println("\n-- ALTERAR PRODUTO --  \n");				
//		System.out.print("Digite a descri��o do produto que deseja deletar: ");	
//		String descricaoProduto = sc.nextLine();
//		System.out.print("Digite o novo Nome: ");
//		String novoProduto = sc.nextLine();
//		if(!ProdutoController.alterar(descricaoProduto, novoProduto)){
//			System.out.println("\nProduto alterado com sucesso!");
//		}else{
//			System.out.println("Erro ao Deletar! Produto Inexistente");
//		}
//	}
//}
