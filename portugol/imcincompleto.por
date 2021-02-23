programa
{
	inclua biblioteca Matematica

	real massa, altura, imc
	
	funcao inicio()
	{
		escreva("Digite seu peso: ")
		leia(massa)
		escreva("Digite sua altura: ")
		leia(altura)

		imc = massa / (altura * altura)

		se ((imc >= 18.5) e (imc <= 25))
		{
			escreva("Seu IMC é de: ", Matematica.arredondar(imc, 2))
			escreva("\nVocê está no peso ideal!")
		} escreva("Seu IMC é de: ", Matematica.arredondar(imc, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */