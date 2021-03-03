package pooexercícios;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.setTitular("Luana Savian");
		conta.setAgencia(10);
		conta.setNumero(1110);
		conta.deposita(100);
		conta.getSaldo();
		
		conta.conta();
	}

}
