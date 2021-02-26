package atividadesDesafios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par. E a raiz quadrada é " + Math.sqrt(numero));
			
		} else {
			System.out.println("O número " + numero + " é impar. E sua elevação ao quadrado é " + Math.pow(numero, 2));
		}
		
		ler.close();

	}

}
