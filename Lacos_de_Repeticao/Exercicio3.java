/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package Lacos_de_Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade, menor21=0, maior50=0;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Entre com uma idade: ");
			idade = leia.nextInt();
			
			while(idade != 99) {
				if(idade<21) {
					menor21 = menor21 + ((idade - idade) + 1);
				} else if ( idade>50) {
					maior50 = maior50 + ((idade - idade) + 1);
				} else {
					System.out.println ("\nSua idade não faz parte de nenhum grupo.");
				}
				System.out.println("Entre com uma idade: ");
				idade = leia.nextInt();	
			}
		}
				
		System.out.printf("\n quantidade de pessoas com mais de 50 anos é: " + maior50);
		System.out.printf("\n quantidade de pessoas com menos de 21 anos é: " + menor21);
	} 

}
