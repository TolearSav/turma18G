package pacoteJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int totalDias, idadeDias, idadeAnos, idadeMeses;
		
		System.out.println("Digite sua idade em dias:");
		totalDias = ler.nextInt();
		
		idadeAnos = totalDias / 365;
		idadeMeses = (totalDias % 365) / 30;
		idadeDias = (totalDias % 365) % 30;
		
		System.out.println("Ano[s]:" + idadeAnos);
		System.out.println("Meses[s]:" + idadeMeses);
		System.out.println("Dias[s]:" + idadeDias);

	}

}
