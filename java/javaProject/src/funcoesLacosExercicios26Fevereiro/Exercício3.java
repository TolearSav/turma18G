package funcoesLacosExercicios26Fevereiro;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, mais = 0, menos = 0;
		
		while(idade != -99) {
			System.out.println("Escreva sua idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) {
				menos++;
			} else if (idade > 50) {
				mais++;
			} else {
				
			}
			
		}
		System.out.printf("Pessoas com menos de 21 anos %d. ",(menos-1));
		System.out.printf("Pessoas com mais de 50 anos %d. ",mais);
	}

}
