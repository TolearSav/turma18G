package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] nome = new String[4];
		double[] nota = new double[4];
		int c3;
		double soma = 0;
		
		cadastroGabarito();
		
		for(c3 = 1; c3 < 4; c3++) {
			System.out.println("Nome: ");
			nome[c3] = leia.next();
			nota[c3] = cadastroRespostas();
			soma = soma + nota[c3];
		}
		
		System.out.println("NOTAS FINAIS");
		
		for(c3 = 1; c3 < 4; c3++) {
			System.out.println((nome[c3]) + ": "+ (nota[c3]));
		}

	}
	
	public static void cadastroGabarito() {
		Scanner leia = new Scanner(System.in);
		
		String[] questaoGab = new String[6];
		int c1;
		
		for(c1 = 1; c1 < 6; c1++) {
			System.out.printf("Questão %d: ", c1);
			questaoGab[c1] = leia.next();
		}
	}
	public static double cadastroRespostas() {
		Scanner leia = new Scanner(System.in);
		String[] resposta = new String[6];
		String[] questaoGab = new String[6];
		double notaFinal = 0;
		
		for(int c = 1; c < 6; c++) {
			System.out.printf("Questão %d: ", c);
			resposta[c] = leia.next();
			if((resposta[c]) == (questaoGab[c])) {
				notaFinal = notaFinal + 2;
			}
		}
		
		return notaFinal;
	}
}

