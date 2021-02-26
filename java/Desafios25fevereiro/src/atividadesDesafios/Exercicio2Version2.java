package atividadesDesafios;

import java.util.Scanner;

public class Exercicio2Version2 {

	public static void main(String[] args) {
		
		        double[] numeros = new double[3];

		        Scanner s = new Scanner(System.in);

		        System.out.println("Exercício 2");

		        for(int i = 0; i < 3; i++)
		        {
		            System.out.print("Digite o "+(i + 1)+"º número: ");
		            numeros[i] = s.nextDouble();
		        }

		        for(int x = 0; x < 3; x++)
		        {
		            for(int i = 0; i < 3; i++)
		            {
		                if((i + 1) < 3)
		                {
		                    if(numeros[i + 1] < numeros[i]) 
		                    {
		                        var aux = numeros[i];
		                        numeros[i] = numeros[i + 1];
		                        numeros[i + 1] = aux;
		                    }
		                }
		            }
		        }

		        System.out.println("Em ordem crescente os números inseridos são: ");
		        for(int i = 0; i < 3; i++) 
		        {
		            if (i == (3-1))
		            {
		                System.out.print(numeros[i]+".");
		            }
		            else
		            {
		                System.out.print(numeros[i]+", ");
		            }
		        }
		    }
		}