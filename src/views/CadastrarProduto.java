  
package views;

import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class CadastrarProduto {
	
	private static Produto produto;	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		produto = new Produto();
		System.out.println("\n".repeat(10));
		System.out.println("\n-- CADASTRAR PRODUTO --  \n");				
		System.out.print("Digite a descrição do produto: ");	
		produto.setDescricaoProduto(sc.next());					
		System.out.print("Digite a unidade de medida do produto: ");	
		produto.setUnidadeMedida(sc.next());

		if(ProdutoController.cadastrar(produto)) {
			System.out.println("\nProduto cadastrado com sucesso!");
		}else {
			System.out.println("Esse produto já existe!");
		}
	}
}
