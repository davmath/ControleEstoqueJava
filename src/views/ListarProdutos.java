package views;

import controllers.ProdutoController;
import models.Produto;

public class ListarProdutos {
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));	
		System.out.println("\n-- LISTAR PRODUTOS --\n");
		for(Produto produtoCadastrado : ProdutoController.listar()) {
			System.out.println(produtoCadastrado);
		}
	}
	
}
