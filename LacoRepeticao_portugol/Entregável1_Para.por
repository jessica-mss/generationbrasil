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
		real salario, somasalarios=0.0
		inteiro filhos, habitantes, somafilhos=0

		para(habitantes = 1; habitantes <= 3; habitantes++) {
			escreva("qual o salário do ", habitantes, "º habitante? ")
			leia(salario)
			somasalarios = (0.0 + salario) / 3
			escreva("Quantos filhos tem o ", habitantes, "º habitante? ")
			leia(filhos)
			somafilhos = (0 + filhos)/3
		}
		escreva("Relatório para prefeitura")
		escreva("\nA média de salários é de: ", somasalarios)
		escreva("\nA média de filhos é de: ", somafilhos)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 855; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */