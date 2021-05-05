package controllers;

import java.util.ArrayList;

import models.Produto;

public class ProdutoController {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>(); 

	public static ArrayList<Produto> listar() {
		return produtos;
	}

	public static boolean cadastrar(Produto produto) {
		if(buscarPorNome(produto.getDescricaoProduto()) == null) {
			produtos.add(produto);
			return true;
		}
		return false;
	}	
	
	public static Produto buscarPorNome(String descricaoProduto) {
		for(Produto produtoCadastrado : produtos) {
			if(produtoCadastrado.getDescricaoProduto().equals(descricaoProduto)) {
				return produtoCadastrado;
			}
		}	
		return null;
	}
}