programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	
	real nota1, nota2, nota3, mediaFinal

		escreva("Insira a primeira nota: ")
		leia(nota1)
		escreva("Insira a segunda nota: ")
		leia(nota2)
		escreva("Insira a terceira nota: ")
		leia(nota3)

		mediaFinal = (nota1 + nota2 + nota3) /3
		escreva("\nA média final é: ", Matematica.arredondar(mediaFinal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */