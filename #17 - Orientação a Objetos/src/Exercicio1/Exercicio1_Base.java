package Exercicio1;

public class Exercicio1_Base {

	private String nomeClient;
	private String nomeProduto;
	private Double precoProduto;
	private int idClient;
	
	
	public Exercicio1_Base(String nomeClient, String nomeProduto, Double precoProduto, int idClient) {
		
		this.nomeClient = nomeClient;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.idClient = idClient;
		
	}
	
	public void printClient() {
		
		System.out.println("\nCliente " + nomeClient
						+ " o seu produto "+ nomeProduto
						+ " est� com o valor de " + precoProduto + "R$ "
						+ "o numero do seu ID � " + idClient);
		
	}
	
	// Get and Set

	public String getNomeClient() {
		return nomeClient;
	}

	public void setNomeClient(String nomeClient) {
		this.nomeClient = nomeClient;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	};
	
	
	
	
}