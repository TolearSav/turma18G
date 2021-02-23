programa
{
	/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

	funcao inicio()
	{
		inteiro pontuacao[5]
		inteiro maiorPontuacao = 0
		
		para (inteiro contador = 0; contador < 5; contador++) 
		{
			escreva("Insira a pontuação ", contador+1, ": ")
			leia(pontuacao[contador])

			se(pontuacao[contador] > maiorPontuacao) 
			{
				maiorPontuacao = pontuacao[contador]
			}
		}

		para (inteiro contador = 0; contador < 5; contador++)
		{
			escreva("\nPontuação: ", pontuacao[contador])
		}
			escreva("\nA maior pontuação é: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */