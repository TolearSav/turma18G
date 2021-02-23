programa
{
	
	funcao inicio()
	{
		inteiro valor = 0, soma = 0, divisiveisCinco = 0, nulos = 0, somaPares = 0
		real media = 0.00

		para(inteiro x = 1; x <= 5; x++){
			escreva("Digite um número: ")
			leia(valor)

			soma = soma + valor
			media = soma / 5
			divisiveisCinco = valor % 5
			
			se(valor == 0){
				nulos = nulos + 1
			}
			
			se(valor % 2 == 0){
				somaPares = somaPares + valor
			}
		}

		escreva("Soma: ", soma)
		escreva("\nMedia: ", media)
		escreva("\nDivisíveis por cinco: ", divisiveisCinco)
		escreva("\nNulos: ", nulos)
		escreva("\nSoma dos valores pares: ", somaPares)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */