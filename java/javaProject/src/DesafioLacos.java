import java.util.Scanner;

public class DesafioLacos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, maiorNumero = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um n�mero inteiro: ");
			numero = leia.nextInt();
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}	
		}
	System.out.printf("O maior n�mero digitado foi: %d ", maiorNumero);
	}

}
