package deupau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		String nomes[] = {"João", "Maria", "Pedro"};
		
		try {
		System.out.println("Digite o número da posição do vetor [0-2]: ");
		numero = leia.nextInt();
		
		System.out.println("O nome escolhido foi: " + nomes[numero]);
		} catch (InputMismatchException dados) {
			
			System.out.println("Você digitou uma letra ao invés de número!");
			dados.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException dados) {
			
			System.out.println("Atenção: os valores precisam ser 0, 1 ou 2");
		}
		
		finally {
			System.out.println("Vai sempre acontecer");
		}
		System.out.println("Fim de programa!");
	}

}
