package funcoesLacosExercicios26Fevereiro;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 1,  soma = 0;
		
		do
		{
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			soma = soma + numero;
		} 
		while (numero != 0); {
			System.out.printf("A soma dos n�meros �: %d", soma);
		}
		leia.close();
	}

}
