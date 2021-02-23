programa
{
	real lado1, lado2, lado3
	logico equilatero, escaleno, triangulo
	
	funcao inicio()
	{
		escreva("Insira o primeiro lado: ")
		leia(lado1)
		escreva("Insira o segundo lado: ")
		leia(lado2)
		escreva("Insira o terceiro lado: ")
		leia(lado3)

		triangulo = (lado1 < lado2 + lado3) e (lado2 < lado1 + lado3) e (lado3 < lado1 + lado2)
		equilatero = (lado1 == lado2) e (lado2 == lado3)
		escaleno = (lado1 != lado2) e (lado2 != lado3) e (lado1 != lado3)
		escreva("Pode formar um triângulo? ", triangulo)
		escreva("\n3O triangulo é equilátero? ", equilatero)
		escreva("\nO triangulo é escaleno? ", escaleno)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */