package pacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("0.00");
		
		double a, b, c, d, e, f, x, y;

		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
		System.out.println("Digite o valor de d: ");
		d = ler.nextDouble();
		System.out.println("Digite o valor de e: ");
		e = ler.nextDouble();
		System.out.println("Digite o valor de f: ");
		f = ler.nextDouble();

		x = ((a*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));

		System.out.println("Valor de x: " + forma.format(x));
		System.out.println("Valor de y: " + forma.format(y));
	}

}
