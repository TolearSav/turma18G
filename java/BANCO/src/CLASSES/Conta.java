package CLASSES;

public class Conta {
	
	//Atributos da classe
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	
	//construtor
	
	public Conta(int numero, String cpf, boolean ativa) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	
	public Conta(int numero) {
			super();
			this.numero = numero;
		}
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//metodos
	
	public void debito(double valorDebito) {
		if(this.saldo >= valorDebito) {
			this.saldo = this.saldo - valorDebito;
		} else 
			System.out.println("Saldo insuficiente.");
		}
	
	public void credito(double valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}

}
