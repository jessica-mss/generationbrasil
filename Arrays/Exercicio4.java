/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/

package Arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        int x = 2, y = 2, constante;
        
        int [][] array1 = new int[x][y];
        int [][] array2 = new int[x][y];
        int [][] array3 = new int[x][y];
        
        System.out.println("\n\tDigite 4 n�meros para cada matriz");
        
        for(int i = 0; i < x; i++) {
            
            for(int j = 0; j < y; j++) {
                                
                System.out.println("\nDigite os n�meros da primeira matriz " );
                array1[i][j] = leia.nextInt();            
                
            }
        }
        
        for(int i = 0; i < x; i++) {
            
            for(int j = 0; j < y; j++) {
                                
                System.out.println("\nDigite os n�meros da segunda matriz " );
                array2[i][j] = leia.nextInt();            
                
            }
        }
        
        System.out.println("\nDigite o valor inteiro para a constante ");
        constante = leia.nextInt();
        
        for(int i = 0; i < x; i++) {
            
            for(int j = 0; j < y; j++) {

                array3[i][j] = array1[i][j] + array2[i][j] + constante;
                System.out.println("Valor da terceira matriz " + array3[i][j]);
                
            }
        }
    }
}
