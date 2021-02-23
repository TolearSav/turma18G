programa
{
	inclua biblioteca Matematica
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00.*/
		
	funcao inicio()
	{

		real mediaSalario = 0.00, mediaFilhos = 0.00, percentualSalario = 0.00, maiorSalario = 0.00
		real salario = 0.00, filhos = 0.00, somaSalario = 0.00, somaFilhos = 0.00
		const inteiro HABITANTES = 3
		
		para(inteiro contador = 1; contador <= HABITANTES; contador++)
		{
			escreva("Salário: ")
			leia(salario)
			escreva("Número de filhos: ")
			leia(filhos)
			
			somaSalario = contador + salario
			somaFilhos = contador + filhos
			
			se (salario > maiorSalario)
			{
				maiorSalario = salario
			} se (salario <= 100) 
			{
				percentualSalario++
			}
		}

		mediaSalario = somaSalario / HABITANTES
		mediaFilhos = somaFilhos / HABITANTES
		percentualSalario = (percentualSalario / HABITANTES) * 100

		escreva("Média do salário da população: ", Matematica.arredondar(mediaSalario, 2))
		escreva("\nMédia do número de filhos: ", Matematica.arredondar(mediaFilhos, 2))
		escreva("\nMaior salário: ", maiorSalario)
		escreva("\nPercentual de pessoas com salário até R$100,00: ", Matematica.arredondar(percentualSalario, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */