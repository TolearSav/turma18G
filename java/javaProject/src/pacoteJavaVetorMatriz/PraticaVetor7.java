package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String[] nome = new String[4];
		int cont1;
			
			for(cont1 = 0; cont1 < 4; cont1++) {
				System.out.println("Digite o nome: ");
				nome[cont1] = leia.next();
			}
			for(cont1 = 0; cont1 < 4; cont1++) {
			System.out.println(cont1 + ": " + nome[cont1]);
			}
	}
}
