programa
{
	
	funcao inicio()
	{

	inteiro numero
	
		escreva("Digite um número: ")
		leia(numero)

		se (numero %2 == 0) {
			escreva("O número ",numero," é par")
		} senao {
			escreva("O número ",numero," é ímpar")
		} 
		se (numero >= 0) {
			escreva(" e é um número positivo.")
		} senao {
			escreva(" e é um número negativo.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */