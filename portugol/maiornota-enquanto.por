programa
{
	
	funcao inicio()
	{

	cadeia nome, melhorAluno = ""
	inteiro alunos = 0, contador = 1
	real nota, melhorNota = 0.00

		escreva("Quantos alunos a turma tem? ")
		leia(alunos)

		enquanto(contador <= alunos){
		escreva("Aluno", contador)
		escreva("Nome do Aluno: ")
		leia(nome)
		escreva("Nota de ", nome, ": ")
		leia(nota)

			contador = contador + 1

			se(melhorNota < nota){
				melhorNota = nota
				melhorAluno = nome
			}
		}
		escreva(melhorNota) 
		escreva(melhorAluno)

	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 69; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */