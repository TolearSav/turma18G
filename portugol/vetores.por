programa
{
	
	funcao inicio()
	{
		cadeia times[] = {"Palmeiras", "SPFC", "Santos", "Corinthians"}
		inteiro pontos[4]
		caracter resultado

		para(inteiro j = 0; j <= 3; j++){
			escreva("Rodada: ", j, ": \n")

			para(inteiro i = 0; i < 4; i++){
				escreva("\n", times[i], " 1 - Ganhou, 2 - Empatou, 3 - Perdeu ")
				leia(resultado)
				se(resultado == '1'){
					pontos[i] += 3
				} senao se(resultado == '2'){
					pontos[i] = pontos[i] + 1
				} senao se(resultado == '3'){
					times[i] = times[i] + 0
				}
			}
		}
		escreva("\nResultado: ")
		para(inteiro x = 0; x < 4; x++){
			escreva("\n", times[x], " ", pontos[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 639; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */