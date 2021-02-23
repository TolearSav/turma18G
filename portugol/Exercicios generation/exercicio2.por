programa
{
	
	funcao inicio()
	{
		inteiro idadeEmDias = 0
		inteiro anos = 0
		inteiro meses = 0
		inteiro dias = 0

		escreva("Digite sua idade em dias: ")
		leia(idadeEmDias)

		anos = idadeEmDias / 365
		meses = (idadeEmDias % 365) /30
		dias = (idadeEmDias % 365) % 30

		escreva("Ano[s]: ", anos)
		escreva("\nMes[es]: ", meses)
		escreva("\nDia[s]: ", dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */