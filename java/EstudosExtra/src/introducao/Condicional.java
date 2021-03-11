package introducao;

import java.util.Scanner;

class Condicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, anoAtual = 2021, anoNascimento = 0;
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		idade = anoAtual - anoNascimento;
		
		System.out.println("Sua idade é: " + idade);
		
		if(idade < 16) {
			System.out.println("Não pode votar.");
		} else if ((idade >= 16 && idade <= 18) || (idade > 70)) {
			System.out.println("Voto opcional.");
		} else {
			System.out.println("Voto obrigatório.");
		}
		
	}

}
