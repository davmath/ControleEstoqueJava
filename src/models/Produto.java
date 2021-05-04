package models;

import java.util.Date;

public class Produto {
	
	public Produto() {
		setCriadoEm(new Date());
	}

	private String descricaoProduto;
	private String unidadeMedida;
	private Date criadoEm;
	
	public String getDesscricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
		
		
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Descrição: " + getDesscricaoProduto() + " | Unidade de Medida: " + getUnidadeMedida() + " | Criado em: " + getCriadoEm();
	}
	
}