programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	real custoDeFabrica = 0.00, custoAoConsumidor = 0.00, custoTotal = 0.00, porcentagem = 0.00

		escreva("Insira o custo de fábrica: ")
		leia(custoDeFabrica)

		porcentagem = (custoDeFabrica*0.28) + (custoDeFabrica*0.45) 
		custoAoConsumidor = custoDeFabrica + porcentagem


		escreva("O custo ao consumidor é de: ", custoAoConsumidor, " reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */