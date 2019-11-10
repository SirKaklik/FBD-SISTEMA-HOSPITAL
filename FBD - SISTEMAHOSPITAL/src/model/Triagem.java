package model;

public class Triagem {
	private String problema, alergias, tipoSang;
	private int prioridade, id;
	
	
	
	public Triagem(int id) {
		super();
		this.id = id;
	}

	public Triagem(String problema, String alergias, String tipoSang, int prioridade) {
		super();
		this.problema = problema;
		this.alergias = alergias;
		this.tipoSang = tipoSang;
		this.prioridade = prioridade;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getTipoSang() {
		return tipoSang;
	}

	public void setTipoSang(String tipoSang) {
		this.tipoSang = tipoSang;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getId() {
		return id;
	}
	
	
}
