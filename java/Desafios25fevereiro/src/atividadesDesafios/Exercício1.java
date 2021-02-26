package atividadesDesafios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int maiorNumero = 0, contador;
		int numero[] = new int[3];
		
		for(contador = 0; contador < 3; contador++){
			System.out.println("Digite o " + (contador+1) +"o número:" );
			numero[contador] = ler.nextInt();
		
			if(numero[contador] > maiorNumero) {
				maiorNumero = numero[contador];
			
			}
		}	
		
		System.out.println("O maior número foi: " + maiorNumero);
	
			
		/*Scanner ler = new Scanner(System.in);
		
		int maiorNumero, numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número:" );
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo número:" );
		numero2 = ler.nextInt();
		System.out.println("Digite o terceiro número:" );
		numero3 = ler.nextInt();
		
			if(numero1 > numero2) {
				maiorNumero = numero1;
			}
			else if(numero1 > numero3) {
				maiorNumero = numero1;
			}
			else if(numero2 > numero1) {
				maiorNumero = numero2;
			} 
			else if(numero2 > numero3) {
				maiorNumero = numero2;
			}
			else if(numero3 > numero1) {
				maiorNumero = numero3;
			}  
			else { 
				maiorNumero = numero3;
			}
			
			System.out.println("O maior número é: " + maiorNumero); */
	}

}
