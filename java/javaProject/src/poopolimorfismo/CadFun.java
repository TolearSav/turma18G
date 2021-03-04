package poopolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Locale;

public class CadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcion�rios na lista: ");
		int quantidade = leia.nextInt();
		
	
			
		for(int x = 1; x <= quantidade; x++) {
			System.out.println("Funcion�rio: "+x);	
			System.out.println("1 - Funcion�rio ou 2 - Terceiro: ");
			char tipo = leia.next().charAt(0);
			System.out.println("Nome: ");
			String nome = leia.next();
			System.out.println("Matr�cula: ");
			int matricula = leia.nextInt();
			System.out.println("Horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = leia.nextDouble();
			
			
			
			if(tipo == 2) {
				System.out.println("Valor do adicional: R$ ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome, matricula, horasTrabalhadas, valorPorHora, adicional));
			} else {
				lista.add(new Funcionario(nome, matricula, horasTrabalhadas, valorPorHora));
			}
			
		}
		System.out.println();
			System.out.println("Pagamento de sal�rios: ");
		for (Funcionario fun : lista) {
			System.out.println(fun.getNome() + " seu sal�rio � R$ "+ fun.salario());
		}
		
		/*//teste de programador
		Funcionario colaborador1 = new Funcionario("Carlos", 1, 10, 15.25);
		Terceiro colaborador2 = new Terceiro("Joana", 45, 10, 15.25, 50);
		
		System.out.println("O sal�rio de "+colaborador1.getNome()+ " � R$ "+colaborador1.salario());
		System.out.println("O sal�rio de "+colaborador2.getNome()+ " � R$ "+colaborador2.salario());*/
	}

}
