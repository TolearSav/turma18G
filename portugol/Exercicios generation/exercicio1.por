programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos = 0, idadeMeses = 0, idadeDias = 0, idadeDiasTotais = 0

		escreva("Digite sua idade: ")
		leia(idadeAnos)
		escreva("Digite o total de meses passados após seu aniversário de ", idadeAnos, " anos: ")
		leia(idadeMeses)
		escreva("Digite o total de dias passados após seu aniversário de ", idadeAnos, " anos: ")
		leia(idadeDias)

		idadeDiasTotais = idadeAnos*365 + idadeMeses*30 + idadeDias

		escreva("Sua idade aproximada em dias é: ", idadeDiasTotais)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 94; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */