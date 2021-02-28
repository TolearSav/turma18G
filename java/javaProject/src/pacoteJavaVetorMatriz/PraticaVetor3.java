package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int[4];
		int contador1, contador2, auxiliar;
		
		for(contador1 = 0; contador1 < 4; contador1++) {
			System.out.println("Digite um valor: ");
			vetor[contador1] = leia.nextInt();
		}
		
		for(contador1 = 0; contador1 < 3; contador1++) {
			for(contador2 = contador1 + 1; contador2 < 4; contador2++) {
				if(vetor[contador1] > vetor[contador2]) {
					auxiliar = vetor[contador1];
					vetor[contador1] = vetor[contador2];
					vetor[contador2] = auxiliar;
				}
			}
		}
		
		for(contador1 = 0; contador1 < 4; contador1++) {
		System.out.println("(" + vetor[contador1] + ")");
		}
		leia.close();
	}

}
