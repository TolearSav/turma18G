package pacoteJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("0.00");
		
		double custoDeFabrica, custoAoConsumidor, porcentagem;

		System.out.println("Insira o custo de fábrica: ");
		custoDeFabrica = ler.nextDouble();
	
		porcentagem = (custoDeFabrica*0.28) + (custoDeFabrica*0.45); 
		custoAoConsumidor = custoDeFabrica + porcentagem;
	
	
		System.out.println("O custo ao consumidor é de: " + forma.format(custoAoConsumidor) + " reais.");
	
		}

}
