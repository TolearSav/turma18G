
programa
{

    funcao inicio()
    {
        inteiro ano 
        cadeia nome 
        caracter opcao = 'S'

        faca
        {
            escreva("digite o nome: ")
            leia(nome)
            escreva("Digite o ano: ")
            leia(ano)
            escreva(nome, " sua idade aprox é ",(2021-ano)," anos!!!") 
            escreva("Continua S/N")
            leia(opcao)
            enquanto ((opcao !='N' ou opcao != 'n') e (opcao != 'S' ou opcao !='s'))
            {
                escreva("Digite S ou N apenas")
                leia(opcao)
            }

        } enquanto (opcao == 'S' ou opcao == 's')
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */