package views;

import java.util.Scanner;

import controllers.ProdutoController;

public class DeletarProduto {
		
	private static Scanner sc = new Scanner(System.in);
	
	public static void remover() {
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REMOVER PRODUTO --  \n");				
		System.out.print("Digite a descri��o do produto que deseja deletar: ");	
		String descricaoProduto = sc.nextLine();				
		if(!ProdutoController.deletar(descricaoProduto)) {
			System.out.println("\nProduto deletado com sucesso!");
		}else {
			System.out.println("Erro ao Deletar! Produto Inexistente");
		}
	}
}
