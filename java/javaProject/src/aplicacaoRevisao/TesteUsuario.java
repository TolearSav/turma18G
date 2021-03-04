package aplicacaoRevisao;

import java.util.Scanner;

import revisao.Aluno;
import revisao.Pessoa;

public class TesteUsuario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anoNascimento;
		char genero;
		
		Aluno aluno = new Aluno("Lu", 1);
		
		aluno.getAnoNasc();
		
		System.out.println("Digite o nome do amigo: ");
		nome = leia.next();
		Pessoa amigo = new Pessoa(nome);
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println("Digite M - masculino, F - feminino, O - outros: ");
		genero = leia.next().toUpperCase().charAt(0);
		
		Pessoa cliente = new Pessoa(nome, anoNascimento, genero); //instanciar
		
		System.out.println("O nome da amizade é: " + amigo.getNome());
		System.out.println("O nome do cliente é: " + cliente.getNome() + ". E seu ano de nascimento é: " + cliente.getAnoNasc());
		
		if(cliente.idade() >= 18) {
			System.out.println("Maior de idade");
			System.out.println("A idade é: " +cliente.idade(2050));
		} else
			System.out.println("Menor de idade");
			System.out.println("A idade é: " +cliente.idade(2050));
	}

}
