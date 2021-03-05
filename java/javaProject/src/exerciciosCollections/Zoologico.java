package exerciciosCollections;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Zoologico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Animal> lista = new ArrayList<>();
		
		
		System.out.print("Digite a quantidade de animais: ");
		int quantidade = leia.nextInt();
		char opcao;
		
		for(int x = 1; x <= quantidade; x++) {
			System.out.println("Animal "+x);
			
			do {
				System.out.println("Qual animal você quer? 1 - Cachorro. 2 - Cavalo. 3 - Preguiça");
				opcao = leia.next().charAt(0);
                
                if(opcao != '1' && opcao != '2' && opcao != '3') {
                	System.out.println("Opcao invalida!");
                }
            	
            } while(opcao != '1' && opcao != '2' && opcao != '3');
			
			
			System.out.println("Nome: ");
			String nome = leia.next();
			System.out.println("Idade: ");
			int idade = leia.nextInt();
				
			if(opcao == '1') {
				lista.add(new Cachorro(nome, idade));
			} else if(opcao == '2') {
				lista.add(new Cavalo(nome, idade));
			} else if(opcao == '3') {
				lista.add(new Preguica(nome, idade));
			}
			
		}

		System.out.println();
		System.out.println("Lista de animais escolhidos: ");
			for(Animal animal:lista) {
				System.out.println(animal.getNome() + " tem " + animal.getIdade() + " anos. Seu som é: ");
			
				animal.emiteSom();
				System.out.println(animal.getNome()+":");
				animal.acao();
		}

	}

}

