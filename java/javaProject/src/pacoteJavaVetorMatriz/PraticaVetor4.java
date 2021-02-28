package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] time = new String[4];
		int cont1, cont2;
		
		for(cont1 = 1; cont1 < 4; cont1++) {
			System.out.println("Digite o nome do time: ");
			time[cont1] = leia.next();
		}
		
		for(cont1 = 1; cont1 < 4; cont1++) {
			for(cont2 = 1; cont2 < 4; cont2++) {
				if(cont1 != cont2) {
				System.out.println((time[cont1]) + " [] x [] " + (time[cont2]));
				}
			}
		}
	}
}
