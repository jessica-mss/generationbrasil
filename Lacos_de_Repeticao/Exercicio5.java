/* 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE) */


package Lacos_de_Repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, somaTotal=0;
		
		do {
			System.out.println("Entre com um n�mero: ");
			numero = leia.nextInt();
			somaTotal = somaTotal + numero;
		} while(numero != 0);
		System.out.println("\nA soma dos valores � de: " + somaTotal);
	}	
}
