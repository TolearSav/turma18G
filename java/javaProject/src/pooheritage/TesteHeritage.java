
package pooheritage;

public class TesteHeritage {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("J�ssica", 555);
		Funcionario pedro = new Funcionario("Pedro", 222, "TI");
		Pessoa maria = new Funcionario("Maria", 333, "Inform�tica - Desenvolvimento");
		Pessoa jose = new Coordenador("Jos�", 444, "Ci�ncia da Computa��o");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	}

}
