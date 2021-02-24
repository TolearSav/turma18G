package pacoteJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int horas, minutos, segundos, totalSegundos;
		
		System.out.println("Digite o total de segundos do evento:");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("Horas: %d. Minutos: %d. Segundos: %d.", horas, minutos, segundos);

	}

}
