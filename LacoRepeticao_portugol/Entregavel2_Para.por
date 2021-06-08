//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

programa
{
	
	funcao inicio()
	{
		inteiro index, soma=0
		para(index=3; index<=500; index+=3) {
			se(index%2==1){
				soma+=index
			}
		}
		escreva(soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */