package Exercicios;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.printf("N�mero pares: %d. N�mero �mpares: %d", par, impar);
	}

}
