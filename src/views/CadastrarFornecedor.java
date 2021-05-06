package views;

import java.util.Scanner;

import controllers.FornecedorController;
import models.Fornecedor;

public class CadastrarFornecedor {
	
	private static Fornecedor fornecedor;	
	private static Scanner sc = new Scanner(System.in);
	public static void renderizar() {
		fornecedor = new Fornecedor();
		System.out.println("\n".repeat(10));
		System.out.println("\n-- CADASTRAR PRODUTO --  \n");				
		System.out.print("Digite o nome do fornecedor: ");	
		fornecedor.setNomeFornecedor(sc.next());					
		System.out.print("Digite o CNPJ: ");	
		fornecedor.setCnpj(sc.next());
		System.out.print("Digite o telefone: ");	
		fornecedor.setTelefone(sc.next());
		System.out.print("Digite o email: ");	
		fornecedor.setEmail(sc.next());
		

		if(FornecedorController.cadastrar(fornecedor)) {
			System.out.println("\nFornecedor cadastrado com sucesso!");
		}else {
			System.out.println("Esse fornecedor já existe!");
		}
	}
}
