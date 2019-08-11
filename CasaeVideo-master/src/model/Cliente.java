package model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String referenciaBancaria;
	private boolean compraRealizada;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getReferenciaBancaria() {
		return referenciaBancaria;
	}
	public void setReferenciaBancaria(String referenciaBancaria) {
		this.referenciaBancaria = referenciaBancaria;
	}
	public boolean isCompraRealizada() {
		
		return compraRealizada;
	}
	
	public void setCompraRealizada(boolean compraRealizada) {
		this.compraRealizada = compraRealizada;
	}
	

}
