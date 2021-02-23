programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
	real n1, n2, n3, n4, q1, q2, q3, q4
	
		escreva("Insira o primeiro número: ")
		leia(n1)
		escreva("Insira o segundo número: ")
		leia(n2)
		escreva("Insira o terceiro número: ")
		leia(n3)
		escreva("Insira o quarto número: ")
		leia(n4)

		q1 = Mat.potencia(n1, 2)
		q2 = Mat.potencia(n2, 2)
		q3 = Mat.potencia(n3, 2)
		q4 = Mat.potencia(n4, 2)

		se (q3 >= 1000) {
			escreva("Quadrado de ", n3, " = ", q3)
		} senao { 
			escreva("Quadrado de ", n1, " = ", q1)
			escreva("\nQuadrado de ", n2, " = ", q2)
			escreva("\nQuadrado de ", n3, " = ", q3)
			escreva("\nQuadrado de ", n4, " = ", q4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */