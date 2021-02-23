programa
{
	inclua biblioteca Util

	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
	
	funcao inicio()
	{
		inteiro dado[10], maiorNumero = 0, vezes = 0
		real media, soma = 0.00

		para (inteiro contador = 0; contador < 10; contador++)
		{
			dado[contador] = Util.sorteia(1,6)

			se(dado[contador] > maiorNumero) 
			{
				maiorNumero = dado[contador]
			}
		}

		para (inteiro contador = 0; contador < 10; contador++)
		{
			escreva("\nValor: ", dado[contador], "\n")
			soma = soma + dado[contador]
			se (dado[contador] == maiorNumero)
			{
			vezes = vezes + 1
			}
		}
		media = soma / 10
		escreva("\nQuantidade de aparições do maior número: ", vezes)
		escreva("\nMédia: ", media)
		escreva("\nMaior número: ", maiorNumero)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */