package pooexercícios;

public class ContaBancaria {
	private String titular;
	private double saldo;
	private int agencia;
	private int numero;
	
	void conta () {
	System.out.printf("Titular: %s. Agência: %d; Número: %d. Saldo: R$ %.2f.", titular, agencia, numero, saldo);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não é aceito um valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não é aceito um valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
}
