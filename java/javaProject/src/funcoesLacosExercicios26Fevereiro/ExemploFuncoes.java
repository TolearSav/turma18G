package funcoesLacosExercicios26Fevereiro;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFuncoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //instanciei o tipo de layout, esse define os padros do teclado/tela americano
		Scanner ler = new Scanner(System.in); //instanciar
		
		int numero;
		String nome;
		char genero;
		String tratamento;
		
		System.out.println("Digite seu nome: ");
		nome = ler.next().toUpperCase();
		System.out.println("Digite seu gênero (M/F/O):");
		genero = ler.next().toUpperCase().charAt(0);
		
		tratamento = tipo(genero);
		System.out.printf("Bom dia, %s %s, este é um teste de retorno\n", tratamento, nome);
		System.out.println("Digite um número inteiro positivo: ");
		numero = ler.nextInt();
		parImpar(numero);
		System.out.printf("A raiz quadrada do número é %.2f", raiz(numero));
		
		pula();
		
		System.out.println("---------------");

	}
	public static double raiz(double numero) {
		return Math.sqrt(numero);
	}
	public static String tipo(char genero) {
		String vocativo = "";
		
		if(genero == 'M') {
			vocativo = "Sr.";
		} else if(genero == 'F') {
			vocativo = "Sra."; 
		} else if(genero == 'O') {
			vocativo = "Sre.";
		} else {
			vocativo = "N/D";
		}
		return vocativo;
	}
	
	public static void pula() {
		System.out.println();
	}
	
	public static void parImpar(int numero) {
		if(numero % 2 == 0) {
			System.out.printf("O número %d é par!", numero);
			pula();
		} else {
			System.out.printf("O número %d é impar!", numero);
			pula();
		}
	}

}
