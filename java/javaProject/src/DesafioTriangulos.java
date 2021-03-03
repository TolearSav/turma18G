

import java.util.Scanner;

import POO.Triangulo;

public class DesafioTriangulos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Triangulo T3 = new Triangulo();
		Triangulo T4 = new Triangulo();
		double maior = 0, a1 = 0, a2 = 0, a3 = 0, b1 = 0, b2 = 0, b3 = 0, h1 = 0, h2 = 0, h3 = 0;
		
		
		System.out.println("Insira a base do triângulo 1: ");
		b1 = leia.nextInt();
		System.out.println("Insira a base do triângulo 2: ");
		b2 = leia.nextInt();
		System.out.println("Insira a base do triângulo 3: ");
		b3 = leia.nextInt();
		
		System.out.println("Insira a altura do triângulo 1: ");
		h1 = leia.nextDouble();
		System.out.println("Insira a altura do triângulo 2: ");
		h2 = leia.nextDouble();
		System.out.println("Insira a altura do triângulo 3: ");
		h3 = leia.nextDouble();
		
		a1 = (b1 * h1)/2;
		a2 = (b2 * h2)/2;
		a3 = (b3 * h3)/2;
		
		if(a1 > a2 && a1 > a3) {
			maior = a1;
		} else if(a2 > a1 && a2 > a3) {
			maior = a2;
		} else if(a3 > a1 && a3 > a2) {
			maior = a3;
		}
		
		System.out.printf("A área do triângulo 1 é: %.2f \n", a1);
		System.out.printf("A área do triângulo 2 é: %.2f \n", a2);
		System.out.printf("A área do triângulo 3 é: %.2f \n", a3);
		System.out.printf("A maior área é: %.2f", maior);
	}

}
