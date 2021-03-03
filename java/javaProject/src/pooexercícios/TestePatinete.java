package pooexercícios;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete patinete = new Patinete();
		
		patinete.setMarca("Bandeirante");
		patinete.setModelo("Skatenet Max 1531");
		patinete.setCor("Vinho");
		patinete.setCategoria("Infantil");
		patinete.setValor(299);
		
		patinete.patinete();
	}

}
