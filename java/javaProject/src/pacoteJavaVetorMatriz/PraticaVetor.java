package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[8];
		int totalPar = 0;
		
		for(int i = 1; i <= 7; i++) {
            System.out.println("Digite um n�mero: ");
            numeros[i] = ler.nextInt();
        }
	
		
		for(int i = 1; i <= 7; i++) {
			if(numeros[i] % 2 == 0) {
				totalPar++;
				System.out.printf("Valor par na posi��o: %d. \n", i);
			}
		}
		
		System.out.printf("Total de n�meros pares: %d", totalPar);
		ler.close();
	}

}
