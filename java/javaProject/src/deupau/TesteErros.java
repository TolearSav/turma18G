package deupau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		String nomes[] = {"Jo�o", "Maria", "Pedro"};
		
		try {
		System.out.println("Digite o n�mero da posi��o do vetor [0-2]: ");
		numero = leia.nextInt();
		
		System.out.println("O nome escolhido foi: " + nomes[numero]);
		} catch (InputMismatchException dados) {
			
			System.out.println("Voc� digitou uma letra ao inv�s de n�mero!");
			dados.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException dados) {
			
			System.out.println("Aten��o: os valores precisam ser 0, 1 ou 2");
		}
		
		finally {
			System.out.println("Vai sempre acontecer");
		}
		System.out.println("Fim de programa!");
	}

}
