programa
{
	
	funcao inicio()
	{

		cadeia nome
		inteiro notaPort, notaMat, notaArt, notaCie
		real media
		
			escreva("Nome do alune: ")
			leia(nome)
			escreva("Nota Português: ")
			leia(notaPort)
			escreva("Nota Matemática: ")
			leia(notaMat)
			escreva("Nota Artes: ")
			leia(notaArt)
			escreva("Nota Ciências: ")
			leia(notaCie)
        
			media = (notaPort + notaCie + notaArt + notaCie) / 4
			
			se (media > 5) 
			{
				escreva("\nNota Português: ", notaPort, "\nNota Matemática: ", notaMat,  
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: " , media)
				escreva("\n", nome," foi aprovade! Pode continuar!")
			} senao
			{
				escreva(", \nNota Português: ", notaPort, "\nNota Matemática: ", notaMat, 
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: ", media)
				escreva("\n", nome, "ainda precisa estudar mais!")
			} 


			aluno2()
			aluno3()
			aluno4()
	}

	funcao aluno2()
		{
			
		cadeia nome
		inteiro notaPort = 0, notaMat = 0, notaArt = 0, notaCie = 0 
		real media

			escreva("\nNome do alune: ")
			leia(nome)
			escreva("Nota Português: ")
			leia(notaPort)
			escreva("Nota Matemática: ")
			leia(notaMat)
			escreva("Nota Artes: ")
			leia(notaArt)
			escreva("Nota Ciências: ")
			leia(notaCie)
			
			media = (notaPort + notaCie + notaArt + notaCie) / 4
		
			se (media > 5) 
			{
				escreva("\nNota Português: ", notaPort, "\nNota Matemática: ", notaMat,  
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: " , media)
				escreva("\n", nome," foi aprovade! Pode continuar!")
			} senao 
			{
				escreva(", \nNota Português: ", notaPort, "\nNota Matemática: ", notaMat, 
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: ", media)
				escreva("\n", nome, "ainda precisa estudar mais!")
			}
		}
		
	funcao aluno3()
		{
			
		cadeia nome
		inteiro notaPort = 0, notaMat = 0, notaArt = 0, notaCie = 0 
		real media

			escreva("\nNome do alune: ")
			leia(nome)
			escreva("Nota Português: ")
			leia(notaPort)
			escreva("Nota Matemática: ")
			leia(notaMat)
			escreva("Nota Artes: ")
			leia(notaArt)
			escreva("Nota Ciências: ")
			leia(notaCie)

			limpa()
			
			media = (notaPort + notaCie + notaArt + notaCie) / 4
		
			se (media > 5) 
			{
				escreva("\nNota Português: ", notaPort, "\nNota Matemática: ", notaMat,  
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: " , media)
				escreva("\n", nome," foi aprovade! Pode continuar!")
			} senao 
			{
				escreva(", \nNota Português: ", notaPort, "\nNota Matemática: ", notaMat, 
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: ", media)
				escreva("\n", nome, "ainda precisa estudar mais!")
			}
		}

		funcao aluno4()
		{
			
		cadeia nome
		inteiro notaPort = 0, notaMat = 0, notaArt = 0, notaCie = 0 
		real media

			escreva("\nNome do alune: ")
			leia(nome)
			escreva("Nota Português: ")
			leia(notaPort)
			escreva("Nota Matemática: ")
			leia(notaMat)
			escreva("Nota Artes: ")
			leia(notaArt)
			escreva("Nota Ciências: ")
			leia(notaCie)
			
			media = (notaPort + notaCie + notaArt + notaCie) / 4
		
			se (media > 5) 
			{
				escreva("\nNota Português: ", notaPort, "\nNota Matemática: ", notaMat,  
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: " , media)
				escreva("\n", nome," foi aprovade! Pode continuar!")
			} senao 
			{
				escreva(", \nNota Português: ", notaPort, "\nNota Matemática: ", notaMat, 
				"\nNota Artes: ", notaArt, "\nNota Ciências: ", notaCie, "\nMedia: ", media)
				escreva("\n", nome, "ainda precisa estudar mais!")
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */