/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package Lacos_de_Repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, somaMultiplo=0, quantMultiplo=0, media;
		
		do {
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();
			if(numero % 3 == 0) {
			somaMultiplo = somaMultiplo + numero;
			quantMultiplo = quantMultiplo + ((numero - numero)+1);
			media = somaMultiplo / quantMultiplo;
		} while(numero != 0) 
		System.out.printf("\nA media dos multiplos de 3 é de: " + media);
		}
	}
}
