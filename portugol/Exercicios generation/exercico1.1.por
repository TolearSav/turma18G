programa
{
	
	funcao inicio()
	{
	real pesoTomates = 0.00, excesso = 0.00, multa = 0.00
	const real LIMITE = 50.00
	const real VALORMULTA = 4.00

		escreva("Insira o peso dos tomates: ")
		leia(pesoTomates)

		se (pesoTomates > LIMITE) {
			excesso = (pesoTomates - LIMITE)
			multa = (excesso * VALORMULTA)
			//escreva("Você excedeu o limite de 50kg. Peso excedente: ", excesso, "kg. Multa por cada kg excedente: ", multa, " reais.")
		} //senao {
			//escreva("Você está dentro do limite de 50 kg! Peso excedente: ", excesso, " . Multa por cada kg excedente: ", multa, " reais.")
		//}
		escreva("Excesso: ", excesso)
		escreva("\nMulta: ", multa)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */