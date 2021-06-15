package Exercicio_2;

public abstract class Animal {
		
	public String name;
	public int idade;
	
	
	public Animal(String name, int idade) {
		
		this.name = getName(name);
		this.idade = getIdade(idade);
		
	};
	
		
	public String getName(String name) {
		
		return name;
		
	};
	
	public int getIdade(int idade) {
		
		return idade;
		
	};
	
		
	public void setName(String name) {
		
		this.name = name;
		
	};
	
	public void setIdade(int idade) {
		
		this.idade = idade;
		
	};
	
	public void printAnimal() {
		
		System.out.println("\nO nome do animal é: " + name
		+ " e a sua idade é: " + idade);
		
	};
	
		
	abstract public void somAnimal();
	abstract public void andaAnimal();
	abstract public void tipoPeleAnimal();

}
