package pooexercícios;

public class Paciente {
	
	private String nome;
	private String cpf;
	private String consulta;
	private String medico;
	private String data;
	private String horario;
	
	void paciente () {
		System.out.printf("Nome: %s. CPF: %s. Especialidade: %s. Médico(a): %s. \nData: %s. Horário: %s.", nome, cpf, consulta, medico, data, horario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

}
