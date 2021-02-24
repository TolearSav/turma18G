package pacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("0.00");
		
		double nota1, nota2, nota3, mediaFinal;

		System.out.println("Insira a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Insira a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Insira a terceira nota: ");
		nota3 = ler.nextDouble();

		mediaFinal = (nota1 + nota2 + nota3) /3;
		System.out.println("\nA média final é: " + forma.format(mediaFinal));

	}
}
