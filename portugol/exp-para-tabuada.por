programa
{
	
	funcao inicio()
	{
		inteiro numero, valorTabuada, resultado

		escreva("Entre com o valor da tabuada: ")
		leia(valorTabuada)

		para(numero = 1; numero <= 10; numero++)
		{
			resultado = numero * valorTabuada
			escreva("\n", numero, " X ", valorTabuada, " = ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */