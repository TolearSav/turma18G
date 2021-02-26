package atividadesDesafios;

import java.util.Scanner;

public class Exercicio2Version3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
	
			System.out.println("Digite o primeiro número:");
			numero1 = ler.nextInt();
			System.out.println("Digite o segundo número:");
			numero2 = ler.nextInt();
			System.out.println("Digite o terceiro número:");
			numero3 = ler.nextInt();
			
			if(numero1 < numero2) {
				var aux = numero2;
				numero1 = numero2;
				numero2 = aux;		
			} 
			
			if(numero3 < numero2) {
				var aux = numero2;
				numero1 = numero2;
				numero2 = aux;		
			}
		System.out.println();
	}

}
