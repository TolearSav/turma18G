package pacoteJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int meses, dias, idadeAnos, totalDias;
		
		System.out.println("Digite sua idade:");
		idadeAnos = ler.nextInt();
		System.out.println("Digite o total de meses passados após seu último aniversário:");
		meses = ler.nextInt();
		System.out.println("Digite o total de dias passados após seu último aniversário:");
		dias = ler.nextInt();
		
		totalDias = idadeAnos*365 + meses*30 + dias;
		
		System.out.printf("Você tem %d",  totalDias, " dias de vida.");

	}

}
