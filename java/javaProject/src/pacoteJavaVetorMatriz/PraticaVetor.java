package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[7];
		int totalPar = 0;
		
		for(int i = 0; i < 7; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = ler.nextInt();
        }
	
		
		for(int i = 0; i < 7; i++) {
			if(numeros[i] % 2 == 0) {
				totalPar++;
				System.out.printf("Valor par na posição: %d. \n", i+1);
			}
		}
		
		System.out.printf("Total de números pares: %d", totalPar+1);
		ler.close();
	}

}
