package introducao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pernas;
		String tipo;
		
		System.out.println("Insira a quantidade de pernas: ");
		pernas = leia.nextInt();
		switch(pernas) {
			case 1:
				tipo = "Saci";
				break;
			case 2:
				tipo = "B�pede";
				break;
			case 3:
				tipo = "Trip�";
				break;
			case 4:
				tipo = "Quadr�pede";
				break;
			case 6,8:
				tipo = "Inseto aaa";
				break;
			default:
				tipo = "Alien�gena";
		}
		
		System.out.println(tipo);
	}

}
