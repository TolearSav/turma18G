programa
{
	
	funcao inicio()
	{
		inteiro total = 0, soma = 0
		
		para(inteiro numero = 1; numero <= 10; numero++){

			escreva("Digite um número: ")
			leia(numero)
			
			se((numero > 0) e (numero <=10)){
				total = total + 1
			}
			se(numero % 2 == 1){
				soma = soma + numero
			}
		
		}
		escreva(total,"\n")
		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */