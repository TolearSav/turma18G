package introducao;

import java.util.Scanner;

public class LeitorDePensamento {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); 
		 
		 int erros = 7, tentativa = 0, palpite = 0;
	     int num = 0;
	     String opcao;
	     num = (int) (Math.random() * 15);
	     tentativa = 0;
	     erros = 7;

	        while (palpite != num && erros > 0) {

	            System.out.print("Adivinhe o n�mero: ");
	            palpite = scan.nextInt();

	            tentativa++;

	            if (num < palpite) {
	                erros--;
	                System.out.println("O n�mero � menor");
	            } else if (num > palpite) {
	                erros--;
	                System.out.println("O n�mero � maior");
	            }
	        }

	        if (palpite == num) {
	            System.out.println("Parab�ns! Voc� acertou o n�mero em " + tentativa + " tentativas. N�mero sorteado: " + num);
	        } else if (erros == 0) {
	            System.out.println("Voc� perdeu! O n�mero sorteado foi o " + num);
	   }
	}

}
