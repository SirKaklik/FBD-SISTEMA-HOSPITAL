package model;

public class Transferencia {
	
	private int id;
	private String local;
	
	public Transferencia(String local) {
		super();
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getId() {
		return id;
	}
	
	
}
