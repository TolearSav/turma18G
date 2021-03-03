package pooexercícios;

public class ProdutoEletronico {
	
	private String marca;
	private String cor;
	private String modelo;
	private int memoria;
	private double valor;
	
	void produto() {
		System.out.println("Fabricante: " +this.marca+ ". Modelo: " + this.modelo + ". Cor: " + this.cor + 
				".\nCapacidade de armazenamento: " + this.memoria+ " GB. Valor: R$" + this.valor);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}	
