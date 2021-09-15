package br.com.generation.collections;

public class Produto {
	private String nproduto = "";
	private double preco = 0.0;
	
	
	public Produto(String nproduto, double preco) {
		super();
		this.nproduto = nproduto;
		this.preco = preco;
	}
	
	
	public String getNproduto() {
		return nproduto;
	}
	public void setNproduto(String nproduto) {
		this.nproduto = nproduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
