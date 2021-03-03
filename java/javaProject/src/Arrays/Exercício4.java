package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/
		
		Scanner leia = new Scanner(System.in);
		Random aleat =  new Random();
		int valores[][] = new int[3][3];
		int linha = 0, coluna = 0, soma = 0, somaDiagPrincipal = 0;
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				valores[linha][coluna] = aleat.nextInt(9)+1;
				soma = soma + valores[linha][coluna];
				if(coluna == linha) {
					somaDiagPrincipal += valores[linha][coluna];
				}
			}
		}
		
		/*for(linha = 0; linha < valores.length; linha++) {
			for(coluna = 0; coluna < valores.length; coluna++) {
				System.out.print(valores[linha][coluna]);
				System.out.println(" ");
			}
		}*/
		System.out.printf("A soma dos valores é: %d", soma);
		System.out.printf("\nSoma dos valores da diagonal principal: %d", somaDiagPrincipal);

	}

}
