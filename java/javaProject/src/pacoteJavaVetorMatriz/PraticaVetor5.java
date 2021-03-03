package pacoteJavaVetorMatriz;

import java.util.Scanner;

public class PraticaVetor5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] nome = new String[3];
		double[] nota = new double[3];
		int c3;
		double soma = 0;
		
		cadastroGabarito();
		
		for(c3 = 1; c3 < 3; c3++) {
			System.out.println("Nome: ");
			nome[c3] = leia.next();
			nota[c3] = cadastroRespostas();
			soma = soma + nota[c3];
		}
		
		System.out.println("NOTAS FINAIS");
		
		for(c3 = 0; c3 < 3; c3++) {
			System.out.println((nome[c3]) + ": "+ (nota[c3]));
		}

	}
	
	public static void cadastroGabarito() {
		Scanner leia = new Scanner(System.in);
		
		String[] questaoGab = new String[5];
		int c1;
		
		for(c1 = 0; c1 < 5; c1++) {
			System.out.printf("Questão %d: ", c1+1);
			questaoGab[c1] = leia.next();
		}
	}
	public static double cadastroRespostas() {
		Scanner leia = new Scanner(System.in);
		String[] resposta = new String[5];
		String[] questaoGab = new String[5];
		double notaFinal = 0;
		
		for(int c = 0; c < 5; c++) {
			System.out.printf("Questão %d: ", c+1);
			resposta[c] = leia.next();
			if((resposta[c]) == (questaoGab[c])) {
				notaFinal = notaFinal + 2;
			}
		}
		
		return notaFinal;
	}
}

