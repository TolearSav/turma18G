programa
{
	
	funcao inicio()
	{
	real base, altura, area

		escreva("Insira o valor da base do triângulo: ")
		leia(base)
		escreva("Insira o valor da altura do triângulo: ")
		leia(altura)

		area = (base * altura) /2

		se (base > 0 e altura > 0) {
			escreva("A área do triângulo é: ", area)	
		} senao {
			escreva("Não foi possivel calcular, os valores precisam ser positivos e maiores que 0")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */