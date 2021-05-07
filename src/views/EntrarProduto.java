package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.EntradaController;
import controllers.ProdutoController;
import controllers.FornecedorController;

import models.Fornecedor;
import models.Produto;
import models.Entrada;

public class EntrarProduto {
	private static Scanner sc = new Scanner(System.in);
	private static Entrada entrada;
	private static Fornecedor fornecedor;
	private static Produto produto;
	private static ArrayList<Entrada> entradas;

	
	private static String descricaoProduto, nomeFornecedor, opcao;

	public static void renderizar() {
		entrada = new Entrada();
		fornecedor = new Fornecedor();
		produto = new Produto();
		entradas = new ArrayList<Entrada>();
		
		System.out.println("\n".repeat(10));
		System.out.println("\n-- ENTRADA DE PRODUTO --");
		//Produto
		System.out.println("\nInforme o produto: ");
		descricaoProduto = sc.next();
		produto = ProdutoController.buscarPorDescricao(descricaoProduto);
		if(produto !=null) {
			entrada.setFornecedor(fornecedor);
			//Fornecedor
			System.out.println("\nInforme o fornecedor: ");
			nomeFornecedor = sc.next();
			fornecedor = FornecedorController.buscarPorNome(nomeFornecedor);
			if(fornecedor != null) {
				//Produtos
				do {
					entrada = new Entrada();
					produto = new Produto();
					entrada.setQuantidade(entrada);
					System.out.println("\nDigite a quantidade a ser adicionada: ");
					entrada.setQuantidade(sc.nextInt());
					entrada = EntradaController.buscarPorProduto(produto);

					entradas.add(entrada);
					System.out.println("\nDeseja adicionar mais produtos?(Y/N)");
				}while(opcao.equals("Y"));
			}
			else {
				System.out.println("Esse fornecedor não existe.");
			}
		}
		else {
			System.out.println("Esse produto não existe.");
		}
		
	}
	
	
}
