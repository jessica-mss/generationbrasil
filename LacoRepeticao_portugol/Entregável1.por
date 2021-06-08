//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados 
//sobre o salário e número de filhos. A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00

programa
{
	funcao inicio()
	{
		real salario, somasalarios=0.0, maiorsalario=0.0
		inteiro filhos, habitantes=3, somafilhos=0, qtdsalariocem=0

		para(habitantes = 1; habitantes <= 3; habitantes++) {
			escreva("qual o salário do ", habitantes, "º habitante? ")
			leia(salario)
			somasalarios = (somasalarios + salario)
			escreva("Quantos filhos tem o ", habitantes, "º habitante? ")
			leia(filhos)
			somafilhos = (somafilhos + filhos)

			se (salario>maiorsalario) {
				maiorsalario=salario
			}
            	se (salario<=100.0) {
            		qtdsalariocem++
            	}
		}
		limpa()
		escreva("Relatório para prefeitura")
		escreva("\nA média de salários é de: ", somasalarios/3)
		escreva("\nA média de filhos é de: ", somafilhos/3)
		escreva("\nMaior salário = R$", maiorsalario)
		escreva("\nPercentual de pessoas com salário até R$100,00 = ", (qtdsalariocem*100)/habitantes, "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */