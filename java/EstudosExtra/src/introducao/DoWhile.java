package introducao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n, s = 0;
		char opcao;
		
		do {
			System.out.println("Numero");
			n = leia.nextInt();
			s += n;
			System.out.println("Quer continuar? S/N");
			opcao = leia.next().toUpperCase().charAt(0);
		} while(opcao != 'N');
		
		System.out.println(s);
		
		//for(int cc = 0;cc <= 15;cc += 2);
		//for(int cc = 15;cc >= 5;cc -= 2);
		//System.out.println(cc);
	}

}
