package pacoteJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int meses, dias, idadeAnos, totalDias;
		
		System.out.println("Digite sua idade:");
		idadeAnos = ler.nextInt();
		System.out.println("Digite o total de meses passados ap�s seu �ltimo anivers�rio:");
		meses = ler.nextInt();
		System.out.println("Digite o total de dias passados ap�s seu �ltimo anivers�rio:");
		dias = ler.nextInt();
		
		totalDias = idadeAnos*365 + meses*30 + dias;
		
		System.out.printf("Voc� tem %d",  totalDias, " dias de vida.");

	}

}
