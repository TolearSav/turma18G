package Arrays;

import java.util.Random;

public class VetorVogais {

	public static void main(String[] args) {
		
		Random letra = new Random();
		String vogais[] = {"A", "E", "I", "O", "U"};
		int teste = 0;
		
		System.out.println("Randomizando as vogais...");
		
		for(int x = 0; x < 5; x++) {
			teste = letra.nextInt(5); //gambiarra
			System.out.println(vogais[teste]);
		}
	}

}
