programa
{
	
	funcao inicio()
	{

	/* solicite o nome da pessoa
	o ano de nascimento da pessoa (apenas o ano)
	mostre o nome, e a idade aproximada da pessoa
	pergunte, deseja continua
	dependendo da resposta, continue ou pare o programa*/

		cadeia nome
		inteiro ano, idade
		caracter opcao = 'S'

		faca {
		escreva("Qual seu nome?: ")
		leia(nome)
		
		escreva("Qual seu ano de nascimento: ")
		leia(ano)
		
		idade = (2021 - ano)

		escreva("Olá, ", nome, ". Sua idade aproximada é: ", idade)
		escreva("\nDeseja continuar? (S/N)")
		leia(opcao)
		enquanto (opcao != 'N' e opcao != 'n')
		{
			escreva("Digite S ou N apenas: ")
			leia(opcao)
		}
		} enquanto (opcao == 'S' ou opcao == 's')
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */