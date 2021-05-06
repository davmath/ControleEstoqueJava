package controllers;
import java.util.ArrayList;
import models.Fornecedor;


public class FornecedorController {

	private static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	public static ArrayList<Fornecedor> listar() {
		return fornecedores;
	}
	
	public static boolean cadastrar(Fornecedor fornecedor) {
		if(buscarPorNome(fornecedor.getNomeFornecedor()) == null) {
			fornecedores.add(fornecedor);
			return true;
		}
		return false;
	}	
	
	public static Fornecedor buscarPorNome(String nome) {
		for(Fornecedor fornecedorCadastrado : fornecedores) {
			if(fornecedorCadastrado.getNomeFornecedor().equals(nome)) {
				return fornecedorCadastrado;
			}
		}
		return null;
	}
}
