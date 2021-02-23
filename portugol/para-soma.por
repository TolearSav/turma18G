programa
{
	
	funcao inicio()
	{
	
	inteiro contador, numero, soma = 0

	escreva("Digite um número: ")
	leia(numero)

	para(contador = 1; contador <= numero; contador++){
		soma = (soma + contador)
		escreva(contador, " ")
	}
	
	   escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */