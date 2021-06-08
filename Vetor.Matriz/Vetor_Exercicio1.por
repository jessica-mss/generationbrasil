//1.	Faça um programa que crie um vetor por leitura com 5 valores
//de pontuação de uma atividade e o escreva em seguida.
//Encontre após a maior pontuação e a apresente.

programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro pontuacao[5], x
		real maior
		

		para(x=0; x<5; x++)
		{
			escreva("\nEntre com a pontuação: ")
			leia(pontuacao[x])
		}
		para(x=0; x<5; x++)
		{
		escreva("\nPontuação ", x+1, " = ", pontuacao[x])
		}
		maior = mat.maior_numero(pontuacao[x],pontuacao[x])
		escreva("\nO maior número é: ", maior)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = 16, 17, 21, 24, 10, 11;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */