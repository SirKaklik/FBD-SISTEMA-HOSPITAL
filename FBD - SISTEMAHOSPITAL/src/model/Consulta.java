package model;

public class Consulta {

	private int id;
	private String tipo, id_paciente;
	
	
	
	public Consulta(int id) {
		super();
		this.id = id;
	}

	public Consulta(String tipo, String id_paciente) {
		super();
		this.tipo = tipo;
		this.id_paciente = id_paciente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getId() {
		return id;
	}
	
	
}
