package pooexercícios;

public class TesteCliente {
	
	public static void main(String[] args) {

		Cliente luana = new Cliente();
		
		luana.setNome("Luana Savian");
		luana.setCpf("000.000.000-00");
		luana.setProfissao("Professora de Inglês");
		
		System.out.println(luana.getNome());
		System.out.println(luana.getCpf());
		System.out.println(luana.getProfissao());
	
	}
}
