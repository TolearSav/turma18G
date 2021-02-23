programa
{
	inclua biblioteca Matematica
	
	real emprestimo, juros = 0.20, parcela, total, porcentagem
	
	funcao inicio()
	{
		escreva("Qual o valor em do empréstimo? ")
		leia(emprestimo)
		escreva("Quantas parcelas? ")
		leia(parcela)
		
		porcentagem = (emprestimo * juros)
		total = (emprestimo + porcentagem) / parcela
		

		escreva("Você terá de pagar: ", Matematica.arredondar(total, 2), " reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */