package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;   
		double soma = 0.00, contador = -1; //inicializado como -1 para evitar a contagem do 0 no loop final
		
		do
		{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero % 3 == 0) {
				soma = soma + numero; 
				contador++;
			}
		} 
		while (numero != 0);
		
		System.out.print((soma / contador));
	}

}
