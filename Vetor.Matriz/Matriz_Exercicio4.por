//4. Crie um programa que receba valores do usuário para preencher uma matriz 
//3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da 
//primeira diagonal, ou seja, diagonal principal.

programa
{
    inclua biblioteca Util
    
    funcao inicio()
    {

        real array[3][3]

        para (inteiro i = 0; i < 3; i++){

            para(inteiro a = 0; a < 3; a++){
                
                escreva("\nDigite os valores ")
                leia(array[i][a])

            }
        }

        limpa()

        para (inteiro i = 0; i < 3; i++){

            para(inteiro a = 0; a < 3; a++){
                
                escreva("\nOs valores são: ")
                escreva(array[i][a])
    
            }
        }

        Util.aguarde(4000)
        limpa()
        
        escreva("\nOs valores da diagonal são: ")

        para (inteiro i = 0; i < 3; i++){

            para(inteiro a = 0; a < 3; a++){

                se (i == a) {

                    array[i][a]++
                    escreva(array[i][a], " ")
    
                }                

            }
            
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */