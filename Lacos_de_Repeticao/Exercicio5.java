/* 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */


package Lacos_de_Repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, somaTotal=0;
		
		do {
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();
			somaTotal = somaTotal + numero;
		} while(numero != 0);
		System.out.println("\nA soma dos valores é de: " + somaTotal);
	}	
}
