/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

package Lacos_de_Repeticao;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=1, somaPar=0, somaImpar=0;
		
		for(numero=1; numero<=10; numero++) {
			if(numero % 2 == 0) {
				somaPar = somaPar + ((numero - numero) + 1);
			} else {
				somaImpar = somaImpar + ((numero - numero) + 1);
			}
		}
		System.out.printf("\nExistem " + somaPar + " n�meros pares.");
		System.out.printf("\nExistem " + somaImpar + " n�meros �mpares.");
	}
}
