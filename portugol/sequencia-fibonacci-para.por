programa
{
	
	funcao inicio()
	{
		inteiro contador, anterior = 0, atual = 1, proximo = 1
		
		para(contador = 1; contador <= 15; contador++){
			escreva(proximo, " ")

			proximo = atual + anterior
			anterior = atual
			atual = proximo
		}
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */