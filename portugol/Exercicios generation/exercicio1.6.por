programa
{
	
	funcao inicio()
	{
	real idade

		escreva("Insira sua idade: ")
		leia(idade)

		se (idade == 5 ou idade == 6 ou idade == 7) {
			escreva("Você está na categoria Infantil A!")
		} senao se (idade == 8 ou idade == 9 ou idade == 10 ou idade == 11) {
			escreva("Você está na categoria Infantil B!")
		} senao se (idade == 12 ou idade == 13) {
			escreva("Você está na categoria Juvenil A!")
		} senao se (idade == 14 ou idade == 15 ou idade == 16 ou idade == 17) {
			escreva("Você está na categoria Juvenil B!")
		} senao se (idade >= 18) {
			escreva("Você está na categoria Adultos!")
		} senao {
			escreva("Você não se encaixa em nenhuma das categorias disponíveis.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */