programa
{
	
	funcao inicio()
	{
		inteiro numero, contador = 1, soma = 0

		enquanto(contador <= 5) {
			escreva("Digite o ", contador, "o. valor: ")
			leia(numero)
			soma = soma + numero
			contador++
		}

		escreva("A soma de todos o valores digitados é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 69; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */