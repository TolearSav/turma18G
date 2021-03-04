package poopolimorfismo;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("João", "Java", 6.8);
		Aluno b = new Aluno("Maria", "Liux", 7.8);
		Aluno c = new Aluno("Renata", "SO", 8.8);
		Aluno d = new Aluno("José", "PHP", 9.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		

	}

}