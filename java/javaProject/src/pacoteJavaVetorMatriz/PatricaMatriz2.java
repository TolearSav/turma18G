package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PatricaMatriz2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matrizIdentidade = new int[3][3];
		int i, j;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				if(i == j) {
					matrizIdentidade[i][j] = 1;
				} else
					matrizIdentidade[i][j] = 0;
			}
		}
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.println(matrizIdentidade[i][j]);
			}
		}
	}

}
