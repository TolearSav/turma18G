package atividadesDesafios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for(int contador = 0; contador < 3; contador++) {
			System.out.println("Digite o " + (contador+1) + "º número: ");
			numeros[contador] = ler.nextInt();
		}
		
		 for(int x = 0; x < 3; x++){	
			for(int contador = 0; contador < 3; contador++) {
				if ((contador + 1) < 3)
				if(numeros[contador+1] < numeros[contador]) {
					var aux = numeros[contador];
					numeros[contador] = numeros[contador+1];
					 numeros[contador + 1] = aux;
				}
			}
			
			for(int contador = 0; contador < 3; contador++) {
				if(contador == (3-1)) {
					System.out.println(numeros[contador]);
				} else{
					System.out.print(numeros[contador]);
				}
				
			}
		 }
		

	}

}
