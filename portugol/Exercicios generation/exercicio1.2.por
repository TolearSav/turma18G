programa
{
	
	funcao inicio()
	{
	
	real C, N, salario, salarioExcedente, salarioTotal
	
		escreva("Insira o código do funcionário: ")
		leia(C)
		escreva("Insira o número de horas trabalhadas: ")
		leia(N)

			salario = (N * 10)
			salarioExcedente = (N - 50) * 20
			salarioTotal = (salario + salarioExcedente)

			se (N <= 50) {
				salarioExcedente = 0
				salarioTotal = salario
				escreva("Salário: " , salario, " .Salário excedente: ", salarioExcedente, ". Salário Total: ", salarioTotal)
			} senao {
				escreva("Salário: " , salario, " .Salário excedente: " , salarioExcedente, " .Salário Total: ", salarioTotal)
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */