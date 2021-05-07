package views;

import java.util.Scanner;

import controllers.FornecedorController;
	
public class DeletarFornecedor {
	private static Scanner sc = new Scanner(System.in);
		
	public static void remover() {
		System.out.println("\n".repeat(10));
		System.out.println("\n-- REMOVER FORNECEDOR --  \n");				
		System.out.print("Digite o nome do fornecedor que deseja deletar: ");	
		String nomeFornecedor = sc.nextLine();				
		if(!FornecedorController.deletar(nomeFornecedor)) {
			System.out.println("\nProduto deletado com sucesso!");
		}else {
			System.out.println("Erro ao Deletar! Produto Inexistente");
		}
	}
}
