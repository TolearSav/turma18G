package atividadesDesafios;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int maiorNumero = 0, contador;
		int numero[] = new int[3];
		
		for(contador = 0; contador < 3; contador++){
			System.out.println("Digite o " + (contador+1) +"o n�mero:" );
			numero[contador] = ler.nextInt();
		
			if(numero[contador] > maiorNumero) {
				maiorNumero = numero[contador];
			
			}
		}	
		
		System.out.println("O maior n�mero foi: " + maiorNumero);
	
			
		/*Scanner ler = new Scanner(System.in);
		
		int maiorNumero, numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro n�mero:" );
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero:" );
		numero2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero:" );
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
			
			System.out.println("O maior n�mero �: " + maiorNumero); */
	}

}
