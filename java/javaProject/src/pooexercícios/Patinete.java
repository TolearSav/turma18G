package pooexercícios;

public class Patinete {
	
	private String marca;
	private String modelo;
	private String cor;
	private String categoria;
	private double valor;
	
	void patinete() {
		
		System.out.printf("Marca: %s. Modelo: %s. Cor: %s. Categoria: %s. Valor: R$ %.2f", marca, modelo, cor, categoria, valor);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
