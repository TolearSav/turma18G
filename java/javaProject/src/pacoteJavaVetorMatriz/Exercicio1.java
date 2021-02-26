package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int pontuacao[5], maiorPontuacao;
				
		for (int contador = 0; contador < 5; contador++) 
		{
			System.out.println"Insira a pontuação " + contador+1 + ": ");
			pontuacao[contador] = ler.nextDouble();

			if(pontuacao[contador] > maiorPontuacao); 
			{
				maiorPontuacao = pontuacao[contador];
			}
		}

		for (int contador = 0; contador < 5; contador++)
		{
			System.out.println("Pontuação: ", pontuacao[contador]);
		}
			System.out.println("A maior pontuação é: ", maiorPontuacao);

	}

}
