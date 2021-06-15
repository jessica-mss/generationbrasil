package Exercicio_2;

import java.util.Scanner;

public class VerificandoAnimais {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String name;
		int idade, op;
		
		System.out.println("\nQual animal voc� achou ?");
		System.out.println("\n1 - Cavalo");
		System.out.println("\n2 - Cachorro");
		System.out.println("\n3 - Pregui�a");
		op = read.nextInt();
		
		switch(op) {
			
		case 1:
			
			System.out.println("\nDigite o tipo de comida do Cavalo: ");
			String food = read.next();
			
			System.out.println("\nDigite o tipo a idade do Cavalo: ");
			idade = read.nextInt();
			
			System.out.println("\nO Cavalo � domesticado ? 1 para sim"
					+ " e qualquer numero para n�o ");
			
			int num = read.nextInt();
			
			boolean yes = num == 1;
			
			
			Cavalo cavalo = new Cavalo("Cavalo", idade, food, yes);
			cavalo.printCavalo();
			cavalo.somAnimal();
			cavalo.tipoPeleAnimal();
			cavalo.andaAnimal();
			
			break;
		
		case 2:
			
			System.out.println("\nDigite a especie Cachorro: ");
			String specie = read.next();
			
			System.out.println("\nDigite o tipo a idade do Cachorro: ");
			idade = read.nextInt();
			
			System.out.println("\nDigite o peso Cachorro: ");
			double peso = read.nextInt();
			
			System.out.println("\nDigite o porte do Cachorro: ");
			String porte = read.next();
						
			Cachorro cachorro = new Cachorro("Cachorro", idade, specie, peso, porte);
			cachorro.printCachorro();
			cachorro.somAnimal();
			cachorro.tipoPeleAnimal();
			cachorro.andaAnimal();
			
			break;
			
		case 3:
			
			System.out.println("\nDigite o nome do pais em que a Pregui�a foi encontrada ");
			String country = read.next();
			
			System.out.println("\nDigite a idade da Pregui�a: ");
			idade = read.nextInt();
			
			System.out.println("\nDigite o nome da regi�o em que a Pregui�a foi encontrada ");
			String region = read.next();

			Preguica preguica = new Preguica("Pregui�a", idade, country, region);
			preguica.printPreguica();
			preguica.somAnimal();
			preguica.tipoPeleAnimal();
			preguica.andaAnimal();
			
			break;
			
		default:
			
			System.out.println("\nVoc� digitou um n�mero incorreto");			
			
		}
			
	}

}
