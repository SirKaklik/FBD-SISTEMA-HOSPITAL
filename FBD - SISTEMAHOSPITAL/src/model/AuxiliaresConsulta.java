package model;

public class AuxiliaresConsulta {

	private Integer id;
	private String consultaID, AuxiliarID;
	
	public AuxiliaresConsulta(String consultaID, String auxiliarID) {
		super();
		this.consultaID = consultaID;
		AuxiliarID = auxiliarID;
	}

	public Integer getId() {
		return id;
	}

	public String getConsultaID() {
		return consultaID;
	}

	public String getAuxiliarID() {
		return AuxiliarID;
	}
	
	
}
