package exerciciosCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {	
		Scanner leia = new Scanner(System.in);
		Collection<String> lista = new ArrayList<>();
		
		char opcao, opcao2, opcao3;
		String nome = "";
		String quantidade = "";
		int x;
		
		System.out.println("Deseja adicionar um produto? S/N");
			opcao = leia.next().toUpperCase().charAt(0);
		if(opcao != 'N') {
			for (x=0; x > -1; x++) {
				System.out.println("Digite o nome do produto a ser adicionado: ");
				nome = leia.next();
				lista.add(nome);
				System.out.println("Deseja remover o produto? S/N?");
				opcao2 = leia.next().toUpperCase().charAt(0);
				if(opcao2 != 'N') {
					lista.remove(nome);
					x--;
				} else {
					System.out.println("Qual a quantidade disponível do produto adicionado?");
					quantidade = leia.next();
					lista.add(quantidade);
				}
				System.out.println("Deseja adicionar um novo produto? S/N");
				opcao3 = leia.next().toUpperCase().charAt(0);
				if(opcao3 != 'S') {
					break;
				}
			}
		}
		System.out.println("Lista de produtos adicionados e suas respectivas quantidades: " + lista + quantidade);
	}

}
