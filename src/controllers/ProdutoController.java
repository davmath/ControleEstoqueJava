package controllers;

import java.util.ArrayList;
import models.Produto;

public class ProdutoController {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>(); 

	public static ArrayList<Produto> listar() {
		return produtos;
	}
	
	public static boolean deletar(String descricaoProduto) {
	    for(int i = 0; i < produtos.size(); i++)
	    {
	        Produto p = produtos.get(i);

	        if(p.getDescricaoProduto().equals(descricaoProduto))
	        {
	            produtos.remove(p);
	            return false;
	  	    }
	    }
	    return true;
	}
	
	
//	public static boolean alterar(int indice, Produto novoProduto){
//
//	    if(indice >= 0 && indice < produtos.size()){
//	    	
//	        produtos.set(indice, novoProduto);
//	    }
//		return false; 
//	}
//	
	public static boolean alterar(String descricaoProduto) {
	    for(int i = 0; i < produtos.size(); i++)
	    {
	        Produto p = produtos.get(i);

	        if(p.getDescricaoProduto().equals(descricaoProduto))
	        {
	        	produtos.set(i, p);
	            return false;
	  	    }
	    }
	    return true;
	}

	

	public static boolean cadastrar(Produto produto) {
		if(buscarPorDescricao(produto.getDescricaoProduto()) == null) {
			produtos.add(produto);
			return true;
		}
		return false;
	}	
	
	public static Produto buscarPorDescricao(String descricaoProduto) {
		for(Produto produtoCadastrado : produtos) {
			if(produtoCadastrado.getDescricaoProduto().equals(descricaoProduto)) {
				return produtoCadastrado;
			}
		}	
		return null;
	}
}