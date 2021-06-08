9 de julho, 3384, salas 71 e 72/* 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

package Lacos_de_Repeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		for(x=1000; x<=1999; x++) {
			if(x % 11 == 5) {
			System.out.println(x);
			}
		}
	}
}