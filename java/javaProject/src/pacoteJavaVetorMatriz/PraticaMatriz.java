package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaMatriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int linha, coluna, totalPar = 0;
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite o valor da posi��o [%d,%d]: \n", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				if(matriz[linha][coluna] % 2 == 0) {
					System.out.printf("(%d)", matriz[linha][coluna]);
					totalPar++;
				} else
					System.out.println(matriz[linha][coluna]);
			}
		}
		
		System.out.printf("Total de pares: %d", totalPar);
	}

}
