package funcoes;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0; 
		double media = 0.00; 
		
		do
		{
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			if(numero % 3 == 0) {
				media = (media + numero) / numero;
			}
		} 
		while (numero != 0); {
			System.out.printf("A m�dia dos n�meros �: %f", media);
		}

	}

}
