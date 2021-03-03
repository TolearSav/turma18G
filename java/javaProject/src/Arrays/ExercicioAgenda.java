package Arrays;

import java.util.Scanner;

public class ExercicioAgenda {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String agenda[][] = new String[24][31];
		int dia = 0, hora = 0, opcao = 0, atividades = 0, linha = 0, coluna = 0;
		
		do {
            	System.out.println("Minha agenda");
            	System.out.println("Digite o numero do dia [1-31] ");
            	dia = leia.nextInt();
            	dia = dia -1;
            	System.out.println("Digite o numero da hora [0-23] ");
            	hora = leia.nextInt();
            	System.out.println("Digite sua anotacao: ");
            	agenda[hora][dia] = leia.next();
            	System.out.println("Deseja continuar? [1] - Sim / [0] - Não");
            	opcao = leia.nextInt();
            	}
            	while(opcao != 0);
            		for(linha = 0; linha < agenda.length; linha++) {
            			for(coluna = 0; coluna < agenda[linha].length; coluna++) {
            				if(agenda[linha][coluna] != null) {
            					System.out.println("Minhas anotações: dia "+ (coluna + 1) +" as "+ (linha) +"h : "+ agenda[linha][coluna]);
            					atividades++;
            			}
            		}	
            	}

			        System.out.println("Você tem "+ atividades +" atividades nesse mês.");
	}

}
