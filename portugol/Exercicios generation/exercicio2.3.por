programa
{
	
	funcao inicio()
	{

	real numero = 1.0, soma = 0.0, media = 0.0, totalValoresLidos = 0.0
		
		enquanto (numero > 0) 
		{
			escreva("Digite um número: ")
			leia(numero)

			se (numero > 0) 
			{
				soma = soma + numero
				totalValoresLidos++
				
			}
		
		}
			media = soma / totalValoresLidos
			escreva("Soma: ", soma)
			escreva("\nMedia ", media)
			escreva("\nTotal de valores lidos ", totalValoresLidos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */