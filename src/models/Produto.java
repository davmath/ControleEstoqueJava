package models;



public class Produto {
	
	private String descricaoProduto;
	private String unidadeMedida;
	
	
	public String getDescricaoProduto() {
		return descricaoProduto;
	}


	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}


	public String getUnidadeMedida() {
		return unidadeMedida;
	}


	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	

	@Override
	public String toString() {
		return "Descrição: " + getDescricaoProduto() + " | Unidade de Medida: " + getUnidadeMedida();
	}
	
}