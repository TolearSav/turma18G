programa
{
	
	funcao inicio()
	{
		inteiro numero, fatorial = 1, resultado = 1
		cadeia texto = ""

		escreva("Digite um número: ")
		leia(numero)
		
		para (fatorial = numero; fatorial >= 1; fatorial--){
			
			se(fatorial == 1){
				texto = texto + fatorial
			} senao {
				texto = texto + fatorial + "x"
			}
			
			
			resultado = resultado * fatorial
		}
		escreva(texto, " = " , resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */