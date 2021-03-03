package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
		
		Scanner leia = new Scanner(System.in);
		
		int lancamentos[] = new int[5];
		double mediaAritmetica = 0.00, soma = 0.00;
		int maiorPontuacao = 0, contMaiorPontuacao = 0;
		Random numeroDado = new Random(); //instancias - chamar - criar
		
		for (int x = 0; x < lancamentos.length; x++) {
			//System.out.printf("Digite o resultado do lan�amento %d: \n",x+1);
			//lancamentos[x] = leia.nextInt();
			//lancamentos[x] = (int) (Math.random()*6)+1; //interface
			lancamentos[x] = numeroDado.nextInt(6)+1;
			//lancamentos[x] = numeroDado.nextInt(40)+10;
		};
		
		for(int x = 0; x < lancamentos.length;x++) {
			System.out.printf("O valor do lan�amento %d � %d \n", x+1, lancamentos[x]);
			soma = soma + lancamentos[x];
			if(lancamentos[x] >= maiorPontuacao) {
				if(lancamentos[x] > maiorPontuacao) {
					contMaiorPontuacao = 0;
				}
				maiorPontuacao = lancamentos[x];
				contMaiorPontuacao++;
			}
		}
		
		mediaAritmetica = soma / lancamentos.length;
		
		System.out.printf("Soma dos valores digitados: %.0f \n", soma);
		System.out.printf("A m�dia �: %.2f \n",mediaAritmetica);
		System.out.printf("O maior valor �: %d \n", maiorPontuacao);
		System.out.printf("O maior valor apareceu %d vezes.", contMaiorPontuacao);
		
	}

}
