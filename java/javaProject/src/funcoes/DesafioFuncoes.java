package funcoes;

import java.util.Scanner;

public class DesafioFuncoes {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		linha(numero);
	}
	
	public static void linha(int numero) {
		
		for(int contador = 1; contador <= numero; contador++) {
			System.out.print("-");
		}
		
	}

}

