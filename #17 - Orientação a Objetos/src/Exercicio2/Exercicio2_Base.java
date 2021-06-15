package Exercicio2;

public class Exercicio2_Base {

	public String modelo;
	public Double peso;
	public int qtePassageiros;
	
	// Contructors

	public Exercicio2_Base(String modelo, Double peso, int qtePassageiros) {
		
		this.modelo = modelo;
		this.peso = peso;
		this.qtePassageiros = qtePassageiros;
		
	}
	
	public void printAviao() {
		
		System.out.println("\nO avi�o do modelo " + modelo
				+ " pesa " + peso
				+ " tem capassidade para " + qtePassageiros + " passageiro.");
		
	}
	
	// Get and Sets

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public int getQtePassageiros() {
		return qtePassageiros;
	}

	public void setQtePassageiros(int qtePassageiros) {
		this.qtePassageiros = qtePassageiros;
	};
	
	
	
}
