programa
{
	
	funcao inicio()
	{
		inteiro contador = 1, numero, soma = 0, maior = 0, menor = 0
		
		enquanto (contador <= 5)
		{
			escreva("Digite o ", contador, "o valor: ")
			leia(numero)
			se (numero > maior) 
			{
				maior = numero
			}
			se (numero < menor)
			{
				menor = numero
			}
			soma = soma + numero
			contador = contador + 1
		}

			escreva("A soma foi: 1", soma)
			escreva("\nO maior número digitado foi: ", maior)
			escreva("\nO menor número digitado foi: ", menor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */