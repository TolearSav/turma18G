package funcoesLacosExercicios26Fevereiro;

import java.util.Scanner;

public class TesteLa�os {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		char genero;
		
		System.out.println("Digite seu nome: ");
		nome = ler.next().toUpperCase();
		System.out.println("Digite seu g�nero (M/F/O):");
		genero = ler.next().toUpperCase().charAt(0);
		
		while(genero != 'M' && genero != 'F' && genero != 'O') {
			System.out.println("Voc� digitou errado! Tente de novo: M/F/O");
			genero = ler.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Fim do programa.");
	}

}
