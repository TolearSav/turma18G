package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maiorPontuacao = 0;
				
		for (int contador = 0; contador < 5; contador++) 
		{
			System.out.println("Insira a pontua��o " + contador+1 + ": ");
			pontuacao[contador] = ler.nextInt();

			if(pontuacao[contador] > maiorPontuacao); 
			{
				maiorPontuacao = pontuacao[contador];
			}
		}

		for (int contador = 0; contador < 5; contador++)
		{
			System.out.println("Pontua��o: " + pontuacao[contador]);
		}
			System.out.println("A maior pontua��o �: "+ maiorPontuacao);

	}

}
