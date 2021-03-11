package poopolimorfismo;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	 public static void main(String[] args) {
		
		 Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		 Aluno a = new Aluno("Jo�o", "Java", 6.8);
		 Aluno b = new Aluno("Maria", "Liux", 7.8);
		 Aluno c = new Aluno("Renata", "SO", 8.8);
		 Aluno d = new Aluno("Jos�", "PHP", 9.8);
		 
		 mapa.put("Jo�o", a);
		 mapa.put("Maria", b);
		 mapa.put("Renata", c);
		 mapa.put("Jos�", d);
		 
		 System.out.println(mapa);
		 System.out.println(mapa.get("Renata"));
		 
		 Collection<Aluno> alunos = mapa.values();
		 for(Aluno e:alunos) {
			 System.out.println(e);
		 }
	}
}
