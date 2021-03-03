package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaMatriz3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int linha = 0, coluna = 0, sDiagonalPrincipal = 0, produtoSegundaL = 1, maior3c = 0;
		
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.printf("Digite o valor da posição [%d,%d]: \n", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
				if(linha == coluna) {
					sDiagonalPrincipal = sDiagonalPrincipal + matriz[linha][coluna];
				}
			}
		}
		
		for(coluna = 0; coluna < 4; coluna++) {
			produtoSegundaL = produtoSegundaL * matriz[2][coluna];
		}
		
		for(linha = 0; linha < 4; linha++) {
			if(matriz[linha][2] > maior3c) {
				maior3c = matriz[linha][2];
			}
		}
		
		System.out.printf("A soma dos valores da diagonal principal é: %d \n", sDiagonalPrincipal);
		System.out.printf("O produto dos valores da segunda linha é: %d \n", produtoSegundaL);
		System.out.printf("O maior valor da terceira coluna é: %d ", maior3c);
	}

}
