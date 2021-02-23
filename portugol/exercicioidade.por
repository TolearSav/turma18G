programa
{
	
	funcao inicio()
	{
	cadeia nome
	inteiro anoDeNascimento
	inteiro anoAtual = 2021
	inteiro idadeAtual

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite seu ano de nascimento: ")
		leia(anoDeNascimento)

		idadeAtual = anoAtual - anoDeNascimento
	
		escreva("Oi " ,nome, "! Sua idade aproximada é " ,idadeAtual, " anos!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 100; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */