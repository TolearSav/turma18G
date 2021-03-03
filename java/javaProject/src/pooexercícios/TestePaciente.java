package pooexercícios;

public class TestePaciente {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		
		paciente.setNome("Luana Savian");
		paciente.setCpf("111.111.111-11");
		paciente.setConsulta("Ortopedia");
		paciente.setMedico("Regina Reginalda");
		paciente.setData("26.03.2021");
		paciente.setHorario("17:30");
		
		paciente.paciente();

	}

}
