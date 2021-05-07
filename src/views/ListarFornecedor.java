package views;

import controllers.FornecedorController;
import models.Fornecedor;

public class ListarFornecedor {
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));	
		System.out.println("\n-- LISTAR PRODUTOS --\n");
		for(Fornecedor fornecedorCadastrado : FornecedorController.listar()) {
			System.out.println(fornecedorCadastrado);
		}
	}
}
