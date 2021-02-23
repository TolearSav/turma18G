programa
{
	
	funcao inicio()
	{

		cadeia nomes[4]
		cadeia disciplinas[4]
		inteiro numeros
		real notas[4]

		nomes[0] = "Ednilson"
		nomes[1] = "Eduardo"
		nomes[2] = "Everton"
		nomes[3] = "Evandro"

		disciplinas[0] = "Português"
		disciplinas[1] = "Matemática"
		disciplinas[2] = "Artes"
		disciplinas[3] = "Ciências"

		notas[0] = 10
		notas[1] = 10
		notas[2] = 10
		notas[3] = 10

		para (inteiro x = 0; x < 4; x++) 
		{
			escreva(nomes[x],"\n")
		}

		para (inteiro y = 0; y < 4; y++)
			escreva(disciplinas[y],"\n")
			
		para (inteiro z = 0; z < 4; z++)
		escreva(disciplinas[z],"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */