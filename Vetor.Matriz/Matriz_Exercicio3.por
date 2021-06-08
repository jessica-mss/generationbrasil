//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

programa
{
    funcao inicio()
    {
      real N1[4][6], N2[4][6], M1[4][6], M2[4][6]

        para(inteiro i = 0; i < 4; i++){

            para(inteiro a = 0; a < 6; a++){

                escreva("\nDigite os valores de N1: ")
                leia(N1[i][a])
            
            }
        }

        limpa()
        escreva("\nAgora\n")

        para(inteiro i = 0; i < 4; i++){

            para(inteiro a = 0; a < 6; a++){
    
                escreva("\nDigite os valores de N2: ")
                leia(N2[i][a])

            }
        
        }
        
        limpa()
        escreva("\nSoma\n")
        
        para(inteiro i = 0; i < 4; i++){

            para(inteiro a = 0; a < 6; a++){

                escreva("\nA soma dos valores de N1 e N2: ")
                M1[i][a] = N1[i][a] + N2[i][a]
                escreva(M1[i][a])
            
            }
        
        }
        
        escreva("\nDiferença\n")
        
        para(inteiro i = 0; i < 4; i++){

            para(inteiro a = 0; a < 6; a++){

                escreva("\nA diferença2 dos valores de N1 e N2: ")
                M2[i][a] = N1[i][a] - N2[i][a]
                escreva(M2[i][a])
            
            }
        
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */