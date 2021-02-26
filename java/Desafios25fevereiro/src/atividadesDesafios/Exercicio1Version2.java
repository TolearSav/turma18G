package atividadesDesafios;

import java.util.Scanner;

public class Exercicio1Version2 {
	
	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);

        int number1, number2, number3; 

        System.out.println("Digite o primeiro numero: ");
        number1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        number2 = ler.nextInt();

        System.out.println("Digite o terceiro");
        number3 = ler.nextInt();

        if((number1 > number2 ) && (number1 > number3)){
        System.out.printf("O Primeiro maior %d ", number1);


        }else if(((number2 > number1 ) && (number2 > number3))){
            System.out.printf(" O segundo maior %d ", number2);


        }else/* if(((number3 > number1 ) && (number3 > number2)))*/{
            System.out.printf(" O segundo maior %d ", number3);

        }
    }

}
