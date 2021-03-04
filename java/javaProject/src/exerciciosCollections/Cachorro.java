package exerciciosCollections;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void acao() {
		System.out.println("Corre");
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Auau");
	}

}
