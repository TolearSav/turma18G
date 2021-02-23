programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{		

		inteiro contador = 0, valor, salto
	
		escreva("Quer contar até quanto? ")
		leia(valor)
		escreva("Qual será o valor do salto? ")
		leia(salto)
		
		enquanto (contador <= valor)
		{
		escreva("\n", contador)
		contador = contador + salto
		Util.aguarde(1000)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */