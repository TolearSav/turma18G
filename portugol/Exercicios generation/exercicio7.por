programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a
		real b 
		real c, d, et, f, x, y

		escreva("Digite o valor de a: ")
		leia(a)
		escreva("Digite o valor de b: ")
		leia(b)
		escreva("Digite o valor de c: ")
		leia(c)
		escreva("Digite o valor de d: ")
		leia(d)
		escreva("Digite o valor de e: ")
		leia(et)
		escreva("Digite o valor de f: ")
		leia(f)

		x = ((a*et)-(b*f)) / ((a*et)-(b*d))
		y = ((a*f)-(c*d)) / ((a*et)-(b*d))

		escreva("Valor de x: ", Matematica.arredondar(x,2))
		escreva("\nValor de y: ", Matematica.arredondar(y,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */