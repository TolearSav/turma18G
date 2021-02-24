package pacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("0.00");
		
		double A, B, C, R, S, D;

		System.out.println("Digite o valor de A:");
		A = ler.nextDouble();
		System.out.println("Digite o valor de B:");
		B = ler.nextDouble();
		System.out.println("Digite o valor de C:");
		C = ler.nextDouble();

		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);

		D = (R + S) / 2;

		System.out.println("D é igual a: " + forma.format(D));
		
	}

}
