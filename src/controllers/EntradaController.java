package controllers;

import java.util.ArrayList;

import models.Entrada;
import models.Produto;

public class EntradaController {
	
	private static ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	
	public static ArrayList<Entrada> listar(){
		return entradas;
	}

	public static boolean cadastrar(Entrada entrada) {
		if(buscarPorProduto(entrada.getProduto())== null) {
			entradas.add(entrada);
			return true;			
		}
		return false;
	}
	
	public static Entrada buscarPorProduto(Produto produto) {
		for(Entrada entradaCadastrada : entradas) {
			if(entradaCadastrada.getProduto().equals(produto)) {
				return entradaCadastrada;
			}
		}
		return null;
	}
}