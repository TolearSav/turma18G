package funcoes;

import java.util.Scanner;

public class TesteSenha {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int senha = 123;
		char opcao;
		
		do 
		{
			System.out.println("Digite seu nome:");
			nome = ler.next().toUpperCase();
			System.out.println("Digite a senha: ");
			senha = ler.nextInt();
			System.out.println("Continuar? 1 - sim ou 2 - nao");
			opcao = ler.next().charAt(0); 
		} while(opcao == '1');
			System.out.println("Fim do programa.");
	}
}
