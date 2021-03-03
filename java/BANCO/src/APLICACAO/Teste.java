package APLICACAO;

import java.util.Scanner;
import CLASSES.Conta;
public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta conta1 = new Conta(1, "111.111.111-11");
		Conta conta2 = new Conta(345, "000.000.000-11", true);
		double valor;
		char opcao;
		
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Débito ou crédito? D/C ");
		opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'D') {
			conta2.debito(valor);
		} else if (opcao == 'C') {
			conta2.credito(valor);
		} else
			System.out.println("Opção inválida!");
		
		conta2.credito(100);
		conta2.debito(45.25);
	}
}
