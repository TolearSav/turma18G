programa
{
	
	funcao inicio()
	{
	real indiceDePoluicao, grupo
	
		escreva("Insira o grupo: ")
		leia(grupo)
		escreva("Insira o índice de poluição atual: ")
		leia(indiceDePoluicao)

		se (indiceDePoluicao <= 0.29) {
			escreva("O índice está dentro do aceitável")	
		} senao se (indiceDePoluicao >= 0.3 e grupo == 1) {
			escreva("Por favor, suspenda as atividades")
		} senao se (indiceDePoluicao >= 0.4 e grupo == 2) {
			escreva("Por favor, suspenda as atividades")
		} senao se (indiceDePoluicao >= 0.5 e grupo == 3) {
			escreva("Por favor, suspenda as atividades")
		} senao {
			escreva("O índice está dentro do aceitável")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 642; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */