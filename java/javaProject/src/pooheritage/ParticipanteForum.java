package pooheritage;

public class ParticipanteForum implements Leitor, Programador {
	
	String pensamento;
	
	public String lendo() {
		return "Forum";
	}
	
	public void pensando(char[] ideias)
	{
		pensamento = new String (ideias);
	}

	@Override
	public String digitando() {
		return pensamento;
	}
	
	public String aprendendo() {
		return "Java";
	}
	
	
}
