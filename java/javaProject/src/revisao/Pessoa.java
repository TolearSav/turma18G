package revisao;

public class Pessoa {
	
	// Classe: pessoa.Terreno
	// Atributos: segurança. Material de construção
	// Construtores: como a classe abre, criar. Pedreiro
		// Sobrecarga de construtor. Pedreiros extra
	// Encapsulamente: getters and setters. Vigia, porteiro
	// Métodos: Talvez faça. Casa ou terreno com acabamento.
		//sobrecarga de métodos
	// Herança: a todo momento.
	
	//Acabamento:
	//override
	//polimorfismo
	//collections
	//interface
	
	private String nome;
	private int anoNasc;
	private boolean vivo;
	private char genero;
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, int anoNasc, char genero) {
		super();
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	//metodo
	public int idade() {
		return 2021 - anoNasc;
	}
	
	//metodo sobrecarga
	public int idade(int anoAtual) {
		return anoAtual - anoNasc;
		//if(anoNasc < anoAtual) {
		//	return;
		//	}
		}


}
