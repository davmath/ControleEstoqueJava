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

	
	private static String descricaoProduto, nomeFornecedor;

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
		
		//Fornecedor
		System.out.println("\nInforme o fornecedor: ");
		nomeFornecedor = sc.next();
		fornecedor = FornecedorController.buscarPorNome(nomeFornecedor);
		
		//Quantidade
		if(produto != null && fornecedor !=null) {
			entrada.setProduto(produto);
			entrada.setFornecedor(fornecedor);
			System.out.print("Informe a quantidade: ");
			entrada.setQuantidade(sc.nextInt());
			entradas.add(entrada);
			
			//Lote
			System.out.println("Informe o lote: ");
			entrada.setLote(sc.next());
			entradas.add(entrada);
			
			//Valor
			System.out.println("Informe o valor: ");
			entrada.setValor(sc.nextDouble());
			entradas.add(entrada);
		

			if(EntradaController.cadastrar(entrada)) {
				System.out.println("\nEntrada do produto efetuada com sucesso!");
			}else {
				System.out.println("Erro ao dar entrada!");
			}
		}
		

	}
	
	
}
