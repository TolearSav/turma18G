package exerciciosCollections;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void acao() {
		System.out.println("Sobe em àrvore");
	}
	
	@Override
	public void emiteSom() {
		System.out.println("ZzZzZzZzZ");
	}
	
}
