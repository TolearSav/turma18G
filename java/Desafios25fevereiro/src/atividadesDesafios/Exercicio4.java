package atividadesDesafios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par. E a raiz quadrada � " + Math.sqrt(numero));
			
		} else {
			System.out.println("O n�mero " + numero + " � impar. E sua eleva��o ao quadrado � " + Math.pow(numero, 2));
		}
		
		ler.close();

	}

}
