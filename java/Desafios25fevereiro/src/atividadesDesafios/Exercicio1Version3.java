package atividadesDesafios;

import java.util.Scanner;

public class Exercicio1Version3 {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			int maiorNumero = 0, contador;
			int numero[] = new int[3];
			
			for(contador = 0; contador < 3; contador++){
				System.out.println("Digite o " + (contador + 1) +"º número:");
				numero[contador] = ler.nextInt();
				
			}
			
			for(int x = 0; x < 3; x++) {
				
				for(contador = 0; contador < 3; contador++){
					if((contador+1) < 3) {
						if(numero[contador+1] > numero[contador]) {
							//maiorNumero = numero[contador];
							 var aux = numero[contador];
		                     numero[contador] = numero[contador + 1];
		                     numero[contador + 1] = aux;
						}
					}
				}
			}
			System.out.println(maiorNumero);
			for(contador = 0; contador < 3; contador++) {
				
		            if (contador == (3-1))
		            {
		                System.out.print(numero[contador]+".");
		            }
		            else
		            {
		                System.out.print(numero[contador]+", ");
		            }
		     }
		}
				
}

