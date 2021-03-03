package pooexercícios;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		produto.setMarca("Samsung");
		produto.setModelo("Galaxy S10");
		produto.setCor("Preto");
		produto.setMemoria(16);
		produto.setValor(3790);
		
		produto.produto();
		
	}

}
