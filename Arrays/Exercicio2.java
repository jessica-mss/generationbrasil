/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

package Arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
        
        int x = 6, contPar = 0, contImpar = 0, totalPar = 0, totalImpar = 0;
        
        int [] numero = new int [x];
        
        for(int i = 0; i < numero.length; i++) {
            
            System.out.println("\n"
                    + "Entre com um n�mero ");
            numero[i] = leia.nextInt();
            
            boolean ok = numero[i] % 2 == 0;
            
            if (ok) {
                
                contPar++;
                totalPar += numero[i];
                
            } else {
                
                contImpar++;
                totalImpar += numero[i];
                
            }
        }
        
        System.out.println("\n\tO total de n�meros pares digitados "
                + contPar
                + " e a sua soma deu "
                + totalPar);
        System.out.println("\n\tO total de n�meros impares digitados "
                + contImpar
                + " e a sua soma deu "
                + totalImpar);
    }

}
