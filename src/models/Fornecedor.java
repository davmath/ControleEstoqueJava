package models;

public class Fornecedor {
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	
	
	//Nome Fornecedor
	public void setNomeFornecedor(String nome) {
		this.nome = nome;
	}
	public String getNomeFornecedor() {
		return this.nome;
	}
	
	//CNPJ Fornecedor
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return this.cnpj;
	}
	
	//Telefone Fornecedor
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	//Email Fornecedor
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNomeFornecedor() + " | CNPJ: " + getCnpj() + " | Telefone: " + getTelefone() + " | Email: " + getEmail();
	}
	
	
	
}


