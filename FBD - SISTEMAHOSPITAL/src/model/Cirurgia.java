package model;

import java.sql.Date;

public class Cirurgia {

	private String tipo;
	private Date dataCirurgia;
	private int id_paciente;
	private int id;
	
	public Cirurgia(String tipo, Date dataCirurgia, int id_paciente) {
		super();
		this.tipo = tipo;
		this.dataCirurgia = dataCirurgia;
		this.id_paciente = id_paciente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataCirurgia() {
		return dataCirurgia;
	}

	public void setDataCirurgia(Date dataCirurgia) {
		this.dataCirurgia = dataCirurgia;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getId() {
		return id;
	}
	
	
	
	
}
