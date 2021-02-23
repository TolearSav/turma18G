programa
{
	
	funcao inicio()
	{
		inteiro valor = 0, soma = 0
		real media = 0.00

		para (inteiro x = 1; x<=5; x++)
		{
			escreva("Leia número ", x, ": ")
			leia(valor)
			soma = soma + valor
		}
		media = (soma / 5)
		escreva("Soma dos valores: ", soma, "\n")
		escreva("Média: ", media, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */