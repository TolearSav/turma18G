programa
{
	
	funcao inicio()
	{
	//variiaveis - tipagem forte é burocrática, fraca é livre
	inteiro nota
	cadeia nome
	caracter genero
	
		escreva("Nome de alune: ")
		leia(nome)
		escreva("Digite o gênero (M/F/0): ")
		leia(genero)
		escreva("Digite a nota de 1 a 10: ")
		leia(nota)
		
		//processamento
		//estrutura condicional
		se (nota > 5)
			se (genero == 'M' ou genero == 'm')
			{escreva("OI, " ,nome, " VOCÊ ESTÁ APROVADO!")
			} senao se (genero == 'F' ou genero == 'f')
			{escreva("OI, " ,nome, " VOCÊ ESTÁ APROVADA!")
			}senao se (genero == 'O' ou genero == 'o')
			{escreva("OI, " ,nome, " VOCÊ ESTÁ APROVADE!")
			} senao
			{escreva("VOCÊ NÃO DIGITOU A LETRA CORRETA")
			}
		se (nota <= 5) {
			se (genero == 'M' ou genero == 'm')
			{escreva("OI, " ,nome, " VOCÊ ESTÁ REPROVADO!")
			} senao se (genero == 'F' ou genero == 'f')
			{escreva("OI, " ,nome, " VOCÊ ESTÁ REPROVADA!")
			}senao se (genero == 'O' ou genero == 'o')
			{escreva("OI, " ,nome, " VOCÊ ESTÁ REPROVADE!")
			} senao
			{escreva("VOCÊ NÃO DIGITOU A LETRA CORRETA")
			}
		}

		//saída
		escreva("\nFim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1022; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */