programa
{
	
	funcao inicio()
	{
		inteiro contador = 1, vezes
		real reais, dolares

		escreva("Quantas vezes você quer converter? ")
		leia(vezes)
		
		enquanto(contador <= vezes) 
		{
			contador = contador + 1
			escreva("\nQual o valor em reais? ")
			leia(reais)
			dolares = reais/5.6
			escreva("O valor em dólares é: ", dolares)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */