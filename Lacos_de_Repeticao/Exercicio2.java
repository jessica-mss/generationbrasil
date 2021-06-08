/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

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
		System.out.printf("\nExistem " + somaPar + " números pares.");
		System.out.printf("\nExistem " + somaImpar + " números ímpares.");
	}
}
