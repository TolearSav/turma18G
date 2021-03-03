package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
		  	int N1[][] = new int[4][6];
	        int N2[][] = new int[4][6];
	        int M1[][] = new int[4][6];
	        int M2[][] = new int[4][6];

	        Random dados = new Random();
	        final int LINHA=4, COLUNA=6;
	        int lin=0, col=0;

	        for (lin = 0; lin<LINHA; lin++) {
	            for (col = 0; col<COLUNA; col++) {
	                N1[lin][col]=dados.nextInt(9)+1;
	                N2[lin][col]=dados.nextInt(9)+1;
	                M1[lin][col]= N1[lin][col]+N2[lin][col];
	                M2[lin][col]= N1[lin][col]-N2[lin][col];

	            }
	        }

		     System.out.println("DADOS DE N1:");
	
		     imprimirMatriz(N1);
		     
		     System.out.println();
		     System.out.println("DADOS DE N2:");
	
		     imprimirMatriz(N2);
		     
		     System.out.println();
		     System.out.println("DADOS DE M1:");
		     
		     imprimirMatriz(M1);
		     
		     System.out.println();
		     System.out.println("DADOS DE M2:");
		     
		     imprimirMatriz(M2);

	       	    }
		public static void imprimirMatriz(int matriz[][]) {
			 final int LINHA=4, COLUNA=6;
			 for (int lin = 0; lin<LINHA; lin++)   {
		            for ( int col = 0; col<COLUNA; col++) {
		                System.out.print(matriz[lin][col]+" "); //tab = \t

		            }
		            System.out.println();
		        }

		}
	}