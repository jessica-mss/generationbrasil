/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

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
                    + "Entre com um número ");
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
        
        System.out.println("\n\tO total de números pares digitados "
                + contPar
                + " e a sua soma deu "
                + totalPar);
        System.out.println("\n\tO total de números impares digitados "
                + contImpar
                + " e a sua soma deu "
                + totalImpar);
    }

}
