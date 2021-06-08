//Um dado é lançado 10 vezes e o valor correspondente é anotado.
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
//A seguir determine e imprima a média aritmética dos lançamentos,
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

programa
{
    funcao inicio()
    {
        inteiro array[10], i, cont = 0, soma = 0, media, maior = 0, contMaior = 0

        escreva("\nNesse jogo você vai jogar um dado de 6 lados 10 vezes,",
        "\ndepois você vai digitar os resoltados\n")

        para (i = 0; i <= 9; i++){

            i++
            escreva("\nDigite o resultado do dado dá, ", i, "º jogada: ")
            i--
            leia(array[i])
    
            cont++
    
            soma = soma + array[i]
    
            se (array[i] >= maior) {
    
                maior = array[i]
                
            }

        }
            
        limpa()

        para (inteiro a = 0; a <= 9; a++){

            se (maior == array[a]){

                contMaior++
            
            }
            
        }

        media = soma / cont

        escreva("\nA média dos lançamentos é de: ", media, "\n")
        escreva("\nA quantidade de vezes que o maior número apareceu foi: ", contMaior, "\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */